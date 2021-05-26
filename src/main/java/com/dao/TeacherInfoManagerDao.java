package com.dao;

import com.vo.studentInfoManager.StudentInfoMangerVo;
import com.vo.teacherInfoManager.SelectTeacherInfoByType;
import com.vo.teacherInfoManager.TeacherInfoManagerVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherInfoManagerDao {

    List<TeacherInfoManagerVo> getAllTeacherInfo(SelectTeacherInfoByType selectTeacherInfoByType);

    String getTeacherNameByTeacherId(@Param("teacherId") String teacherId);

    Integer addTeacherManagerInfo(TeacherInfoManagerVo teacherInfoManagerVo);

    String getTeacherIdByTeacherName(@Param("teacherName") String teacherName);

    Integer removeTeacherByStudentId(List<String> list);

    Integer updateTeacherInfo(TeacherInfoManagerVo teacherInfoManagerVo);


}
