package com.controller.teacherInfoManagerController;

import com.github.pagehelper.PageHelper;
import com.service.StudentMangerService;
import com.service.TeacherManagerService;
import com.vo.studentInfoManager.SelectStudentInfoByTypeVo;
import com.vo.studentInfoManager.StudentInfoMangerVo;
import com.vo.studentInfoManager.TwoStudentInfoManagerVo;
import com.vo.teacherInfoManager.SelectTeacherInfoByType;
import com.vo.teacherInfoManager.TeacherInfoManagerVo;
import com.vo.teacherInfoManager.TwoTeacherInfoManagerVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TeacherInfoManager {

    @Resource
    private TeacherManagerService teacherManagerService;

    @RequestMapping("/getTeacherInfo")
    @ResponseBody
    public Map<String, Object> getTeacherInfo(@RequestBody SelectTeacherInfoByType selectTeacherInfoByType) {
        Map<String, Object> resMap = new HashMap<>();
        List<TeacherInfoManagerVo> list1 = teacherManagerService.getAllTeacherInfo(selectTeacherInfoByType);
        PageHelper.startPage(selectTeacherInfoByType.getPage(),selectTeacherInfoByType.getItems());
        List<TeacherInfoManagerVo> list2 = teacherManagerService.getAllTeacherInfo(selectTeacherInfoByType);
        Integer index = list1.size();
        resMap.put("status", 200);
        resMap.put("desc", "success!");
        resMap.put("data", list2);
        resMap.put("index",index);
        return resMap;
    }
    @RequestMapping("/addTeacherInfo")
    @ResponseBody
    public Map<String, Object> addTeacherInfo(@RequestBody TeacherInfoManagerVo teacherInfoManagerVo) {
        Map<String, Object> resMap = new HashMap<>();
        Integer items = teacherManagerService.addTeacherList(teacherInfoManagerVo);
        resMap.put("desc", "success!");
        resMap.put("status",items);
        return resMap;
    }

    @RequestMapping("/removeTeacherInfo")
    @ResponseBody
    public Map<String, Object> removeTeacherInfo(@RequestBody List<String> list) {
        Map<String, Object> resMap = new HashMap<>();
        Integer items = teacherManagerService.removeTeacherList(list);
        resMap.put("desc", "success!");
        resMap.put("status",200);
        return resMap;
    }

    @RequestMapping("/modifyTeacherInfo")
    @ResponseBody
    public Map<String, Object> modifyTeacherInfo(@RequestBody TwoTeacherInfoManagerVo twoTeacherInfoManagerVo) {
        Map<String, Object> resMap = new HashMap<>();
        Integer status = teacherManagerService.modifyTeacherList(twoTeacherInfoManagerVo);
        resMap.put("desc", "success!");
        resMap.put("status",status);
        return resMap;
    }
}
