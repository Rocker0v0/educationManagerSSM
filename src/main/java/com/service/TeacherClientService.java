package com.service;

import com.vo.teacherClientVo.TeacherClientVo;

import java.util.List;

public interface TeacherClientService {

    List<TeacherClientVo> getAllTeacherCourse(String teacherId,String type);
}
