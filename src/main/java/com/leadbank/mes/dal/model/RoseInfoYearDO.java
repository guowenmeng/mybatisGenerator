package com.leadbank.mes.dal.model;

import java.math.BigDecimal;
import java.util.Date;

public class RoseInfoYearDO {
    private String roseInfoId;

    private String fundCode;

    private BigDecimal rose;

    private String roseDateType;

    private String workday;

    private Date createTime;

    private Date updateTime;

    public String getRoseInfoId() {
        return roseInfoId;
    }

    public void setRoseInfoId(String roseInfoId) {
        this.roseInfoId = roseInfoId == null ? null : roseInfoId.trim();
    }

    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode == null ? null : fundCode.trim();
    }

    public BigDecimal getRose() {
        return rose;
    }

    public void setRose(BigDecimal rose) {
        this.rose = rose;
    }

    public String getRoseDateType() {
        return roseDateType;
    }

    public void setRoseDateType(String roseDateType) {
        this.roseDateType = roseDateType == null ? null : roseDateType.trim();
    }

    public String getWorkday() {
        return workday;
    }

    public void setWorkday(String workday) {
        this.workday = workday == null ? null : workday.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}