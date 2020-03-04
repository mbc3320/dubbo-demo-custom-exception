package cn.c3p0.cloud.demo1.exception;

import cn.c3p0.cloud.demo1.exception.status.DemoStatusCode;

public class DemoException extends BaseException {

    public DemoException() {
    }

    public DemoException(DemoStatusCode status) {
        super(status);
    }
}
