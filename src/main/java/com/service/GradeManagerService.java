package com.service;

import com.vo.gradeManagerVo.GradeManagerAllInfo;
import com.vo.gradeManagerVo.GradeManagerSelectByType;

import java.util.List;

public interface GradeManagerService {

    List<GradeManagerAllInfo> getGradeManagerAllList(GradeManagerSelectByType gradeManagerSelectByType);

    List<String> getAllReadCourseName(String teacherId, String year);

    List<String> getAllReadClassName(Integer year, String courseName,String teacherId);

    Integer removeScInfoByPrimaryIdsInfo(List<Integer> list);

    Integer modifyScInfoByPrimaryIdsInfo(Integer primaryId,Integer grade);

}
