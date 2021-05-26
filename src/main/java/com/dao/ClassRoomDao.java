package com.dao;

import com.vo.classRoomVo.ClassRoomVo;
import com.vo.classRoomVo.SelectClassRoomInfoByType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClassRoomDao {
    List<ClassRoomVo> getAllClassRoom(SelectClassRoomInfoByType selectClassRoomInfoByType);

    String getClassRoomId(@Param("classRoomName")String classRoomName);

    Integer addClassRoomInfo(ClassRoomVo classRoomVo);

    Integer removeClassRoomInfo(List<String> list);

    Integer modifyClassRoomInfo(ClassRoomVo classRoomVo);
}
