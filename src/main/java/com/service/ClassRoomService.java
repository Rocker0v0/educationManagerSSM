package com.service;

import com.vo.classRoomVo.ClassRoomVo;
import com.vo.classRoomVo.SelectClassRoomInfoByType;
import com.vo.classRoomVo.TwoClassRoomVo;

import java.util.List;

public interface ClassRoomService {

    List<ClassRoomVo> getAllClassRoomList(SelectClassRoomInfoByType selectClassRoomInfoByType);

    Integer addClassRoomList(ClassRoomVo classRoomVo);

    Integer removeClassRoomList(List<String> list);

    Integer modifyClassRoomList(TwoClassRoomVo twoClassRoomVo);
}
