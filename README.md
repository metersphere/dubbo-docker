# Dubbo 应用 Demo

一个使用了 Dubbo RPC 框架的 SpringBoot 应用，提供了 docker compose 文件方便运行

## 使用方式

### 前置条件
本地环境已配置 JDK 及 maven 环境，并且安装了 docker 及 docker-compose

### 打包应用
```sh
mvn clean package
```

### 启动应用
```sh
[~/Documents/workspace/dubbo-docker]# cd docker
[~/Documents/workspace/dubbo-docker/docker]# docker-compose up -d
Creating network "docker_default" with the default driver
Creating docker_producer_1  ... done
Creating docker_consumer_1  ... done
Creating docker_zookeeper_1 ... done
[~/Documents/workspace/dubbo-docker/docker]# docker ps
CONTAINER ID        IMAGE                                              COMMAND                  CREATED             STATUS              PORTS                                        NAMES
b6b4849e4902        registry.aliyuncs.com/acs-sample/zookeeper:3.4.8   "/opt/zookeeper.sh"      13 seconds ago      Up 11 seconds       2888/tcp, 0.0.0.0:2181->2181/tcp, 3888/tcp   docker_zookeeper_1
c6835e7ac8aa        producer:latest                                    "java -Djava.securit…"   13 seconds ago      Up 12 seconds       0.0.0.0:20880->20880/tcp                     docker_producer_1
d802f0a506ed        consumer:latest                                    "java -Djava.securit…"   13 seconds ago      Up 12 seconds       0.0.0.0:8899->8899/tcp                       docker_consumer_1
```

### 测试服务状态
```sh
[~/Documents/workspace/dubbo-docker/docker]# curl http://localhost:8899
Greetings from Dubbo Docker
[~/Documents/workspace/dubbo-docker/docker]#
```
返回如上内容说明服务正常运行

