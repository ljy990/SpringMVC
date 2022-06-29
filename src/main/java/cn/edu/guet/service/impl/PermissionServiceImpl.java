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

    @Override
    public List<Permission> seekPermission(String seekName){
        IPermissionDao permissionDao=new PermissionDaoImpl();
        return permissionDao.seekPermission(seekName);
    }

    @Override
    public int deletePermission(String id) {
        IPermissionDao permissionDao=new PermissionDaoImpl();
        return permissionDao.deletePermission(id);
    }

    @Override
    public List<Permission> insertPermission(String id, String name, String newurl, String icon) {
        IPermissionDao permissionDao=new PermissionDaoImpl();
        return permissionDao.insertPermission(id, name, newurl, icon);
    }

    @Override
    public List<Permission> modifyPermission(String id, String name, String newUrl, String newIcon) {
        IPermissionDao permissionDao=new PermissionDaoImpl();
        return permissionDao.modifyPermission(id, name, newUrl, newIcon);
    }

}
