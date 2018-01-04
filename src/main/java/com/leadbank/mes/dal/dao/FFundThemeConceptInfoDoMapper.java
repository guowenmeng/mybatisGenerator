package com.leadbank.mes.dal.dao;

import com.leadbank.mes.dal.model.FFundThemeConceptInfoDo;

public interface FFundThemeConceptInfoDoMapper {
    int deleteByPrimaryKey(String themeConceptInfoId);

    int insert(FFundThemeConceptInfoDo record);

    int insertSelective(FFundThemeConceptInfoDo record);

    FFundThemeConceptInfoDo selectByPrimaryKey(String themeConceptInfoId);

    int updateByPrimaryKeySelective(FFundThemeConceptInfoDo record);

    int updateByPrimaryKey(FFundThemeConceptInfoDo record);
}