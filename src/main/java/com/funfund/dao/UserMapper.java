package com.funfund.dao;

import com.funfund.pojo.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}