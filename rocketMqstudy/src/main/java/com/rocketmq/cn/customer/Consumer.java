package com.rocketmq.cn.customer;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
//selectorExpression  tag 默认为*
@RocketMQMessageListener(topic = "${demo.rocketmq.consumer.topic}",selectorExpression="*", consumerGroup = "${demo.rocketmq.consumer.group}")
public class Consumer implements RocketMQListener<String> {
    @Override
    public void onMessage(String message) {
        System.out.printf("------- StringConsumer received: %s \n", message);
    }
}