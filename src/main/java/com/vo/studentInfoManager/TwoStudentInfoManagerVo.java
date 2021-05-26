package com.vo.studentInfoManager;

public class TwoStudentInfoManagerVo {
    private StudentInfoMangerVo newStudentInfoMangerVo;
    private StudentInfoMangerVo oldStudentInfoMangerVo;

    public TwoStudentInfoManagerVo(StudentInfoMangerVo newStudentInfoMangerVo, StudentInfoMangerVo oldStudentInfoMangerVo) {
        this.newStudentInfoMangerVo = newStudentInfoMangerVo;
        this.oldStudentInfoMangerVo = oldStudentInfoMangerVo;
    }

    public TwoStudentInfoManagerVo() {
    }

    @Override
    public String toString() {
        return "TwoStudentInfoManagerVo{" +
                "newStudentInfoMangerVo=" + newStudentInfoMangerVo +
                ", oldStudentInfoMangerVo=" + oldStudentInfoMangerVo +
                '}';
    }

    public StudentInfoMangerVo getNewStudentInfoMangerVo() {
        return newStudentInfoMangerVo;
    }

    public void setNewStudentInfoMangerVo(StudentInfoMangerVo newStudentInfoMangerVo) {
        this.newStudentInfoMangerVo = newStudentInfoMangerVo;
    }

    public StudentInfoMangerVo getOldStudentInfoMangerVo() {
        return oldStudentInfoMangerVo;
    }

    public void setOldStudentInfoMangerVo(StudentInfoMangerVo oldStudentInfoMangerVo) {
        this.oldStudentInfoMangerVo = oldStudentInfoMangerVo;
    }
}
