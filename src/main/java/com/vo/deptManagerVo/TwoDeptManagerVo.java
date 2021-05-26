package com.vo.deptManagerVo;

import com.vo.courseManagerVo.CourseManager;

public class TwoDeptManagerVo {

    private DeptManagerVo newDeptManagerVo;
    private DeptManagerVo oldDeptManagerVo;

    public TwoDeptManagerVo() {
    }

    public TwoDeptManagerVo(DeptManagerVo newDeptManagerVo, DeptManagerVo oldDeptManagerVo) {
        this.newDeptManagerVo = newDeptManagerVo;
        this.oldDeptManagerVo = oldDeptManagerVo;
    }

    @Override
    public String
    toString() {
        return "TwoDeptManagerVo{" +
                "newDeptManagerVo=" + newDeptManagerVo +
                ", oldDeptManagerVo=" + oldDeptManagerVo +
                '}';
    }

    public DeptManagerVo getNewDeptManagerVo() {
        return newDeptManagerVo;
    }

    public void setNewDeptManagerVo(DeptManagerVo newDeptManagerVo) {
        this.newDeptManagerVo = newDeptManagerVo;
    }

    public DeptManagerVo getOldDeptManagerVo() {
        return oldDeptManagerVo;
    }

    public void setOldDeptManagerVo(DeptManagerVo oldDeptManagerVo) {
        this.oldDeptManagerVo = oldDeptManagerVo;
    }
}
