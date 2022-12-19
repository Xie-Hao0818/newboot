package com.newboot.controller;

import com.newboot.core.common.resp.RestResp;
import com.newboot.core.constant.ApiRouterConsts;
import com.newboot.dto.resp.UserInfoRespDto;
import com.newboot.service.UserService;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 前台门户-用户模块 API 控制器
 * @Author: hao
 * @CreateTime: 2022-12-19  14:02
 */
@Tag(name = "UserController", description = "前台门户-用户模块")
@RestController
@RequiredArgsConstructor
@RequestMapping(ApiRouterConsts.API_USER_URL_PREFIX)
public class UserController {
    private final UserService userService;

    @GetMapping("/getUserInfo")
    public RestResp<UserInfoRespDto> getUserInfo(@Parameter(ref = "uid") String userId) {
        return userService.getUserInfo(Long.valueOf(userId));
    }
}
