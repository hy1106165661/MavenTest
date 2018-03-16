package com.tk.service;

import com.tk.entity.TUser;

public interface UserService {
    TUser selectByPrimaryKey(Integer id);
}
