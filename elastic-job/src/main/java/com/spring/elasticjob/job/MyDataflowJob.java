package com.spring.elasticjob.job;

import com.dangdang.ddframe.job.api.ElasticJob;
import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.dataflow.DataflowJob;
import com.spring.elasticjob.entity.User;

import java.util.ArrayList;
import java.util.List;

public class MyDataflowJob implements DataflowJob <User>{
    static int i=0;
    @Override
    public List<User> fetchData(ShardingContext shardingContext) {
        if(i>0){
            return null;
        }
        ArrayList<User> datas=new ArrayList<>();
        User user=new User();
        user.setName("张三");
        User user2=new User();
        user2.setName("李四");
        User user3=new User();
        user3.setName("王五");
        datas.add(user);
        datas.add(user2);
        datas.add(user3);
        return datas;
    }

    @Override
    public void processData(ShardingContext shardingContext, List<User> list) {
        for(User user:list){
            user.setName(user.getName()+i);
            System.out.println(user);
        }
        if(i==1){
            list.clear();
        }
        i++;
    }
}
