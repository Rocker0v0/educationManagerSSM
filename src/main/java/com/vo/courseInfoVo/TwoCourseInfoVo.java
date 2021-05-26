package com.vo.courseInfoVo;

import java.util.Objects;

public class TwoCourseInfoVo {
    private CourseInfoVo newCourseInfoVo;
    private CourseInfoVo oldCourseInfoVo;

    public TwoCourseInfoVo(CourseInfoVo newCourseInfoVo, CourseInfoVo oldCourseInfoVo) {
        this.newCourseInfoVo = newCourseInfoVo;
        this.oldCourseInfoVo = oldCourseInfoVo;
    }

    public TwoCourseInfoVo() {
    }

    public CourseInfoVo getNewCourseInfoVo() {
        return newCourseInfoVo;
    }

    public void setNewCourseInfoVo(CourseInfoVo newCourseInfoVo) {
        this.newCourseInfoVo = newCourseInfoVo;
    }

    public CourseInfoVo getOldCourseInfoVo() {
        return oldCourseInfoVo;
    }

    public void setOldCourseInfoVo(CourseInfoVo oldCourseInfoVo) {
        this.oldCourseInfoVo = oldCourseInfoVo;
    }

    @Override
    public String toString() {
        return "TwoCourseInfoVo{" +
                "newCourseInfoVo=" + newCourseInfoVo +
                ", oldCourseInfoVo=" + oldCourseInfoVo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TwoCourseInfoVo that = (TwoCourseInfoVo) o;
        return Objects.equals(newCourseInfoVo, that.newCourseInfoVo) &&
                Objects.equals(oldCourseInfoVo, that.oldCourseInfoVo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newCourseInfoVo, oldCourseInfoVo);
    }
}
