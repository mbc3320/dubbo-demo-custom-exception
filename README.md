# dubbo-demo-custom-exception
dubbo 自定义异常演示工程


## 启动
修改 
  dubbo-demo1-consumer/src/main/resources/application.yml <br>
  dubbo-demo1-provider/src/main/resources/application.yml <br>
 的dubbo.registry.address注册中心地址

即可启动provider/consumer。

## 测试

```shell
curl http://localhost:8080/testException
```
 
