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
@TableName("t_comment")
public class TComment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 评论时间
     */
    private LocalDateTime createTime;

    /**
     * 被评论的商品的ID
     */
    private Integer productId;

    /**
     * 评论者ID
     */
    private Integer commentateorId;

    /**
     * 评论者昵称
     */
    private String commentatorName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getCommentateorId() {
        return commentateorId;
    }

    public void setCommentateorId(Integer commentateorId) {
        this.commentateorId = commentateorId;
    }

    public String getCommentatorName() {
        return commentatorName;
    }

    public void setCommentatorName(String commentatorName) {
        this.commentatorName = commentatorName;
    }

    @Override
    public String toString() {
        return "TComment{" +
        "id=" + id +
        ", content=" + content +
        ", createTime=" + createTime +
        ", productId=" + productId +
        ", commentateorId=" + commentateorId +
        ", commentatorName=" + commentatorName +
        "}";
    }
}
