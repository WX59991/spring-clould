package com.rocketmq.cn.conf;

import org.apache.rocketmq.spring.annotation.ExtRocketMQTemplateConfiguration;
import org.apache.rocketmq.spring.core.RocketMQTemplate;

@ExtRocketMQTemplateConfiguration(nameServer = "${rocketmq.name-server}")
public class ExtRocketMQTemplate extends RocketMQTemplate {
}
