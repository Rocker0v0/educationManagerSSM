package com.vo.courseInfoVo;

import java.util.Objects;

public class CourseInfoVo {
   private String courseId;
    private String courseName;
    private String credits;
    private String type;
    private String deptName;

    public CourseInfoVo(String courseId, String courseName, String credits, String type, String deptName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
        this.type = type;
        this.deptName = deptName;
    }

    public CourseInfoVo() {
    }

    @Override
    public String toString() {
        return "CourseInfoVo{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", credits='" + credits + '\'' +
                ", type='" + type + '\'' +
                ", deptName='" + deptName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseInfoVo that = (CourseInfoVo) o;
        return Objects.equals(courseId, that.courseId) &&
                Objects.equals(courseName, that.courseName) &&
                Objects.equals(credits, that.credits) &&
                Objects.equals(type, that.type) &&
                Objects.equals(deptName, that.deptName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId, courseName, credits, type, deptName);
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
