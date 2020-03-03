package cn.c3p0.cloud.demo1.service.impl;

import cn.c3p0.cloud.demo1.exception.DemoException;
import cn.c3p0.cloud.demo1.exception.DemoRpcException;
import cn.c3p0.cloud.demo1.exception.status.DemoStatusCode;
import cn.c3p0.cloud.demo1.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;

@Slf4j
@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public Boolean testException() {
        log.info("try base exception...");
        throw new DemoException(DemoStatusCode.ERROR1);
    }

    @Override
    public Boolean testRpcException() {
        log.info("try rpc exception...");
        throw new DemoRpcException(DemoStatusCode.ERROR1);
    }
}
