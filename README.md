### Alioth-Clould
基于springBoot+springCloud构建的分布式微服务demo
>学习springcloud的记录
### 目录结构
```shell
├── ac-config                                    // 配置中心.                :8088端口 .
│   ├── src/main
│   ├── ├──java/com/gravel/config                // 具体代码。                    
│   ├── ├──resources
│   ├── ├── ├──config                            //配置文件
├── ac-gateway-zuul                              // 网关应用.                :3001端口 .
│   ├── src/main
│   ├── ├──java/com/gravel/gateway/zuul          // 具体代码。                    
│   ├── ├──resources
├── ac-comsumer-tom                              // 消费者tom-去买咖啡。      :5001端口
│   ├── src/main
│   ├── ├──java/com/gravel/comsumer              // 具体代码
│   ├── ├──resources
├── ac-provider-coffee-latte                     // 服务提供者->拿铁咖啡一杯   :4001端口
│   ├── src/main
│   ├── ├──java/com/gravel/provider/             // 具体代码
│   ├── ├──resources
├── ac-provider-coffee-macchiato                 // 服务提供者->玛奇朵咖啡一杯 :4002端口        
│   ├── src/main
│   ├── ├──java/com/gravel/provider/
│   ├── ├──resources
├── sbc-server                                   // eureka-server注册中心     :2333端口
│   ├── src/main
│   ├── ├──com/gravel/eureka/              // 具体代码。 
│   ├── ├──resources
├── .gitignore                                   // git忽略项             
├── README.md               


```
