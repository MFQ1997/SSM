package com.xiaomai.service;

import com.xiaomai.mapper.UserMapper;
import com.xiaomai.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    /*@Autowired
    private UserMapper userMapper;*/
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    @Override
    public int addUser(Users users) {
        return userMapper.addUser(users);
    }

    @Override
    public int delUserById(int id) {
        return userMapper.delUserById(id);
    }

    @Override
    public Users queryUserById(int id) {
        return userMapper.queryUserById(id);
    }

    @Override
    public Users queryUserByName(String username) {
        return userMapper.queryUserByName(username);
    }

    @Override
    public int updateUser(Users users) {
        return userMapper.updateUser(users);
    }

    @Override
    public List<Users> userList() {
        return userMapper.userList();
    }
}
