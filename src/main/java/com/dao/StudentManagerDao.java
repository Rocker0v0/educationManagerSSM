package com.dao;

import com.vo.studentInfoManager.SelectStudentInfoByTypeVo;
import com.vo.studentInfoManager.StudentInfoMangerVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentManagerDao {
    List<StudentInfoMangerVo> getStudentInfo(SelectStudentInfoByTypeVo selectStudentInfoByTypeVo);

    String getClassId(@Param("className") String className,@Param("year") String year);


    Integer addStudentInfo(StudentInfoMangerVo studentInfoMangerVo);

    Integer addScByID(@Param("studentId") String studentId,@Param("id") Integer id);

    List<Integer> getScIdList(@Param("className") String className,@Param("year") String year);

    List<String> getStudentIdListByName(@Param("studentName") String studentName);

    Integer removeStudentByStudentId(List<String> list);

    String getStudentNameById(@Param("studentId") String studentId);

    Integer updateStudentInfo(StudentInfoMangerVo studentInfoMangerVo);

    List<String> getClassNameListByMaxNumber(@Param("majorName") String majorName,@Param("year") String year);

}
