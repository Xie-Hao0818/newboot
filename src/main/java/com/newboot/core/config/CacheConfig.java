package com.newboot.core.config;

import com.newboot.core.constant.CacheConsts;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCacheWriter;
import org.springframework.data.redis.connection.RedisConnectionFactory;

import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 缓存配置类
 *
 * @author hao
 * @date 2022/5/12
 */
@Configuration
public class CacheConfig extends CachingConfigurerSupport {


    /**
     * Redis 缓存管理器
     */
    @Bean
    public CacheManager redisCacheManager(RedisConnectionFactory connectionFactory) {
        RedisCacheWriter redisCacheWriter = RedisCacheWriter.nonLockingRedisCacheWriter(
                connectionFactory);

        RedisCacheConfiguration defaultCacheConfig = RedisCacheConfiguration.defaultCacheConfig()
                .disableCachingNullValues().prefixCacheNameWith(CacheConsts.REDIS_CACHE_PREFIX);


        Map<String, RedisCacheConfiguration> cacheMap = new LinkedHashMap<>(
                CacheConsts.CacheEnum.values().length);
        // 类型推断 var 非常适合 for 循环，JDK 10 引入，JDK 11 改进
        for (var c : CacheConsts.CacheEnum.values()) {
            if (c.isRemote()) {
                if (c.getTtl() > 0) {
                    cacheMap.put(c.getName(),
                            RedisCacheConfiguration.defaultCacheConfig().disableCachingNullValues()
                                    .prefixCacheNameWith(CacheConsts.REDIS_CACHE_PREFIX)
                                    .entryTtl(Duration.ofSeconds(c.getTtl())));
                } else {
                    cacheMap.put(c.getName(),
                            RedisCacheConfiguration.defaultCacheConfig().disableCachingNullValues()
                                    .prefixCacheNameWith(CacheConsts.REDIS_CACHE_PREFIX));
                }
            }
        }

        RedisCacheManager redisCacheManager = new RedisCacheManager(redisCacheWriter,
                defaultCacheConfig, cacheMap);
        redisCacheManager.setTransactionAware(true);
        redisCacheManager.initializeCaches();
        return redisCacheManager;
    }


}
