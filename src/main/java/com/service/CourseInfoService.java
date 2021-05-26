package com.service;

import com.vo.courseInfoVo.CourseInfoVo;
import com.vo.courseInfoVo.SelectCourseInfoByType;
import com.vo.courseInfoVo.TwoCourseInfoVo;

import java.util.List;

public interface CourseInfoService {

    List<CourseInfoVo> getAllCourseList(SelectCourseInfoByType selectCourseInfoByType);

    List<String> getAbleDeptList(String type);

    Integer addCourseList(CourseInfoVo courseInfoVo);

    Integer modifyCourseList(TwoCourseInfoVo twoCourseInfoVo);

    Integer removeCourseList(List<String> list);
}
