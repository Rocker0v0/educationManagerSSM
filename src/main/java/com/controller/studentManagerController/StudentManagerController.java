package com.controller.studentManagerController;

import com.github.pagehelper.PageHelper;
import com.service.StudentMangerService;
import com.vo.studentInfoManager.SelectStudentInfoByTypeVo;
import com.vo.studentInfoManager.StudentInfoMangerVo;
import com.vo.studentInfoManager.TwoStudentInfoManagerVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class StudentManagerController {

    @Resource
    private StudentMangerService studentMangerService;

    @RequestMapping("/getStudentInfo")
    @ResponseBody
    public Map<String, Object> getStudentInfo(@RequestBody SelectStudentInfoByTypeVo selectStudentInfoByTypeVo) {
        Map<String, Object> resMap = new HashMap<>();
        List<StudentInfoMangerVo> list1 = studentMangerService.getStudentList(selectStudentInfoByTypeVo);
        PageHelper.startPage(selectStudentInfoByTypeVo.getPage(),selectStudentInfoByTypeVo.getItems());
        List<StudentInfoMangerVo> list2 = studentMangerService.getStudentList(selectStudentInfoByTypeVo);
        Integer index = list1.size();
        resMap.put("status", 200);
        resMap.put("desc", "success!");
        resMap.put("data", list2);
        resMap.put("index",index);
        return resMap;
    }

    @RequestMapping("/addStudentInfo")
    @ResponseBody
    public Map<String, Object> addStudentInfo(@RequestBody StudentInfoMangerVo studentInfoMangerVo) {
        Map<String, Object> resMap = new HashMap<>();
       Integer items = studentMangerService.addStudentList(studentInfoMangerVo);
        resMap.put("desc", "success!");
        resMap.put("status",items);
        return resMap;
    }

    @RequestMapping("/removeStudentInfo")
    @ResponseBody
    public Map<String, Object> removeStudentInfo(@RequestBody List<String> list) {
        Map<String, Object> resMap = new HashMap<>();
        Integer items = studentMangerService.removeStudentList(list);
        resMap.put("desc", "success!");
        resMap.put("status",items);
        return resMap;
    }

    @RequestMapping("/getClassNameListByMaxNumber")
    @ResponseBody
    public Map<String,Object> getClassNameListByMaxNumber(String majorName,String year){
        Map<String,Object> map = new HashMap<>();
        List<String> list = studentMangerService.getClassNameInfoByMaxNumber(majorName,year);
        System.out.println(list);
        map.put("data",list);
        map.put("status",200);
        map.put("desc","success!");
        return map;
    }

    @RequestMapping("/modifyStudentInfo")
    @ResponseBody
    public Map<String, Object> modifyStudentInfo(@RequestBody TwoStudentInfoManagerVo twoStudentInfoManagerVo) {
        Map<String, Object> resMap = new HashMap<>();
       Integer status = studentMangerService.modifyStudentList(twoStudentInfoManagerVo);
        resMap.put("desc", "success!");
        resMap.put("status",status);
        return resMap;
    }

}
