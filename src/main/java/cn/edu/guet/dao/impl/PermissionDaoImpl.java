package cn.edu.guet.dao.impl;

import cn.edu.guet.bean.Permission;
import cn.edu.guet.dao.IPermissionDao;
import cn.edu.guet.service.IPermissionService;
import cn.edu.guet.service.impl.PermissionServiceImpl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author jinyu
 * @date 2022/6/9 21:15
 */
public class PermissionDaoImpl implements IPermissionDao {
    @Override
    public List<Permission> getPermission() {
        Connection conn = null;
        String user = "root";// mysql的用户名
        String pwd = "123456";
        String url = "jdbc:mysql://localhost:3306/teashop?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        String sql = "SELECT * FROM permission";
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Permission> permissionList=new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pwd);
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            // rs.next：游标向下移动
            while(rs.next()){
                Permission permission=new Permission();
                permission.setId(rs.getString("permission_id"));
                permission.setpId(rs.getString("pid"));
                permission.setName(rs.getString("permission_name"));
                permission.setUrl(rs.getString("url"));
                permission.setIcon(rs.getString("icon"));
                permission.setTarget(rs.getString("target"));
                permission.setIsParent(rs.getString("isParent"));

                permissionList.add(permission);//把芒果放入麻袋
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                rs.close();
                pstmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return permissionList;//返回集合（把装满芒果的麻袋，扛到车上）

    }

    @Override
    public List<Permission> seekPermission(String seekName) {
        Connection conn = null;
        String user = "root";// mysql的用户名
        String pwd = "123456";
        String url = "jdbc:mysql://localhost:3306/teashop?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        String sql = "SELECT * FROM permission WHERE permission_name='"+seekName+"'";
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Permission> permissionList=new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pwd);
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            // rs.next：游标向下移动
            while(rs.next()){
                Permission permission=new Permission();
                permission.setId(rs.getString("permission_id"));
                permission.setpId(rs.getString("pid"));
                permission.setName(rs.getString("permission_name"));
                permission.setUrl(rs.getString("url"));
                permission.setIcon(rs.getString("icon"));
                permission.setTarget(rs.getString("target"));
                permission.setIsParent(rs.getString("isParent"));

                permissionList.add(permission);//把芒果放入麻袋
                System.out.println(permissionList);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                rs.close();
                pstmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return permissionList;//返回集合（把装满芒果的麻袋，扛到车上）
    }

    @Override
    public int deletePermission(String id) {
        return 0;
    }

}
