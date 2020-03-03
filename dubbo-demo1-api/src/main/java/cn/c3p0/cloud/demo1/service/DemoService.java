package cn.c3p0.cloud.demo1.service;

import cn.c3p0.cloud.demo1.exception.BaseException;
import cn.c3p0.cloud.demo1.exception.DemoException;

public interface DemoService {

    Boolean testException();

    Boolean testRpcException();

    Boolean testSignBaseException() throws BaseException;

    void testSignDemoException() throws DemoException;
}
