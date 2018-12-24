package com.weimob.service;

import com.weimob.model.Users;

public interface UserService {

    int deleteByPrimaryKey(byte[] id);

    int insert(Users record);
    //插入操作，  阿萨德大所多多风吧
    int insertSelective(Users record);
}
