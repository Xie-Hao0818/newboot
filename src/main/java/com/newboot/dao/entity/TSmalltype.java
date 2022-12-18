package com.newboot.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author xiehao
 * @date 2022/12/18
 */
@TableName("t_smalltype")
public class TSmalltype implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 大分类外键
     */
    private Integer bigTypeId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getBigTypeId() {
        return bigTypeId;
    }

    public void setBigTypeId(Integer bigTypeId) {
        this.bigTypeId = bigTypeId;
    }

    @Override
    public String toString() {
        return "TSmalltype{" +
        "id=" + id +
        ", name=" + name +
        ", remarks=" + remarks +
        ", bigTypeId=" + bigTypeId +
        "}";
    }
}
