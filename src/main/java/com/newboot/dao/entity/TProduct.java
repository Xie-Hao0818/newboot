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
@TableName("t_product")
public class TProduct implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商品描述
     */
    private String description;

    /**
     * 商品是否热门
     */
    private Integer hot;

    /**
     * 商品热门时间
     */
    private LocalDateTime hotTime;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 价格
     */
    private Float price;

    /**
     * 商品图片地址
     */
    private String proPic;

    /**
     * 是否特价商品
     */
    private Integer specialPrice;

    /**
     * 特价时间
     */
    private LocalDateTime specialPriceTime;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 商品大分类id
     */
    private Integer bigTypeId;

    /**
     * 商品小分类id
     */
    private Integer smallTypeId;

    /**
     * 交易方式
     */
    private String transactionMode;

    /**
     * 想要人数
     */
    private Integer desiredNumber;

    /**
     * 发布地
     */
    private String issuePlace;

    /**
     * 浏览次数
     */
    private Integer viewNum;

    /**
     * 发布者ID
     */
    private Integer issueId;

    /**
     * 发布时间
     */
    private LocalDateTime issueTime;

    /**
     * 商品状态
     */
    private Integer status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getHot() {
        return hot;
    }

    public void setHot(Integer hot) {
        this.hot = hot;
    }

    public LocalDateTime getHotTime() {
        return hotTime;
    }

    public void setHotTime(LocalDateTime hotTime) {
        this.hotTime = hotTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getProPic() {
        return proPic;
    }

    public void setProPic(String proPic) {
        this.proPic = proPic;
    }

    public Integer getSpecialPrice() {
        return specialPrice;
    }

    public void setSpecialPrice(Integer specialPrice) {
        this.specialPrice = specialPrice;
    }

    public LocalDateTime getSpecialPriceTime() {
        return specialPriceTime;
    }

    public void setSpecialPriceTime(LocalDateTime specialPriceTime) {
        this.specialPriceTime = specialPriceTime;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getBigTypeId() {
        return bigTypeId;
    }

    public void setBigTypeId(Integer bigTypeId) {
        this.bigTypeId = bigTypeId;
    }

    public Integer getSmallTypeId() {
        return smallTypeId;
    }

    public void setSmallTypeId(Integer smallTypeId) {
        this.smallTypeId = smallTypeId;
    }

    public String getTransactionMode() {
        return transactionMode;
    }

    public void setTransactionMode(String transactionMode) {
        this.transactionMode = transactionMode;
    }

    public Integer getDesiredNumber() {
        return desiredNumber;
    }

    public void setDesiredNumber(Integer desiredNumber) {
        this.desiredNumber = desiredNumber;
    }

    public String getIssuePlace() {
        return issuePlace;
    }

    public void setIssuePlace(String issuePlace) {
        this.issuePlace = issuePlace;
    }

    public Integer getViewNum() {
        return viewNum;
    }

    public void setViewNum(Integer viewNum) {
        this.viewNum = viewNum;
    }

    public Integer getIssueId() {
        return issueId;
    }

    public void setIssueId(Integer issueId) {
        this.issueId = issueId;
    }

    public LocalDateTime getIssueTime() {
        return issueTime;
    }

    public void setIssueTime(LocalDateTime issueTime) {
        this.issueTime = issueTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "TProduct{" +
        "id=" + id +
        ", description=" + description +
        ", hot=" + hot +
        ", hotTime=" + hotTime +
        ", name=" + name +
        ", price=" + price +
        ", proPic=" + proPic +
        ", specialPrice=" + specialPrice +
        ", specialPriceTime=" + specialPriceTime +
        ", stock=" + stock +
        ", bigTypeId=" + bigTypeId +
        ", smallTypeId=" + smallTypeId +
        ", transactionMode=" + transactionMode +
        ", desiredNumber=" + desiredNumber +
        ", issuePlace=" + issuePlace +
        ", viewNum=" + viewNum +
        ", issueId=" + issueId +
        ", issueTime=" + issueTime +
        ", status=" + status +
        "}";
    }
}
