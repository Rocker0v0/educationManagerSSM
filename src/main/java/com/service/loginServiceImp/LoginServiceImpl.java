package com.service.loginServiceImp;

import com.dao.LoginDao;
import com.daomain.StuUser;
import com.daomain.SysUser;
import com.daomain.TeaUser;
import com.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private LoginDao loginDao;

    @Override
    public StuUser getStuInfo(String SUser, String SPass) {
       StuUser stuUser = loginDao.getStuUser(SUser,SPass);
        return stuUser;
    }

    @Override
    public SysUser getSysInfo(String userName, String userPwd) {
        SysUser sysUser = loginDao.getSysUser(userName,userPwd);
        return sysUser;
    }

    @Override
    public TeaUser getTeaInfo(String tUser, String tPass) {
        TeaUser teaUser = loginDao.getTeaUser(tUser,tPass);
        return teaUser;
    }

    @Override
    public List<Map> getNameInfo(String student_id) {
       List<Map> list = loginDao.getName(student_id);
       return list;
    }

    @Override
    public List<Map> getTeaNameInfo(String teacher_id) {
        List<Map> list = loginDao.getTeaName(teacher_id);
        return list;
    }
}
