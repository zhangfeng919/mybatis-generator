package com.integration.dao;

import com.integration.entity.IomAuthLog;
import java.math.BigDecimal;
import java.util.List;

public interface IomAuthLogMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(IomAuthLog record);

    IomAuthLog selectByPrimaryKey(BigDecimal id);

    List<IomAuthLog> selectAll();

    int updateByPrimaryKey(IomAuthLog record);
}