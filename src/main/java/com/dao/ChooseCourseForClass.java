package com.dao;

import com.vo.chooseCourseVo.ChooseCourseAllInfo;
import com.vo.chooseCourseVo.ChooseCourseFormData;
import com.vo.chooseCourseVo.ChooseCourseSelectByType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ChooseCourseForClass {

    List<String>  getDeptNameList();

    List<String> getDeptNameListForStudent();

    List<String> getMajorList(@Param("DEPTNAME") String deptName);

    List<String> getClassYearList();

    List<String> getClassNameList(@Param("majorName") String majorName,@Param("year") String year);

    List<String> getCourseNameList(ChooseCourseFormData chooseCourseFormData);

    List<String> getThisClassTcInfo(ChooseCourseFormData chooseCourseFormData);

    List<String> getAbleChooseIsNews(ChooseCourseFormData chooseCourseFormData);

    String getTcId(@Param("cName") String cName,@Param("isNew") String isNew);

    List<String> getStudentsIdList(@Param("className") String className,@Param("year") String year);

    Integer insertScInfo(@Param("STUDENTID") String studentId ,@Param("id") String id);

    List<ChooseCourseAllInfo> getChooseCourseAllList(ChooseCourseSelectByType chooseCourseSelectByType);

    Integer removeChooseCourseForClass(@Param("id") Integer id,@Param("year") String year,@Param("className") String className);
}
