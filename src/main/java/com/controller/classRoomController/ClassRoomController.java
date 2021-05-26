package com.controller.classRoomController;

import com.github.pagehelper.PageHelper;
import com.service.ClassRoomService;
import com.vo.classManagerVo.ClassManagerVo;
import com.vo.classRoomVo.ClassRoomVo;
import com.vo.classRoomVo.SelectClassRoomInfoByType;
import com.vo.classRoomVo.TwoClassRoomVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ClassRoomController {

    @Resource
    private ClassRoomService classRoomService;

    @RequestMapping("/getAllClassRoom")
    @ResponseBody
    public Map<String,Object> getAllClassRoom(@RequestBody SelectClassRoomInfoByType selectClassRoomInfoByType) {
        Map<String, Object> resMap = new HashMap<>();
        List<ClassRoomVo> list1 = classRoomService.getAllClassRoomList(selectClassRoomInfoByType);
        PageHelper.startPage(selectClassRoomInfoByType.getPage(),selectClassRoomInfoByType.getItems());
        List<ClassRoomVo> list2 = classRoomService.getAllClassRoomList(selectClassRoomInfoByType);
        Integer index = list1.size();
        resMap.put("status", 200);
        resMap.put("desc", "success!");
        resMap.put("data", list2);
        resMap.put("index",index);
        return resMap;
    }

    @RequestMapping("/AddClassRoom")
    @ResponseBody
    public Map<String,Object> AddClassRoom(@RequestBody ClassRoomVo classRoomVo) {
        Map<String, Object> resMap = new HashMap<>();
        Integer integer = classRoomService.addClassRoomList(classRoomVo);
        resMap.put("status", integer);
        resMap.put("desc", "success!");
        return resMap;
    }

    @RequestMapping("/removeClassRoom")
    @ResponseBody
    public Map<String,Object> removeClassRoom(@RequestBody List<String> list) {
        Map<String, Object> resMap = new HashMap<>();
        Integer integer = classRoomService.removeClassRoomList(list);
        resMap.put("status", integer);
        resMap.put("desc", "success!");
        return resMap;
    }

    @RequestMapping("/modifyClassRoom")
    @ResponseBody
    public Map<String,Object> modifyClassRoom(@RequestBody TwoClassRoomVo twoClassRoomVo) {
        Map<String, Object> resMap = new HashMap<>();
        Integer integer = classRoomService.modifyClassRoomList(twoClassRoomVo);
        resMap.put("status", integer);
        resMap.put("desc", "success!");
        return resMap;
    }
}
