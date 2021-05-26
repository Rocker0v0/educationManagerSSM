package com.dao;


import com.vo.teacherClientVo.TeacherClientVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherClientDao {

    List<TeacherClientVo> getAllTeacherCourseByTeacherId(@Param("teacherId") String teacherId,@Param("type")String type);

    String getDeptByTeacherId(@Param("teacherId") String teacherId);
}
