package com.service;

import com.daomain.TcInfo;
import com.vo.courseManagerVo.CourseManager;
import com.vo.courseManagerVo.PartTcInfo;

import java.util.List;

public interface CourseManagerService {
    List<CourseManager> getCourseManagerInfo(String type,String TNAME,String CNAME);

    List<String> getAbleCoursesInfo();

    List<String> getAbleTeachersInfo(String cName,Integer semester);

    List<TcInfo> getAllReadyTcInfo(PartTcInfo tcInfo);

    List<String> getAbleRoomsInfo(TcInfo tcInfo);

    List<TcInfo> getSemesterInfo(String cName);

    int removeCoursesManagerInfo(List<Integer> list);

    int addCoursesManagerInfo(CourseManager courseManager);

    int modifyCoursesManagerInfo(CourseManager courseManager);

    String getCourseTypeInfo(String cName);

    List<Integer> getAbleSemesterInfo(String cName);


    List<Integer> getDayInfo(PartTcInfo partTcInfo);

}
