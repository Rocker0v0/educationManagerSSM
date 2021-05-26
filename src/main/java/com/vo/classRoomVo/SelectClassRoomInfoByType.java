package com.vo.classRoomVo;

public class SelectClassRoomInfoByType {
    private Integer page;
    private Integer items;
    private String classRoomId;
    private String classRoomName;

    public SelectClassRoomInfoByType() {
    }

    public SelectClassRoomInfoByType(Integer page, Integer items, String classRoomId, String classRoomName) {
        this.page = page;
        this.items = items;
        this.classRoomId = classRoomId;
        this.classRoomName = classRoomName;
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
}
