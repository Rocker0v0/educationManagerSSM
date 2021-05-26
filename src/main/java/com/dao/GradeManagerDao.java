package com.dao;

import com.vo.gradeManagerVo.GradeManagerAllInfo;
import com.vo.gradeManagerVo.GradeManagerSelectByType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GradeManagerDao {

    List<GradeManagerAllInfo> getGradeManagerAllInfo(GradeManagerSelectByType gradeManagerSelectByType);

    List<String> getAllReadChooseCourseName(@Param("teacherId") String teacherId,@Param("year") String year);

    List<String> getAllReadChooseClassName(@Param("year") Integer year,@Param("courseName") String courseName,@Param("teacherId") String teacherId);

    Integer removeScInfoByPrimaryIds(List<Integer> list);

    Integer modifyScInfoByPrimaryIds(@Param("primaryId") Integer primaryId,@Param("grade") Integer grade);
}
