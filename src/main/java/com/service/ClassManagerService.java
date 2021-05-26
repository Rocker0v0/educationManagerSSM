package com.service;

import com.vo.classManagerVo.ClassManagerVo;
import com.vo.classManagerVo.SelectClassManagerInfoByType;

import java.util.List;

public interface ClassManagerService {

    List<ClassManagerVo> getAllClassManagerList(SelectClassManagerInfoByType selectClassManagerInfoByType);

    List<String> getAbleTeacherNameInfo(String deptName);

    List<String> getMajorListByYearInfo(String deptName,String year);

    Integer addClassManagerInfo(ClassManagerVo classManagerVo);

    Integer removeClassManagerInfo(List<String> list);

    Integer modifyClassManagerInfo(ClassManagerVo classManagerVo);
}
