package com.service;

import com.vo.chooseCourseVo.ChooseCourseAllInfo;
import com.vo.chooseCourseVo.ChooseCourseFormData;
import com.vo.chooseCourseVo.ChooseCourseRemoveInfo;
import com.vo.chooseCourseVo.ChooseCourseSelectByType;

import java.util.List;

public interface ChooseCourseForClassService {
    List<String> getDeptNameInfo();

    List<String> getDeptNameInfoForStudent();

    List<String> getMajorInfo(String deptName);

    List<String> getClassYearInfo();

    List<String> getClassNameInfo(String majorName,String year);

    List<String> getCourseNameInfo(ChooseCourseFormData chooseCourseFormData);

    Integer submitFormDataInfo(ChooseCourseFormData chooseCourseFormData);


    List<ChooseCourseAllInfo> getChooseCourseAllInfo(ChooseCourseSelectByType chooseCourseSelectByType);

    Integer removeChooseCourseForClassInfo(List<ChooseCourseRemoveInfo> list);



}
