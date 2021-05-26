package com.controller.courseManagerController;

import com.daomain.TcInfo;
import com.github.pagehelper.PageHelper;
import com.service.CourseManagerService;
import com.vo.courseManagerVo.CourseManager;
import com.vo.courseManagerVo.PartTcInfo;
import com.vo.courseManagerVo.TwoCourseManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CourseManagerController {

    @Resource
    CourseManagerService courseManagerService;

    @RequestMapping("/getCourseManagerMessage")
    @ResponseBody
    public Map<String,Object> getCourseManagerMessage(Integer page, Integer items,String type,String tName,String cName) throws InterruptedException {
        Map<String,Object> map = new HashMap<>();
        List<CourseManager> list1 = courseManagerService.getCourseManagerInfo(type,tName,cName);
        PageHelper.startPage(page,items);
        List<CourseManager> list =  courseManagerService.getCourseManagerInfo(type,tName,cName);
        int index = list1.size();
        map.put("data",list);
        map.put("index",index);
        return map;
    }

    @ResponseBody
    @RequestMapping("/getAbleCourses")
    public Map<String,Object> getAbleCoursesMessage(){
        Map<String,Object> map = new HashMap<>();
        List<String> list =  courseManagerService.getAbleCoursesInfo();
        map.put("data",list);
        map.put("statue",200);
        return map;
    }
    @ResponseBody
    @RequestMapping("/getAbleTeachers")
    public Map<String,Object> getAbleTeachersMessage(String cName,Integer semester){
        Map<String,Object> map = new HashMap<>();
        List<String> list =   courseManagerService.getAbleTeachersInfo(cName,semester);
        map.put("data",list);
        map.put("statue",200);
        return map;
    }


    @ResponseBody
    @RequestMapping(value = "/getCourseTypeMessage",method = RequestMethod.POST)
    public Map<String,Object> getCourseTypeMessage(String cName){
        Map<String,Object> map = new HashMap<>();
        String type = courseManagerService.getCourseTypeInfo(cName);
        map.put("type",type);
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/getAbleRoomsMessage",method = RequestMethod.POST)
    public Map<String,Object> getAbleRoomsMessage(@RequestBody TcInfo tcInfo){
        Map<String,Object> map = new HashMap<>();
        List<String> list = courseManagerService.getAbleRoomsInfo(tcInfo);
        map.put("data",list);
        map.put("statue",200);
        return map;
    }
    @ResponseBody
    @RequestMapping(value = "/getSemesterMessage",method = RequestMethod.POST)
    public Map<String,Object> getSemesterMessage(String cName){
        Map<String,Object> map = new HashMap<>();
        String type = courseManagerService.getCourseTypeInfo(cName);
        List<TcInfo>  list  = courseManagerService.getSemesterInfo(cName);
        map.put("data",list);
        map.put("type",type);
        map.put("statue",200);
        return map;
    }


    @ResponseBody
    @RequestMapping(value = "/getAbleSemesterMessage",method = RequestMethod.POST)
    public Map<String,Object> getAbleSemesterMessage(String cName){
        Map<String,Object> map = new HashMap<>();
        List<Integer> list = courseManagerService.getAbleSemesterInfo(cName);
        map.put("data",list);
        map.put("statue",200);
        return map;
    }
//删除
    @RequestMapping("/removeCoursesManagerMessage")
    @ResponseBody
    public Map<String,Object> removeCoursesManagerMessage(@RequestBody List<Integer> list){
        Map<String,Object> map = new HashMap<>();
        int index = courseManagerService.removeCoursesManagerInfo(list);
        map.put("statue",index);
        map.put("desc","成功删除");
        return map;
    }
    //添加
    @ResponseBody
    @RequestMapping("/addCoursesManagerMessage")
    public Map<String,Object> addCoursesManagerMessage(@RequestBody CourseManager courseManager){
        Map<String,Object> map = new HashMap<>();
        int statue = courseManagerService.addCoursesManagerInfo(courseManager);
        map.put("statue",statue);
        map.put("desc","成功添加");
        return map;
    }
    @ResponseBody
    @RequestMapping(value = "/getAllReadyTcMessage",method = RequestMethod.POST)
    public Map<String,Object> getAllReadyTcMessage(@RequestBody PartTcInfo tcInfo){
        System.out.println(tcInfo);
        Map<String,Object> map = new HashMap<>();
        List<TcInfo> list =  courseManagerService.getAllReadyTcInfo(tcInfo);
        map.put("data",list);
        map.put("statue",200);
        return map;
    }

    @ResponseBody
    @RequestMapping("/getDayMessage")
    public Map<String,Object> getDayMessage(@RequestBody PartTcInfo tcInfo){
        Map<String,Object> map = new HashMap<>();
        List<Integer>  list = courseManagerService.getDayInfo(tcInfo);
        map.put("data",list);
        return map;
    }
    @ResponseBody
    @RequestMapping("/modifyCoursesManagerMessage")
    public Map<String,Object> modifyCoursesManagerMessage(@RequestBody TwoCourseManager twoCourseManager){
        Map<String,Object> map = new HashMap<>();
        int index =   courseManagerService.modifyCoursesManagerInfo(twoCourseManager.getNewCourseManager());
        map.put("statue",index);
        map.put("desc","修改成功");
        return map;
    }
}
