package com.controller.teacherClientController;

import com.service.TeacherClientService;
import com.vo.teacherClientVo.TeacherClientVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TeacherClient {

    @Resource
    private TeacherClientService teacherClientService;

    @RequestMapping("/getTeacherCourseInfo")
    @ResponseBody
    public Map<String,Object> getTeacherCourseInfo(String teacherId,String type) {
        Map<String,Object> map = new HashMap<>();
        List<TeacherClientVo> data  = teacherClientService.getAllTeacherCourse(teacherId,type);
        map.put("desc","success");
        map.put("status",200);
        map.put("data",data);
        return map;
    }

}
