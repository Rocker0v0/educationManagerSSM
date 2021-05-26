package com.service.studentMangerServiceImp;

import com.dao.StudentManagerDao;
import com.service.StudentMangerService;
import com.vo.studentInfoManager.SelectStudentInfoByTypeVo;
import com.vo.studentInfoManager.StudentInfoMangerVo;
import com.vo.studentInfoManager.TwoStudentInfoManagerVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentMangerServiceImpl implements StudentMangerService {

    @Resource
    private StudentManagerDao studentManagerDao;
    @Override
    public List<StudentInfoMangerVo> getStudentList(SelectStudentInfoByTypeVo selectStudentInfoByTypeVo) {
        List<StudentInfoMangerVo> list =  studentManagerDao.getStudentInfo(selectStudentInfoByTypeVo);
        return list;
    }

    @Override
    public Integer addStudentList(StudentInfoMangerVo studentInfoMangerVo) {
      List<String> studentIdList = studentManagerDao.getStudentIdListByName(studentInfoMangerVo.getStudentName());
      Integer relStatue = null;
      if (studentIdList.size()!=0){
          relStatue = -1;
          return relStatue;
      }
//        获取班级编号
        String classId = studentManagerDao.getClassId(studentInfoMangerVo.getClassName(),studentInfoMangerVo.getYear());
//        获取班级有多少个学生
        boolean statue = true;
        Integer currentIndex = 0;
        String strId = "";
        while(statue){
            currentIndex++;
            if(currentIndex<10){
                strId = "0"+currentIndex;
            }else{
                strId = currentIndex+"";
            }
         String studentName =  studentManagerDao.getStudentNameById(classId+strId);
            if (studentName == null){
                statue = false;
            }
        }
//        生成学号
        String studentId = classId+strId;
//        添加学生
        studentInfoMangerVo.setStudentId(studentId);
        System.out.println(studentId);
      Integer index =  studentManagerDao.addStudentInfo(studentInfoMangerVo);
      List<Integer> list = studentManagerDao.getScIdList(studentInfoMangerVo.getClassName(),studentInfoMangerVo.getYear());
      for(Integer item: list){
          studentManagerDao.addScByID(studentId,item);
      }
//        为该学生选课
        relStatue = 200;
        return relStatue;
    }

    @Override
    public Integer removeStudentList(List<String> list) {
        studentManagerDao.removeStudentByStudentId(list);
        return 200;
    }

    @Override
    public Integer modifyStudentList(TwoStudentInfoManagerVo twoStudentInfoManagerVo) {

        if (twoStudentInfoManagerVo.getNewStudentInfoMangerVo().equals(twoStudentInfoManagerVo.getOldStudentInfoMangerVo())){
            return -1;
        }

        if (twoStudentInfoManagerVo.getNewStudentInfoMangerVo().getYear().equals(twoStudentInfoManagerVo.getOldStudentInfoMangerVo().getYear())){
            if (twoStudentInfoManagerVo.getNewStudentInfoMangerVo().getClassName().equals(twoStudentInfoManagerVo.getOldStudentInfoMangerVo().getClassName())){
                //修改
                studentManagerDao.updateStudentInfo(twoStudentInfoManagerVo.getNewStudentInfoMangerVo());
            }else{
                //删除
                List<String> list = new ArrayList<>();
                list.add(twoStudentInfoManagerVo.getOldStudentInfoMangerVo().getStudentId());
                Integer items =  studentManagerDao.removeStudentByStudentId(list);
                if (items!=0){
                    this.addStudentList(twoStudentInfoManagerVo.getNewStudentInfoMangerVo());
                }
                //添加
            }
        }else{
            List<String> list = new ArrayList<>();
            list.add(twoStudentInfoManagerVo.getOldStudentInfoMangerVo().getStudentId());
            Integer items =  studentManagerDao.removeStudentByStudentId(list);
            if (items!=0){
                this.addStudentList(twoStudentInfoManagerVo.getNewStudentInfoMangerVo());
            }
        }
        return 200;
    }

    @Override
    public List<String> getClassNameInfoByMaxNumber(String majorName, String year) {
        List<String> list = studentManagerDao.getClassNameListByMaxNumber(majorName,year);
        return  list;
    }
}
