package com.tk.dao.mapper;

import com.tk.entity.TUser;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserMapper {

    TUser selectByPrimaryKey(@Param("id") Integer id);

}