package com.newboot.service;

import com.newboot.core.common.resp.RestResp;
import com.newboot.dto.resp.UserInfoRespDto;

/**
 * @Author: hao
 * @CreateTime: 2022-12-18  22:38
 * @Description:
 */
public interface UserService {
    /**
     * 用户信息查询
     * @param userId 用户ID
     * @return 用户信息
     */
    RestResp<UserInfoRespDto> getUserInfo(Integer userId);
}
