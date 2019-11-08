package com.xiaomai.service;

import com.xiaomai.pojo.Users;

import java.util.List;

public interface UserService {
    //增加一个用户
    int addUser(Users users);
    //通过id删除一个用户
    int delUserById(int id);
    //根据Id查询一个用户
    Users queryUserById(int id);
    //根据用户名查询一个用户
    Users queryUserByName(String username);
    //更新一个用户
    int updateUser(Users users);
    //查询所有的用户
    List<Users> userList();
}
