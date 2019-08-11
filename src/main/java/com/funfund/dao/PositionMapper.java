package com.funfund.dao;

import com.funfund.pojo.Position;

public interface PositionMapper {
    int insert(Position record);

    int insertSelective(Position record);
}