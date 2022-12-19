package com.newboot.service.impl;

import com.newboot.core.common.resp.RestResp;
import com.newboot.dto.resp.UserInfoRespDto;
import com.newboot.manage.cache.UserInfoCacheManager;
import com.newboot.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Description: 用户模块 服务实现类
 * @Author: hao
 * @CreateTime: 2022-12-18  22:39
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserInfoCacheManager userInfoCacheManager;

    @Override
    public RestResp<UserInfoRespDto> getUserInfo(Integer userId) {
        return RestResp.ok(userInfoCacheManager.getUserInfo(userId));
    }
}
