# trendParentProject
趋势投资SPRINGCLOUD
#1 启动说明

先启动 EurekaServerApplication
按照后面的步骤 启动 RabbitMQ
接着启动 IndexConfigServerApplication
跟着启动 IndexCodesApplication 
然后启动 IndexDataApplication
接着启动 TrendTradingBackTestServiceApplication
随后启动 TrendTradingBackTestViewApplication: 8041,8042 两个端口
最后启动 IndexZuulServiceApplication
注： 记得运行redis-server.exe 以启动 redis 服务器
然后访问 地址：*http://127.0.0.1:8031/api-view/*
修改git地址 https://github.com/how2j/trendConfig/blob/master/respo/trend-trading-backtest-view-dev.properties 成为新的版本
然后运行 FreshConfigUtil类 刷新。
拉到最下面，可以看到这个版权信息刷新了。
#2.微服务及端口
 微服务及端口，其中集群的会有多个端口，分别代表一个集群里的多个实例。
服务名|服务id|端口号
--|:--:|--:
注册中心|eureka-server|	8761
第三方数据中心|third-part-index-data-project|	8090
数据采集|index-gather-store-service	|	8001
股票代号服务|index-codes-service|	8011,8012,8013
数据服务|index-data-service|	8021,8022,8023
路由|index-zuul-service|	8031
模拟回测微服务|trend-trading-backtest-view	|	8041,8042,8043
模拟回测视图微服务|trend-trading-backtest-service|	8051,8052,8053
配置服务|index-config-server|	8060
断路器监控|index-hystrix-dashboard|	8070
断路器聚合监控|index-turbine|	8080

#3.第三方
第三方服务名|端口号|url|其他
---|:--:|---:|:--
redis|6379||
zipkin|9411| http://localhost:9411/zipkin/dependency |
rabbitmq|5672|http://127.0.0.1:15672|guest guest


zipkin :java -jar zipkin-server-2.10.1-exec.jar java -jar zipkin-server-2.10.1-exec.jar --zipkin.collector.rabbitmq.addresses=localhost
