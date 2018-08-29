### Alioth-Clould
基于springBoot+springCloud构建的分布式微服务demo
* spring cloud config 分布式配置中心
* spring cloud zuul 路由
* feign+ribbon 负载均衡
* hystrix 熔断器

### 目录结构
```shell
├── ac-config                                    // 配置中心.                   :8088端口 .
│   ├── src/main
│   ├── ├──java/com/gravel/config                // 具体代码.                    
│   ├── ├──resources
│   ├── ├── ├──config                            // 配置文件.
├── ac-gateway-zuul                              // 网关应用.                   :3001端口 .
│   ├── src/main
│   ├── ├──java/com/gravel/gateway/zuul          // 具体代码.                    
│   ├── ├──resources
├── ac-comsumer-tom                              // 消费者tom-去买咖啡.          :5001端口 .
│   ├── src/main
│   ├── ├──java/com/gravel/comsumer              // 具体代码.
│   ├── ├── ├──config                            // Ribbon负载配置.
│   ├── ├── ├──controller                        // controller请求provider应用.
│   ├── ├── ├──feignInterface                    // Feign配置provider的调用接口.
│   ├── ├── ├──hystrix                           // 熔断器配置,设置请求失败默认返回.
│   ├── ├──resources
├── ac-provider-coffee-latte                     // 服务提供者->拿铁咖啡一杯.     :4001端口 .
│   ├── src/main
│   ├── ├──java/com/gravel/provider/             // 具体代码.
│   ├── ├──resources
├── ac-provider-coffee-macchiato                 // 服务提供者->玛奇朵咖啡一杯.   :4002端口 .       
│   ├── src/main
│   ├── ├──java/com/gravel/provider/
│   ├── ├──resources
├── ac-server                                    // eureka-server注册中心.      :2333端口 .
│   ├── src/main
│   ├── ├──com/gravel/eureka/                    // 具体代码. 
│   ├── ├──resources
├── .gitignore                                   // git忽略项.             
├── README.md               


```
### Start
依次启动配置服务和服务发现中心以及各个微服务。
访问`http://localhost:3001/consumer/index`可以发现，请求已经被网关转发到consumer，然后consumer应用使用了feign进行负载均衡，请求会负载到两个provider应用中。

### 坑
使用高版本SpringCloud以及高版本Springboot进行开发的时候，最好选择官方的maven镜像仓库，我曾遇到`spring-cloud-starter-openfeign`在ali maven中找不到可匹配版本的情况。
### end
>此项目仅作为学习springcloud的记录，不具有实际使用价值。