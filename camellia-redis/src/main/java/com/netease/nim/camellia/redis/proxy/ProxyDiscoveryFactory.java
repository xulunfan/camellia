package com.netease.nim.camellia.redis.proxy;

/**
 *
 * Created by caojiajun on 2021/4/13
 */
public interface ProxyDiscoveryFactory {

    ProxyDiscovery getProxyDiscovery(String proxyName);
}
