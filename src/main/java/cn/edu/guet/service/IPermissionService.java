package cn.edu.guet.service;

import cn.edu.guet.bean.Permission;

import java.util.List;

/**
 * @author jinyu
 * @date 2022/6/9 21:09
 */
public interface IPermissionService {
    List<Permission> getPermission();
}
