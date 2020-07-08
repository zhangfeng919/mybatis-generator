package com.integration.entity;

import java.math.BigDecimal;
import java.util.Date;

public class IomAuthLog {
    private BigDecimal id;

    private String projectNum;

    private String projectName;

    private String contractNum;

    private String version;

    private String customerName;

    private String phone;

    private String authCode;

    private String clientCode;

    private String registerMan;

    private Date registerTime;

    private Date validDate;

    private Integer authUserNum;

    private Integer authDoorNum;

    private Integer authCabinetNum;

    private Integer authViewNum;

    private Integer authSceneNum;

    private String status;

    private BigDecimal cjrId;

    private Date cjsj;

    private BigDecimal xgrId;

    private Date xgsj;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getProjectNum() {
        return projectNum;
    }

    public void setProjectNum(String projectNum) {
        this.projectNum = projectNum == null ? null : projectNum.trim();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getContractNum() {
        return contractNum;
    }

    public void setContractNum(String contractNum) {
        this.contractNum = contractNum == null ? null : contractNum.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode == null ? null : authCode.trim();
    }

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode == null ? null : clientCode.trim();
    }

    public String getRegisterMan() {
        return registerMan;
    }

    public void setRegisterMan(String registerMan) {
        this.registerMan = registerMan == null ? null : registerMan.trim();
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Date getValidDate() {
        return validDate;
    }

    public void setValidDate(Date validDate) {
        this.validDate = validDate;
    }

    public Integer getAuthUserNum() {
        return authUserNum;
    }

    public void setAuthUserNum(Integer authUserNum) {
        this.authUserNum = authUserNum;
    }

    public Integer getAuthDoorNum() {
        return authDoorNum;
    }

    public void setAuthDoorNum(Integer authDoorNum) {
        this.authDoorNum = authDoorNum;
    }

    public Integer getAuthCabinetNum() {
        return authCabinetNum;
    }

    public void setAuthCabinetNum(Integer authCabinetNum) {
        this.authCabinetNum = authCabinetNum;
    }

    public Integer getAuthViewNum() {
        return authViewNum;
    }

    public void setAuthViewNum(Integer authViewNum) {
        this.authViewNum = authViewNum;
    }

    public Integer getAuthSceneNum() {
        return authSceneNum;
    }

    public void setAuthSceneNum(Integer authSceneNum) {
        this.authSceneNum = authSceneNum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public BigDecimal getCjrId() {
        return cjrId;
    }

    public void setCjrId(BigDecimal cjrId) {
        this.cjrId = cjrId;
    }

    public Date getCjsj() {
        return cjsj;
    }

    public void setCjsj(Date cjsj) {
        this.cjsj = cjsj;
    }

    public BigDecimal getXgrId() {
        return xgrId;
    }

    public void setXgrId(BigDecimal xgrId) {
        this.xgrId = xgrId;
    }

    public Date getXgsj() {
        return xgsj;
    }

    public void setXgsj(Date xgsj) {
        this.xgsj = xgsj;
    }
}