package com.service;

import com.vo.deptManagerVo.DeptManagerVo;
import com.vo.deptManagerVo.SelectDeptManagerByType;
import com.vo.deptManagerVo.TwoDeptManagerVo;

import java.util.List;

public interface DeptManagerService {

    List<DeptManagerVo> getDeptManagerInfo(SelectDeptManagerByType selectDeptManagerByType);

    List<String> getDeptAndMajorNameInfo();

    Integer addDeptList(DeptManagerVo deptManagerVo);

    Integer removeDeptList(List<String> list);

    Integer modifyDeptList(TwoDeptManagerVo twoDeptManagerVo);

}
