package com.dao;

import com.vo.deptManagerVo.DeptManagerVo;
import com.vo.deptManagerVo.SelectDeptManagerByType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeptMangerDao {

    List<DeptManagerVo> getAllDeptInfoByType(SelectDeptManagerByType selectDeptManagerByType);

    List<String> getDeptAndMajorName();

    Integer getMajorNumber(@Param("deptName") String deptName);

    Integer addDeptInfo(DeptManagerVo deptManagerVo);

    String getDeptNameById(@Param("deptId")String deptId);

    String getParentIdByName(@Param("deptName") String deptName);

    String getDeptIdByName(@Param("deptName") String deptName);

    Integer removeDeptInfo(List<String> list);

    Integer modifyDeptInfo(DeptManagerVo deptManagerVo);

    String getDeptByNameForModify(@Param("deptName") String deptName);

    Integer getDeptNumber();
}
