package com.dao;

import com.daomain.StuUser;
import com.daomain.SysUser;
import com.daomain.TcInfo;
import com.daomain.TeaUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

//myBatis在在映射文件中查询语句获取多个参数，应该在接口方法中使用@Param注解用来进行区分，否则会导致参数接收不到
public interface LoginDao {
    StuUser getStuUser(
            @Param("SUser") String SUser,
            @Param("SPass") String SPass);
    SysUser getSysUser(
            @Param(value = "USERNAME") String userName,
            @Param(value = "USERPWD") String userPwd);
    TeaUser getTeaUser(
            @Param(value = "TUSER") String tUser,
            @Param(value = "TPASS") String tPass);
    List<Map> getName(@Param(value="STUDENT_ID") String student_id);

    List<Map> getTeaName(@Param(value="TEACHER_ID") String teacher_id);


}
