package cn.edu.guet.service.impl;

import cn.edu.guet.bean.Permission;
import cn.edu.guet.dao.IPermissionDao;
import cn.edu.guet.dao.impl.PermissionDaoImpl;
import cn.edu.guet.service.IPermissionService;

import java.util.List;

/**
 * @author jinyu
 * @date 2022/6/9 21:12
 */
public class PermissionServiceImpl implements IPermissionService {

    @Override
    public List<Permission> getPermission() {
        IPermissionDao permissionDao=new PermissionDaoImpl();
        return permissionDao.getPermission();
    }
}
