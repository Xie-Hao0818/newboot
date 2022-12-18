package com.newboot.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author xiehao
 * @date 2022/12/18
 */
@TableName("t_user")
public class TUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户唯一标识
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 收货地址
     */
    private String address;

    /**
     * 出生年月日
     */
    private LocalDateTime birthday;

    /**
     * 身份证号
     */
    private String denityCode;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 密码
     */
    private String password;

    /**
     * 性别
     */
    private String sex;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 真实姓名
     */
    private String trueName;

    /**
     * 昵称
     */
    private String userName;

    /**
     * 注册时间
     */
    private LocalDateTime registrationTime;

    /**
     * 信誉等级
     */
    private Integer creditRating;

    /**
     * 最近在线时间
     */
    private LocalDateTime lastOnlineTime;

    /**
     * 职业
     */
    private String occupation;

    /**
     * 头像图片地址
     */
    private String headPortrait;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public String getDenityCode() {
        return denityCode;
    }

    public void setDenityCode(String denityCode) {
        this.denityCode = denityCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalDateTime getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(LocalDateTime registrationTime) {
        this.registrationTime = registrationTime;
    }

    public Integer getCreditRating() {
        return creditRating;
    }

    public void setCreditRating(Integer creditRating) {
        this.creditRating = creditRating;
    }

    public LocalDateTime getLastOnlineTime() {
        return lastOnlineTime;
    }

    public void setLastOnlineTime(LocalDateTime lastOnlineTime) {
        this.lastOnlineTime = lastOnlineTime;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getHeadPortrait() {
        return headPortrait;
    }

    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait;
    }

    @Override
    public String toString() {
        return "TUser{" +
        "id=" + id +
        ", address=" + address +
        ", birthday=" + birthday +
        ", denityCode=" + denityCode +
        ", email=" + email +
        ", mobile=" + mobile +
        ", password=" + password +
        ", sex=" + sex +
        ", status=" + status +
        ", trueName=" + trueName +
        ", userName=" + userName +
        ", registrationTime=" + registrationTime +
        ", creditRating=" + creditRating +
        ", lastOnlineTime=" + lastOnlineTime +
        ", occupation=" + occupation +
        ", headPortrait=" + headPortrait +
        "}";
    }
}
