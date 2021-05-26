package com.service.classManagerServiceImpl;

import com.dao.ClassManagerDao;
import com.dao.CourseManagerDao;
import com.service.ClassManagerService;
import com.vo.classManagerVo.ClassManagerVo;
import com.vo.classManagerVo.SelectClassManagerInfoByType;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;

@Service
public class ClassManagerServiceImp implements ClassManagerService {

    @Resource
    ClassManagerDao classManagerDao;

    @Override
    public List<ClassManagerVo> getAllClassManagerList(SelectClassManagerInfoByType selectClassManagerInfoByType) {
        List<ClassManagerVo> list = classManagerDao.getAllClassManagerInfo(selectClassManagerInfoByType);
        return list;
    }

    @Override
    public List<String> getAbleTeacherNameInfo(String deptName) {
        List<String> list = classManagerDao.getAbleTeacherNameList(deptName);
        return list;
    }

    @Override
    public List<String> getMajorListByYearInfo(String deptName, String year) {
        List<String> list = classManagerDao.getMajorListByYear(deptName, year);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String x = it.next();
            if (x.equals(deptName)) {
                it.remove();
            }
        }
        return list;
    }

    @Override
    public Integer addClassManagerInfo(ClassManagerVo classManagerVo) {
        System.out.println(classManagerVo);
        Integer result = null;
        Integer number = classManagerDao.getClassNumberByMajor(classManagerVo.getMajorName(), classManagerVo.getYear());
        System.out.println(number);
        if (number >= 9) {
            result = -1;
            return result;
        }
        String majorId = classManagerDao.getMajorIdByName(classManagerVo.getMajorName());
        boolean statue = true;
        Integer currentIndex = 0;
        String strId = "";
        while (statue) {
            currentIndex++;
            strId = currentIndex + "";
            String studentName = classManagerDao.getClassNameByClassId(classManagerVo.getYear() + majorId + strId);
            if (studentName == null) {
                statue = false;
            }
        }
        classManagerVo.setClassName(classManagerVo.getMajorName() + currentIndex + '班');
        classManagerVo.setClassId(classManagerVo.getYear() + majorId + strId);
        result = classManagerDao.addClassManagerInfo(classManagerVo);
        return result;
    }

    @Override
    public Integer removeClassManagerInfo(List<String> list) {
        Integer statue = classManagerDao.removeClassNumber(list);
        return statue;
    }

    @Override
    public Integer modifyClassManagerInfo(ClassManagerVo classManagerVo) {
        Integer result = null;
       Integer studentNumber =  classManagerDao.getClassNumbers(classManagerVo.getClassId(),classManagerVo.getYear());

       if (studentNumber > classManagerVo.getMaxStudents()){
           result = -1;
           return result;
       }
       result= classManagerDao.modifyClassManager(classManagerVo);
       return result;
    }
}
