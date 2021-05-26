package com.vo.classRoomVo;

public class TwoClassRoomVo {
    private  ClassRoomVo newClassRoomVo;
    private  ClassRoomVo oldClassRoomVo;

    public TwoClassRoomVo(ClassRoomVo newClassRoomVo, ClassRoomVo oldClassRoomVo) {
        this.newClassRoomVo = newClassRoomVo;
        this.oldClassRoomVo = oldClassRoomVo;
    }

    public TwoClassRoomVo() {
    }

    public ClassRoomVo getNewClassRoomVo() {
        return newClassRoomVo;
    }

    public void setNewClassRoomVo(ClassRoomVo newClassRoomVo) {
        this.newClassRoomVo = newClassRoomVo;
    }

    public ClassRoomVo getOldClassRoomVo() {
        return oldClassRoomVo;
    }

    public void setOldClassRoomVo(ClassRoomVo oldClassRoomVo) {
        this.oldClassRoomVo = oldClassRoomVo;
    }
}
