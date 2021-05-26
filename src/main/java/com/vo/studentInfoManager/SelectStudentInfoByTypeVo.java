package com.vo.studentInfoManager;

public class SelectStudentInfoByTypeVo {

    private Integer page;
    private Integer items;
    private String studentId;
    private String className;
    private String studentName;
    private String year;

    public SelectStudentInfoByTypeVo() {
    }

    public SelectStudentInfoByTypeVo(Integer page, Integer items, String studentId, String className, String studentName, String year) {
        this.page = page;
        this.items = items;
        this.studentId = studentId;
        this.className = className;
        this.studentName = studentName;
        this.year = year;
    }

    @Override
    public String toString() {
        return "SelectStudentInfoByTypeVo{" +
                "page=" + page +
                ", items=" + items +
                ", studentId='" + studentId + '\'' +
                ", className='" + className + '\'' +
                ", studentName='" + studentName + '\'' +
                ", year='" + year + '\'' +
                '}';
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

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
