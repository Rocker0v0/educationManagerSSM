package com.service;

import com.daomain.StuUser;
import com.daomain.SysUser;
import com.daomain.TeaUser;

import java.util.List;
import java.util.Map;

public interface LoginService {

    StuUser getStuInfo( String SUser,String SPass);

    SysUser getSysInfo(String userName,String userPwd);

    TeaUser getTeaInfo(String tUser, String tPass);

    List<Map> getNameInfo(String student_id);

    List<Map> getTeaNameInfo(String teacher_id);

}
