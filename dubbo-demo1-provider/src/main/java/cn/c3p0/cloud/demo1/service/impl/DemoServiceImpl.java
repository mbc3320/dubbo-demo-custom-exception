package cn.c3p0.cloud.demo1.service.impl;

import cn.c3p0.cloud.demo1.exception.DemoException;
import cn.c3p0.cloud.demo1.exception.DemoRpcException;
import cn.c3p0.cloud.demo1.exception.status.DemoStatusCode;
import cn.c3p0.cloud.demo1.service.DemoService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public Boolean testException() {
        throw new DemoException(DemoStatusCode.ERROR1);
    }

    @Override
    public Boolean testRpcException() {
        throw new DemoRpcException(DemoStatusCode.ERROR1);
    }
}
