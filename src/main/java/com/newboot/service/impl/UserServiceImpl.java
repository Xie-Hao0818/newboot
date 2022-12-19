package com.newboot.service.impl;

import com.newboot.core.common.resp.RestResp;
import com.newboot.dao.entity.TUser;
import com.newboot.dao.mapper.TUserMapper;
import com.newboot.dto.resp.UserInfoRespDto;
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
    private final TUserMapper userMapper;

    @Override
    public RestResp<UserInfoRespDto> getUserInfo(Long userId) {
        TUser user = userMapper.selectById(userId);
        return RestResp.ok(UserInfoRespDto.builder()
                .occupation(user.getOccupation())
                .registrationTime(user.getRegistrationTime())
                .email(user.getEmail())
                .userName(user.getUserName())
                .sex(user.getSex())
                .build());
    }
}
