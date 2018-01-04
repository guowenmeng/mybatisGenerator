package com.leadbank.mes.dal.dao;

import com.leadbank.mes.dal.model.FFundThemeConceptRoseDo;

public interface FFundThemeConceptRoseDoMapper {
    int deleteByPrimaryKey(String themeConceptRoseId);

    int insert(FFundThemeConceptRoseDo record);

    int insertSelective(FFundThemeConceptRoseDo record);

    FFundThemeConceptRoseDo selectByPrimaryKey(String themeConceptRoseId);

    int updateByPrimaryKeySelective(FFundThemeConceptRoseDo record);

    int updateByPrimaryKey(FFundThemeConceptRoseDo record);
}