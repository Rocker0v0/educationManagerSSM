package com.service.courseManagerServiceImp;

import com.dao.ChooseCourseForClass;
import com.dao.CourseManagerDao;
import com.daomain.TcInfo;
import com.service.CourseManagerService;
import com.vo.courseManagerVo.CourseManager;
import com.vo.courseManagerVo.PartTcInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class CourseManagerServiceImpl implements CourseManagerService {

    @Resource
    private CourseManagerDao courseManagerDao;
    @Resource
    private ChooseCourseForClass chooseCourseForClass;

    @Override
    public List<CourseManager> getCourseManagerInfo(String type,String TNAME,String CNAME) {
        return courseManagerDao.getCourseManager(type,TNAME,CNAME);
    }

    @Override
    public List<String> getAbleCoursesInfo() {
       List<String> list =  courseManagerDao.getAbleCourses();
        System.out.println(list);
       List<String> resList = new ArrayList<>();
       List<String> yearList = chooseCourseForClass.getClassYearList();
        for (String item:list) {
            Integer isNewNumber =  courseManagerDao.getIsNewNumber(item);
            Integer classNumber = 0;
            for (String year:yearList){
              String deptId =  courseManagerDao.getDeptId(item);
              if (deptId.equals("070")){
                  deptId = "000";
              }
              Integer index =  courseManagerDao.getClassNumberByDept(deptId,year);
                if (index>=classNumber){
                    classNumber = index;
                }
            }
            if (isNewNumber != null && classNumber !=null){
                if (isNewNumber<classNumber){
                    resList.add(item);
                }
            }else if(isNewNumber == null && classNumber !=null){
                resList.add(item);
            }
        }
        return resList;
    }

    @Override
    public List<String> getAbleTeachersInfo(String cName, Integer semester) {
        List<String> list =  courseManagerDao.getAbleTeachers(cName,semester);
        return list;
    }

    @Override
    public List<TcInfo> getAllReadyTcInfo(PartTcInfo tcInfo) {
        List<TcInfo> list  = null;
        String type = courseManagerDao.getCourseType(tcInfo.getCourseName());
        if (!type.equals("通识选修")){
            CourseManager manager = new CourseManager();
            manager.setCourseName(tcInfo.getCourseName());
            List<Integer> list1 = courseManagerDao.getIndexCourse(manager);
            Integer index  = 1;
            if (list1.size() != 0){
                boolean b;
                b = list1.contains(index);
                while (b){
                    index++;
                    b = list1.contains(index);
                }
            }
            if(tcInfo.getIsNewAdd()!=null && tcInfo.getIsNewAdd() !=0 ){
                System.out.println(tcInfo.getIsNewAdd());
                list =   courseManagerDao.getAllReadyTc(tcInfo.gettName(),tcInfo.getSemester(), tcInfo.getStartWeek(),tcInfo.getEndWeek(),type,tcInfo.getCourseName(),tcInfo.getIsNewAdd(),tcInfo.getId());
            }else {
                System.out.println(index);
                list =   courseManagerDao.getAllReadyTc(tcInfo.gettName(),tcInfo.getSemester(), tcInfo.getStartWeek(),tcInfo.getEndWeek(),type,tcInfo.getCourseName(),index,tcInfo.getId());
            }
        }else{
            list =   courseManagerDao.getAllReadyTc(tcInfo.gettName(),tcInfo.getSemester(), tcInfo.getStartWeek(),tcInfo.getEndWeek(),null,null,null,tcInfo.getId());
        }
        return list;
    }
    @Override
    public List<String> getAbleRoomsInfo(TcInfo tcInfo) {
       List<String> list =  courseManagerDao.getAbleRooms(tcInfo);
        return list;
    }

    @Override
    public List<TcInfo> getSemesterInfo(String cName) {

        List<TcInfo> list = courseManagerDao.getSemester(cName);
        return list;
    }

    @Override
    public int removeCoursesManagerInfo(List<Integer> list) {
        int index = courseManagerDao.removeCoursesManager(list);
        return index;
    }

    @Override
    public int addCoursesManagerInfo(CourseManager courseManager) {

        List<Integer> list = courseManagerDao.getIndexCourse(courseManager);
        Integer index  = 1;
        if (list.size() != 0){
            boolean b;
            b = list.contains(index);
            while (b){
                index++;
                b = list.contains(index);
            }
        }
        courseManager.setIsNewAdd(index);
        int statue = courseManagerDao.addCoursesManager(courseManager);
        return statue;
    }

    @Override
    public int modifyCoursesManagerInfo(CourseManager courseManager) {
       int index = courseManagerDao.modifyCoursesManager(courseManager);
        return index;
    }

    @Override
    public String getCourseTypeInfo(String cName) {
        String str = courseManagerDao.getCourseType(cName);
        return str;
    }

    @Override
    public List<Integer> getAbleSemesterInfo(String cName) {
        String type = courseManagerDao.getCourseType(cName);
        List<Integer> list = courseManagerDao.getAbleSemester(cName,type);
        return list;
    }


    @Override
    public List<Integer> getDayInfo(PartTcInfo tcInfo) {
        List<Integer> list = null;
        if(tcInfo.getIsNewAdd()!=null && tcInfo.getIsNewAdd() !=0 ){
            tcInfo.setIsNewAdd(tcInfo.getIsNewAdd());
        }else {
            CourseManager manager = new CourseManager();
            manager.setCourseName(tcInfo.getCourseName());
            List<Integer> list1 = courseManagerDao.getIndexCourse(manager);
            Integer index  = 1;
            if (list1.size() != 0){
                boolean b;
                b = list1.contains(index);
                while (b){
                    index++;
                    b = list1.contains(index);
                }
            }
            tcInfo.setIsNewAdd(index);
        }
        list =  courseManagerDao.getDay(tcInfo);
       return list;
    }



}
