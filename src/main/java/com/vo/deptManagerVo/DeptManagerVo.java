package com.vo.deptManagerVo;

import java.util.Objects;

public class DeptManagerVo {
  private String  deptId;
    private String  deptName;
    private String  director;
    private String   parentDeptName;

    public DeptManagerVo() {
    }

    public DeptManagerVo(String deptId, String deptName, String director, String parentDeptName) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.director = director;
        this.parentDeptName = parentDeptName;
    }

    @Override
    public String toString() {
        return "DeptManagerVo{" +
                "deptId='" + deptId + '\'' +
                ", deptName='" + deptName + '\'' +
                ", director='" + director + '\'' +
                ", parentDeptName='" + parentDeptName + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeptManagerVo that = (DeptManagerVo) o;
        return Objects.equals(deptId, that.deptId) &&
                Objects.equals(deptName, that.deptName) &&
                Objects.equals(director, that.director) &&
                Objects.equals(parentDeptName, that.parentDeptName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deptId, deptName, director, parentDeptName);
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getParentDeptName() {
        return parentDeptName;
    }

    public void setParentDeptName(String parentDeptName) {
        this.parentDeptName = parentDeptName;
    }
}
