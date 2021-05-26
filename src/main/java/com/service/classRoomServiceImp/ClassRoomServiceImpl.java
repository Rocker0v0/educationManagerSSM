package com.service.classRoomServiceImp;

import com.dao.ClassRoomDao;
import com.service.ClassRoomService;
import com.vo.classRoomVo.ClassRoomVo;
import com.vo.classRoomVo.SelectClassRoomInfoByType;
import com.vo.classRoomVo.TwoClassRoomVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ClassRoomServiceImpl implements ClassRoomService {

    @Resource
    private ClassRoomDao classRoomDao;

    @Override
    public List<ClassRoomVo> getAllClassRoomList(SelectClassRoomInfoByType selectClassRoomInfoByType) {
        return classRoomDao.getAllClassRoom(selectClassRoomInfoByType);
    }

    @Override
    public Integer addClassRoomList(ClassRoomVo classRoomVo) {

        Integer result = null;
        String classRoomId = classRoomDao.getClassRoomId(classRoomVo.getClassRoomName());
        if (classRoomId != null) {
            result = -1;
            return result;
        }
        result = classRoomDao.addClassRoomInfo(classRoomVo);
        return result;
    }

    @Override
    public Integer removeClassRoomList(List<String> list) {
        return classRoomDao.removeClassRoomInfo(list);
    }

    @Override
    public Integer modifyClassRoomList(TwoClassRoomVo twoClassRoomVo) {
        Integer items = null;
        if (twoClassRoomVo.getOldClassRoomVo().equals(twoClassRoomVo.getNewClassRoomVo())) {
            items = -2;
            return items;
        }
        String classRoonId = classRoomDao.getClassRoomId(twoClassRoomVo.getNewClassRoomVo().getClassRoomName());
        if (classRoonId != null && twoClassRoomVo.getOldClassRoomVo().getDescribe().equals(twoClassRoomVo.getNewClassRoomVo().getDescribe())) {
            items = -1;
            return items;
        }
        items = classRoomDao.modifyClassRoomInfo(twoClassRoomVo.getNewClassRoomVo());
        return items;
    }
}
