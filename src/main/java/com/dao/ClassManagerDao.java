package com.dao;

import com.vo.classManagerVo.ClassManagerVo;
import com.vo.classManagerVo.SelectClassManagerInfoByType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClassManagerDao {

    List<ClassManagerVo> getAllClassManagerInfo(SelectClassManagerInfoByType selectClassManagerInfoByType);

    List<String> getAbleTeacherNameList(@Param("deptName") String deptName);

    String getClassNameByClassId(@Param("classId") String classId);

    List<String> getMajorListByYear(@Param("deptName") String deptName,@Param("year") String year);

    String getMajorIdByName(@Param("deptName") String deptName);

    Integer addClassManagerInfo(ClassManagerVo classManagerVo);

    Integer getClassNumberByMajor(@Param("majorName") String majorName,@Param("year") String year);

    Integer removeClassNumber(List<String> list);

    Integer getClassNumbers(@Param("classId") String classId,@Param("year") String year);

    Integer modifyClassManager(ClassManagerVo classManagerVo);
}
