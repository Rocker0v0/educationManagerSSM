package com.dao;

import com.vo.courseInfoVo.CourseInfoVo;
import com.vo.courseInfoVo.SelectCourseInfoByType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseInfoDao {

    List<CourseInfoVo> getAllCourseInfo(SelectCourseInfoByType selectCourseInfoByType);

    List<String> getDeptNameForCoursesInfo(@Param("type") String type);

    String getCourseIdByName(@Param("courseName")String courseName);

    Integer addCourseInfo(CourseInfoVo courseInfoVo);

    Integer modifyCourseInfo(CourseInfoVo courseInfoVo);

    Integer removeCourseInfo(List<String> list);


}
