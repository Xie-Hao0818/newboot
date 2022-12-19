package com.newboot.dto.resp;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Description: 用户信息 响应dto
 * @Author: hao
 * @CreateTime: 2022-12-19  13:37
 */
@Data
@Builder
public class UserInfoRespDto {
    /**
     * 昵称
     */
    @Schema(description = "昵称")
    private String userName;

    /**
     * 用户头像
     */
    @Schema(description = "用户职业")
    private String occupation;

    /**
     * 用户性别
     */
    @Schema(description = "用户性别")
    private String sex;
    /**
     * 用户邮箱
     */
    @Schema(description = "用户邮箱")
    private String email;

    /**
     * 用户注册时间
     */
    @Schema(description = "用户注册时间")
    private LocalDateTime registrationTime;
}
