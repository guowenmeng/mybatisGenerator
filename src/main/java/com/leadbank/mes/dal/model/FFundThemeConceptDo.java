package com.leadbank.mes.dal.model;

import java.util.Date;

public class FFundThemeConceptDo {
    private String themeConceptId;

    private String themeId;

    private String themeName;

    private String status;

    private Date createTime;

    public String getThemeConceptId() {
        return themeConceptId;
    }

    public void setThemeConceptId(String themeConceptId) {
        this.themeConceptId = themeConceptId == null ? null : themeConceptId.trim();
    }

    public String getThemeId() {
        return themeId;
    }

    public void setThemeId(String themeId) {
        this.themeId = themeId == null ? null : themeId.trim();
    }

    public String getThemeName() {
        return themeName;
    }

    public void setThemeName(String themeName) {
        this.themeName = themeName == null ? null : themeName.trim();
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