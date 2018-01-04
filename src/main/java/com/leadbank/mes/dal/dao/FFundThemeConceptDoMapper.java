package com.leadbank.mes.dal.dao;

import com.leadbank.mes.dal.model.FFundThemeConceptDo;

public interface FFundThemeConceptDoMapper {
    int deleteByPrimaryKey(String themeConceptId);

    int insert(FFundThemeConceptDo record);

    int insertSelective(FFundThemeConceptDo record);

    FFundThemeConceptDo selectByPrimaryKey(String themeConceptId);

    int updateByPrimaryKeySelective(FFundThemeConceptDo record);

    int updateByPrimaryKey(FFundThemeConceptDo record);
}