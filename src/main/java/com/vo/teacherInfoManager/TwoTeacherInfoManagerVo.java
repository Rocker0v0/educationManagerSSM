package com.vo.teacherInfoManager;


import java.util.Objects;

public class TwoTeacherInfoManagerVo {
    private TeacherInfoManagerVo newTeacherInfoManagerVo;
    private TeacherInfoManagerVo oldTeacherInfoManagerVo;

    public TwoTeacherInfoManagerVo(TeacherInfoManagerVo newTeacherInfoManagerVo, TeacherInfoManagerVo oldTeacherInfoManagerVo) {
        this.newTeacherInfoManagerVo = newTeacherInfoManagerVo;
        this.oldTeacherInfoManagerVo = oldTeacherInfoManagerVo;
    }

    public TwoTeacherInfoManagerVo() {
    }

    @Override
    public String toString() {
        return "TwoTeacherInfoManagerVo{" +
                "newTeacherInfoManagerVo=" + newTeacherInfoManagerVo +
                ", oldTeacherInfoManagerVo=" + oldTeacherInfoManagerVo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TwoTeacherInfoManagerVo that = (TwoTeacherInfoManagerVo) o;
        return Objects.equals(newTeacherInfoManagerVo, that.newTeacherInfoManagerVo) &&
                Objects.equals(oldTeacherInfoManagerVo, that.oldTeacherInfoManagerVo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newTeacherInfoManagerVo, oldTeacherInfoManagerVo);
    }

    public TeacherInfoManagerVo getNewTeacherInfoManagerVo() {
        return newTeacherInfoManagerVo;
    }

    public void setNewTeacherInfoManagerVo(TeacherInfoManagerVo newTeacherInfoManagerVo) {
        this.newTeacherInfoManagerVo = newTeacherInfoManagerVo;
    }

    public TeacherInfoManagerVo getOldTeacherInfoManagerVo() {
        return oldTeacherInfoManagerVo;
    }

    public void setOldTeacherInfoManagerVo(TeacherInfoManagerVo oldTeacherInfoManagerVo) {
        this.oldTeacherInfoManagerVo = oldTeacherInfoManagerVo;
    }
}
