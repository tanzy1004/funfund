package com.funfund.dao;

import com.funfund.pojo.Security;

public interface SecurityMapper {
    int insert(Security record);

    int insertSelective(Security record);
}