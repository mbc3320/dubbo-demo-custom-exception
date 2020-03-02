package cn.c3p0.cloud.demo1.endpoint;

import cn.c3p0.cloud.demo1.exception.BaseException;
import cn.c3p0.cloud.demo1.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.rpc.RpcException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class DemoController {

    @Reference
    private DemoService demoService;

    @RequestMapping("/testException")
    public String test() {

        try {
            demoService.testException();
        } catch (Exception e) {
            log.info("Instance of RuntimeException: {}", e instanceof RuntimeException);
            log.info("Instance of BaseException: {}", e instanceof BaseException);
            log.info("Instance of RpcException: {}", e instanceof RpcException);
            log.error("Error: {}", e.getMessage(), e);
        }

        return "ok";
    }
}
