package com.newboot.manage.cache;

import com.newboot.core.constant.CacheConsts;
import com.newboot.dao.entity.TUser;
import com.newboot.dao.mapper.TUserMapper;
import com.newboot.dto.resp.UserInfoRespDto;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * 用户信息 缓存管理类
 *
 * @author hao
 * @date 2022/5/12
 */
@Component
@RequiredArgsConstructor
public class UserInfoCacheManager {

    private final TUserMapper userInfoMapper;

    /**
     * 查询用户信息，并放入缓存中
     */
    @Cacheable(cacheManager = CacheConsts.REDIS_CACHE_MANAGER,
            value = CacheConsts.USER_INFO_CACHE_NAME, unless = "#result == null")
    public UserInfoRespDto getUserInfo(Integer userId) {
        TUser user = userInfoMapper.selectById(userId);
        if (Objects.isNull(user)) {
            return null;
        }
        return UserInfoRespDto.builder()
                .occupation(user.getOccupation())
                .registrationTime(user.getRegistrationTime())
                .email(user.getEmail())
                .userName(user.getUserName())
                .sex(user.getSex())
                .build();
    }


}
