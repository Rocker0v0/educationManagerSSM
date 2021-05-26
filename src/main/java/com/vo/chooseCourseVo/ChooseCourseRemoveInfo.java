package com.vo.chooseCourseVo;

public class ChooseCourseRemoveInfo {

    private Integer id;
    private String year;
    private String className;

    public ChooseCourseRemoveInfo(Integer id, String year, String className) {
        this.id = id;
        this.year = year;
        this.className = className;
    }

    @Override
    public String toString() {
        return "ChooseCourseRemoveInfo{" +
                "id=" + id +
                ", year='" + year + '\'' +
                ", className='" + className + '\'' +
                '}';
    }

    public ChooseCourseRemoveInfo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}
