package com.service.deptManagerServiceImp;

import com.dao.DeptMangerDao;
import com.service.DeptManagerService;
import com.vo.deptManagerVo.DeptManagerVo;
import com.vo.deptManagerVo.SelectDeptManagerByType;
import com.vo.deptManagerVo.TwoDeptManagerVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DeptManagerServiceImpl implements DeptManagerService {
    @Resource
    private DeptMangerDao deptMangerDao;

    @Override
    public List<DeptManagerVo> getDeptManagerInfo(SelectDeptManagerByType selectDeptManagerByType) {

        List<DeptManagerVo> list = deptMangerDao.getAllDeptInfoByType(selectDeptManagerByType);

        return list;
    }

    @Override
    public List<String> getDeptAndMajorNameInfo() {
        List<String> list = deptMangerDao.getDeptAndMajorName();
        return list;
    }

    @Override
    public Integer addDeptList(DeptManagerVo deptManagerVo) {
        Integer result = null;

        String deptName = deptMangerDao.getDeptIdByName(deptManagerVo.getDeptName());

        if (deptName!=null){
            result = -2;
            return result;
        }

        Integer majorNumber = deptMangerDao.getMajorNumber(deptManagerVo.getParentDeptName());
        Integer deptNumber = deptMangerDao.getDeptNumber();
        if (majorNumber >= 9 || deptNumber>=9) {
            result = -1;
            return result;
        }
        String parentId = deptMangerDao.getParentIdByName(deptManagerVo.getParentDeptName());
        System.out.println(parentId);
        boolean statue = true;
        Integer currentIndex = 0;
        String strId = "";
        String thisName = null;
        while (statue) {
            currentIndex++;

            strId = currentIndex + "";

            if (parentId.equals("000")) {
                thisName = deptMangerDao.getDeptNameById("08" + strId);
            } else {
                thisName = deptMangerDao.getDeptNameById(parentId + strId);
            }
            if (thisName == null) {
                statue = false;
            }
        }
        if (parentId.equals("000")) {
            deptManagerVo.setDeptId("08" + strId);
        } else {
            deptManagerVo.setDeptId(parentId + strId);
        }
        System.out.println(deptMangerDao);
        result = deptMangerDao.addDeptInfo(deptManagerVo);
        return result;
    }

    @Override
    public Integer removeDeptList(List<String> list) {
       Integer items =  deptMangerDao.removeDeptInfo(list);
        return items;
    }

    @Override
    public Integer modifyDeptList(TwoDeptManagerVo twoDeptManagerVo) {
        Integer items = null;
        if (twoDeptManagerVo.getOldDeptManagerVo().equals(twoDeptManagerVo.getNewDeptManagerVo())){
            items = -2;
            return items;
        }

       String deptId = deptMangerDao.getDeptByNameForModify(twoDeptManagerVo.getNewDeptManagerVo().getDeptName());
       if(deptId!=null && twoDeptManagerVo.getOldDeptManagerVo().getDirector().equals(twoDeptManagerVo.getNewDeptManagerVo().getDirector())){
           items = -1;
           return items;
       }
         items =  deptMangerDao.modifyDeptInfo(twoDeptManagerVo.getNewDeptManagerVo());
        return items;
    }
}
