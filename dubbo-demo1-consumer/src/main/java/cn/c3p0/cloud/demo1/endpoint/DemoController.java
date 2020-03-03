package cn.c3p0.cloud.demo1.endpoint;

import cn.c3p0.cloud.demo1.exception.BaseException;
import cn.c3p0.cloud.demo1.exception.BaseRpcException;
import cn.c3p0.cloud.demo1.exception.DemoException;
import cn.c3p0.cloud.demo1.exception.DemoRpcException;
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
            Boolean result = demoService.testException();
            log.info("BaseException result = {}", result);
        } catch (Exception e) {
            instanceOfException(e);
        }

        try {
            Boolean result = demoService.testSignBaseException();
            log.info("SignBaseException result = {}", result);
        } catch (Exception e) {
            instanceOfException(e);
        }

        try {
            demoService.testSignDemoException();
        } catch (Exception e) {
            instanceOfException(e);
        }

        try {
            Boolean result = demoService.testRpcException();
            log.info("RpcException result = {}", result);
        } catch (Exception e) {
            instanceOfException(e);
        }


        return "ok";
    }

    private void instanceOfException(Exception e) {
        log.info("Instance of RuntimeException: {}", e instanceof RuntimeException);
        log.info("Instance of BaseException: {}", e instanceof BaseException);
        log.info("Instance of DemoException: {}", e instanceof DemoException);
        log.info("Instance of BaseRpcException: {}", e instanceof BaseRpcException);
        log.info("Instance of DemoRpcException: {}", e instanceof DemoRpcException);
        log.info("Instance of RpcException: {}", e instanceof RpcException);
        log.error("Error: {}", e.getMessage(), e);
    }
}
