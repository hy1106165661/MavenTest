package com.tk.service.impl;

import com.tk.dao.mapper.TUserMapper;
import com.tk.entity.TUser;
import com.tk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private TUserMapper userMapper;
    public TUser selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
