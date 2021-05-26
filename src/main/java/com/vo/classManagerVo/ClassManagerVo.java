package com.vo.classManagerVo;

import java.util.Objects;

public class ClassManagerVo {
    private String classId;
    private String className;
    private String majorName;
    private String deptName;
    private String instructor;
    private Integer maxStudents;
    private String year;

    public ClassManagerVo() {
    }

    @Override
    public String toString() {
        return "ClassManagerVo{" +
                "classId='" + classId + '\'' +
                ", className='" + className + '\'' +
                ", majorName='" + majorName + '\'' +
                ", deptName='" + deptName + '\'' +
                ", instructor='" + instructor + '\'' +
                ", maxStudents=" + maxStudents +
                ", year='" + year + '\'' +
                '}';
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public Integer getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(Integer maxStudents) {
        this.maxStudents = maxStudents;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassManagerVo that = (ClassManagerVo) o;
        return Objects.equals(classId, that.classId) &&
                Objects.equals(className, that.className) &&
                Objects.equals(majorName, that.majorName) &&
                Objects.equals(deptName, that.deptName) &&
                Objects.equals(instructor, that.instructor) &&
                Objects.equals(maxStudents, that.maxStudents) &&
                Objects.equals(year, that.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classId, className, majorName, deptName, instructor, maxStudents, year);
    }

    public ClassManagerVo(String classId, String className, String majorName, String deptName, String instructor, Integer maxStudents, String year) {
        this.classId = classId;
        this.className = className;
        this.majorName = majorName;
        this.deptName = deptName;
        this.instructor = instructor;
        this.maxStudents = maxStudents;
        this.year = year;
    }
}
