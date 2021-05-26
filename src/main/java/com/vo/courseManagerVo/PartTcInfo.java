package com.vo.courseManagerVo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PartTcInfo {
    @JsonProperty(value = "tName")
    private String tName;
    @JsonProperty(value = "semester")
    private Integer semester;
    @JsonProperty(value = "startWeek")
    private Integer startWeek;
    @JsonProperty(value = "endWeek")
    private  Integer endWeek;

    @JsonProperty(value = "courseName")
    private String courseName;

    @JsonProperty(value = "isNewAdd")
    private Integer isNewAdd;

    @JsonProperty(value = "id")
    private Integer id;

    public PartTcInfo(String tName, Integer semester, Integer startWeek, Integer endWeek, String courseName, Integer isNewAdd, Integer id) {
        this.tName = tName;
        this.semester = semester;
        this.startWeek = startWeek;
        this.endWeek = endWeek;
        this.courseName = courseName;
        this.isNewAdd = isNewAdd;
        this.id = id;
    }

    public PartTcInfo() {
    }

    @Override
    public String toString() {
        return "PartTcInfo{" +
                "tName='" + tName + '\'' +
                ", semester=" + semester +
                ", startWeek=" + startWeek +
                ", endWeek=" + endWeek +
                ", courseName='" + courseName + '\'' +
                ", isNewAdd=" + isNewAdd +
                ", id=" + id +
                '}';
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public Integer getStartWeek() {
        return startWeek;
    }

    public void setStartWeek(Integer startWeek) {
        this.startWeek = startWeek;
    }

    public Integer getEndWeek() {
        return endWeek;
    }

    public void setEndWeek(Integer endWeek) {
        this.endWeek = endWeek;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getIsNewAdd() {
        return isNewAdd;
    }

    public void setIsNewAdd(Integer isNewAdd) {
        this.isNewAdd = isNewAdd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
