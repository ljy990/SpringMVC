package cn.edu.guet.dao;

import cn.edu.guet.bean.Permission;

import java.util.List;

/**
 * @author jinyu
 * @date 2022/6/9 21:14
 */
public interface IPermissionDao {
    List<Permission> getPermission();
}
