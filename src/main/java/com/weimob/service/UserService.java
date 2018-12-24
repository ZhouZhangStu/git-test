package com.weimob.service;

import com.weimob.model.Users;

public interface UserService {

    int deleteByPrimaryKey(byte[] id);

    Users selectByPrimaryKey(byte[] id);

    int updateByPrimaryKey(Users record);


}
