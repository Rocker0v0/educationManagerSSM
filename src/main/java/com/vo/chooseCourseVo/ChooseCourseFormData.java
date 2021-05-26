package com.vo.chooseCourseVo;

public class ChooseCourseFormData {
    private String deptName;
    private String majorName;
    private String year;
    private String className;
    private String type;
    private String CourseName;

    public ChooseCourseFormData(String deptName, String majorName, String year, String className, String type, String courseName) {
        this.deptName = deptName;
        this.majorName = majorName;
        this.year = year;
        this.className = className;
        this.type = type;
        CourseName = courseName;
    }

    public ChooseCourseFormData() {
    }

    public String getDeptName() {
        return deptName;
    }

    @Override
    public String toString() {
        return "ChooseCourseFormData{" +
                "deptName='" + deptName + '\'' +
                ", majorName='" + majorName + '\'' +
                ", year='" + year + '\'' +
                ", className='" + className + '\'' +
                ", type='" + type + '\'' +
                ", CourseName='" + CourseName + '\'' +
                '}';
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }
}
