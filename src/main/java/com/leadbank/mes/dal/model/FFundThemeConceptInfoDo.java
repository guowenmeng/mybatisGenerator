package com.leadbank.mes.dal.model;

import java.util.Date;

public class FFundThemeConceptInfoDo {
    private String themeConceptInfoId;

    private String themeId;

    private String fundCode;

    private String status;

    private Date createTime;

    public String getThemeConceptInfoId() {
        return themeConceptInfoId;
    }

    public void setThemeConceptInfoId(String themeConceptInfoId) {
        this.themeConceptInfoId = themeConceptInfoId == null ? null : themeConceptInfoId.trim();
    }

    public String getThemeId() {
        return themeId;
    }

    public void setThemeId(String themeId) {
        this.themeId = themeId == null ? null : themeId.trim();
    }

    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode == null ? null : fundCode.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}