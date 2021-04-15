package com.spring.elasticjob.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

public class MyElasticJob implements SimpleJob {
    @Override
    public void execute(ShardingContext shardingContext) {
        String shardingParameter = shardingContext.getShardingParameter();
        int shardingItem = shardingContext.getShardingItem();
        System.out.println("测试elastic-job,param:"+shardingParameter+" 分片id:"+shardingItem);
    }
}
