package com.leadbank.pdccore.dal.mybatis.dao;

import com.leadbank.pdccore.dal.mybatis.model.NNavInfoDO;

public interface NNavInfoDOMapper {
    int deleteByPrimaryKey(String navId);

    int insert(NNavInfoDO record);

    int insertSelective(NNavInfoDO record);

    NNavInfoDO selectByPrimaryKey(String navId);

    int updateByPrimaryKeySelective(NNavInfoDO record);

    int updateByPrimaryKey(NNavInfoDO record);
}