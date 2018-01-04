package com.leadbank.mes.dal.model;

import java.math.BigDecimal;
import java.util.Date;

public class FFundThemeConceptRoseDo {
    private String themeConceptRoseId;

    private String themeId;

    private String workday;

    private BigDecimal weekRose;

    private BigDecimal monthRose;

    private BigDecimal quarterRose;

    private Date createTime;

    public String getThemeConceptRoseId() {
        return themeConceptRoseId;
    }

    public void setThemeConceptRoseId(String themeConceptRoseId) {
        this.themeConceptRoseId = themeConceptRoseId == null ? null : themeConceptRoseId.trim();
    }

    public String getThemeId() {
        return themeId;
    }

    public void setThemeId(String themeId) {
        this.themeId = themeId == null ? null : themeId.trim();
    }

    public String getWorkday() {
        return workday;
    }

    public void setWorkday(String workday) {
        this.workday = workday == null ? null : workday.trim();
    }

    public BigDecimal getWeekRose() {
        return weekRose;
    }

    public void setWeekRose(BigDecimal weekRose) {
        this.weekRose = weekRose;
    }

    public BigDecimal getMonthRose() {
        return monthRose;
    }

    public void setMonthRose(BigDecimal monthRose) {
        this.monthRose = monthRose;
    }

    public BigDecimal getQuarterRose() {
        return quarterRose;
    }

    public void setQuarterRose(BigDecimal quarterRose) {
        this.quarterRose = quarterRose;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}