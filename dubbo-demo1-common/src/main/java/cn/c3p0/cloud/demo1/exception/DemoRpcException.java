package cn.c3p0.cloud.demo1.exception;

import cn.c3p0.cloud.demo1.exception.status.DemoStatusCode;

public class DemoRpcException extends BaseRpcException {

    public DemoRpcException(DemoStatusCode status) {
        super(status);
    }
}
