package com.funfund.dao;

import com.funfund.pojo.Portfolio;

public interface PortfolioMapper {
    int insert(Portfolio record);

    int insertSelective(Portfolio record);
}