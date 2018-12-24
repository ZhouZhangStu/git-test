package com.weimob.service;

import com.weimob.model.Users;

public interface UserService {

    int deleteByPrimaryKey(byte[] id);

    int insert(Users record);
    //插入操作
    int insertSelective(Users record);
}
