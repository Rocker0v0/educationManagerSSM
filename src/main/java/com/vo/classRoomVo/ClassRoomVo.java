package com.vo.classRoomVo;

import java.util.Objects;

public class ClassRoomVo {

    private String classRoomId;
    private String classRoomName;
    private String describe;

    public ClassRoomVo(String classRoomId, String classRoomName, String describe) {
        this.classRoomId = classRoomId;
        this.classRoomName = classRoomName;
        this.describe = describe;
    }

    public ClassRoomVo() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassRoomVo that = (ClassRoomVo) o;
        return Objects.equals(classRoomId, that.classRoomId) &&
                Objects.equals(classRoomName, that.classRoomName) &&
                Objects.equals(describe, that.describe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classRoomId, classRoomName, describe);
    }

    @Override
    public String toString() {
        return "ClassRoomVO{" +
                "classRoomId='" + classRoomId + '\'' +
                ", classRoomName='" + classRoomName + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }

    public String getClassRoomId() {
        return classRoomId;
    }

    public void setClassRoomId(String classRoomId) {
        this.classRoomId = classRoomId;
    }

    public String getClassRoomName() {
        return classRoomName;
    }

    public void setClassRoomName(String classRoomName) {
        this.classRoomName = classRoomName;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
