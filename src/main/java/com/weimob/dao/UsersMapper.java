package com.weimob.dao;

import com.weimob.model.Users;

public interface UsersMapper {
    int deleteByPrimaryKey(byte[] id);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(byte[] id);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}