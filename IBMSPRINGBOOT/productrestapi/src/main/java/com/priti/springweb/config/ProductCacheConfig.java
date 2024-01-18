package com.priti.springweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hazelcast.config.*;


@Configuration
public class ProductCacheConfig {

//	@Bean
//	public Config cacheConfig() {
//		return new Config()
//				.setInstanceName("hazel-instance")
//				.addMapConfig(new MapConfig()
//						.setName("product-cache")
//						.setTimeToLiveSeconds(3000)
//						.setMaxSizeConfig(new MaxSizeConfig(200, MaxSizePolicy.FREE_HEAP_SIZE))
//						.setEvictionPolicy()
//	}
}
