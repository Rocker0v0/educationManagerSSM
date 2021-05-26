package com.service.gradeManagerServiceImp;

import com.dao.GradeManagerDao;
import com.service.GradeManagerService;
import com.vo.gradeManagerVo.GradeManagerAllInfo;
import com.vo.gradeManagerVo.GradeManagerSelectByType;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GradeManagerServiceImpl implements GradeManagerService {

    @Resource
    private GradeManagerDao gradeManagerDao;

    @Override
    public List<GradeManagerAllInfo> getGradeManagerAllList(GradeManagerSelectByType gradeManagerSelectByType) {

        List<GradeManagerAllInfo> list = gradeManagerDao.getGradeManagerAllInfo(gradeManagerSelectByType);
        return list;
    }

    @Override
    public List<String> getAllReadCourseName(String teacherId, String year) {

        List<String> list = gradeManagerDao.getAllReadChooseCourseName(teacherId,year);
        return list;
    }
    @Override
    public List<String> getAllReadClassName(Integer year, String courseName,String teacherId) {
        List<String> list = gradeManagerDao.getAllReadChooseClassName(year,courseName,teacherId);
        return list;
    }

    @Override
    public Integer removeScInfoByPrimaryIdsInfo(List<Integer> list) {
       Integer index =  gradeManagerDao.removeScInfoByPrimaryIds(list);
        return index;
    }

    @Override
    public Integer modifyScInfoByPrimaryIdsInfo(Integer primaryId, Integer grade) {
       Integer items = gradeManagerDao.modifyScInfoByPrimaryIds(primaryId,grade);
        return items;
    }
}
