package com.controller.loginController;

import com.daomain.StuUser;
import com.daomain.SysUser;
import com.daomain.TeaUser;
import com.service.LoginService;
import com.utils.RandomCode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@SessionAttributes(value = {"stuUser", "teaUser", "sysUser"})
public class LoginController {

    @Resource
    private LoginService loginService;

    //    登陆验证
    @RequestMapping(value = "/getStatueCode", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getStatueCode(String userName, String passWord, Integer code) {
        Map<String, Object> map = new HashMap<>();
        switch (code) {
            case 3:
                StuUser stuUser1 = loginService.getStuInfo(userName, passWord);
                if (stuUser1 != null) {
                    map.put("statue", 1);
                    map.put("message", "登陆成功！");
                } else {
                    map.put("statue", -1);
                    map.put("message", "用户名或密码不正确");
                }
                break;
            case 6:
                TeaUser teaUser1 = loginService.getTeaInfo(userName, passWord);
                if (teaUser1 != null) {
                    map.put("statue", 1);
                    map.put("message", "登陆成功！");
                } else {
                    map.put("statue", -1);
                    map.put("message", "用户名或密码不正确");
                }
                break;
            case 9:
                SysUser sysInfo1 = loginService.getSysInfo(userName, passWord);
                if (sysInfo1 != null) {
                    map.put("statue", 1);
                    map.put("message", "登陆成功！");
                } else {
                    map.put("statue", -1);
                    map.put("message", "用户名或密码不正确");
                }
        }
        return map;
    }

    //获取验证码
    @ResponseBody
    @RequestMapping("/verifyCode")
    public String getVerify() {
        return RandomCode.getRandomCode(4);
    }

    //    设置session
    @RequestMapping("/setSession")
    public ModelAndView setSession(String userName, String passWord, Integer code, Model model) {
        switch (code) {
            case 3:
                model.addAttribute("stuUser", new StuUser(userName, passWord));
                break;
            case 6:
                model.addAttribute("teaUser", new TeaUser(userName, passWord));
                break;
            case 9:
                model.addAttribute("sysUser", new SysUser(userName, passWord));
                break;
        }
        return null;
    }

    //获取session
    @RequestMapping(value = "/getSession")
    @ResponseBody
    public Map<String, Object> getSession(Integer code, Model model, HttpSession session) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", code);
        switch (code) {
            case 3:
                StuUser stuUser = (StuUser) model.getAttribute("stuUser");
                if (stuUser!=null){
                    List<Map> stulist =  loginService.getNameInfo(stuUser.getSuser());
                    map.put("data", model.getAttribute("stuUser"));
                    map.put("name",stulist.get(0));
                }
                break;
            case 6:
                TeaUser teaUser = (TeaUser) model.getAttribute("teaUser");
                if (teaUser!=null){
                    List<Map> tealist =  loginService.getTeaNameInfo(teaUser.gettUser());
                    map.put("data", model.getAttribute("teaUser"));
                    map.put("name",tealist.get(0));
                }
                break;
            case 9:
                if (model.getAttribute("sysUser")!=null){
                    map.put("data",model.getAttribute("sysUser"));
                }
                break;
        }
        return map;
    }

    //删除session
    @RequestMapping("/delSession")
    @ResponseBody
    public String delSession(Integer code,HttpSession session,Model model) {
        switch (code){
            case 3:
                session.removeAttribute("stuUser");
                model.addAttribute("stuUser",null);
                break;
            case 6:
                session.removeAttribute("teaUser");
                model.addAttribute("teaUser",null);
                break;
            case 9:
                session.removeAttribute("sysUser");
                model.addAttribute("sysUser",null);
                break;
        }
        return "seccess";
    }
}
