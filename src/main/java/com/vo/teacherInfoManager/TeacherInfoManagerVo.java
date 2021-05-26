package com.vo.teacherInfoManager;

import java.util.Objects;

public class TeacherInfoManagerVo {
  private String  teacherId;
    private String  deptName;
    private String  teacherName;
    private String  teacherSex;
    private String   teacherBirth;
    private String  educ;
    private String  profess;

    public TeacherInfoManagerVo() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeacherInfoManagerVo that = (TeacherInfoManagerVo) o;
        return Objects.equals(teacherId, that.teacherId) &&
                Objects.equals(deptName, that.deptName) &&
                Objects.equals(teacherName, that.teacherName) &&
                Objects.equals(teacherSex, that.teacherSex) &&
                Objects.equals(teacherBirth, that.teacherBirth) &&
                Objects.equals(educ, that.educ) &&
                Objects.equals(profess, that.profess);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teacherId, deptName, teacherName, teacherSex, teacherBirth, educ, profess);
    }

    public TeacherInfoManagerVo(String teacherId, String deptName, String teacherName, String teacherSex, String teacherBirth, String educ, String profess) {
        this.teacherId = teacherId;
        this.deptName = deptName;
        this.teacherName = teacherName;
        this.teacherSex = teacherSex;
        this.teacherBirth = teacherBirth;
        this.educ = educ;
        this.profess = profess;
    }

    @Override
    public String toString() {
        return "TeacherInfoManagerVo{" +
                "teacherId='" + teacherId + '\'' +
                ", deptName='" + deptName + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", teacherSex='" + teacherSex + '\'' +
                ", teacherBirth='" + teacherBirth + '\'' +
                ", educ='" + educ + '\'' +
                ", profess='" + profess + '\'' +
                '}';
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherSex() {
        return teacherSex;
    }

    public void setTeacherSex(String teacherSex) {
        this.teacherSex = teacherSex;
    }

    public String getTeacherBirth() {
        return teacherBirth;
    }

    public void setTeacherBirth(String teacherBirth) {
        this.teacherBirth = teacherBirth;
    }

    public String getEduc() {
        return educ;
    }

    public void setEduc(String educ) {
        this.educ = educ;
    }

    public String getProfess() {
        return profess;
    }

    public void setProfess(String profess) {
        this.profess = profess;
    }
}
