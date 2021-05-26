package com.vo.chooseCourseVo;

public class ChooseCourseSelectByType {
    private Integer page;
    private Integer items;
    private String year;
    private String courseName;
    private String teacherName;
    private String className;


    public ChooseCourseSelectByType(Integer page, Integer items, String year, String courseName, String teacherName, String className) {
        this.page = page;
        this.items = items;
        this.year = year;
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.className = className;
    }

    public ChooseCourseSelectByType() {
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getItems() {
        return items;
    }

    public void setItems(Integer items) {
        this.items = items;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
