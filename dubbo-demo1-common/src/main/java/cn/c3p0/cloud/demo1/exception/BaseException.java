package cn.c3p0.cloud.demo1.exception;

import cn.c3p0.cloud.demo1.enums.ValueEnum;
import org.apache.dubbo.rpc.RpcException;

public class BaseException extends RuntimeException {

    private ValueEnum status;

    public BaseException(ValueEnum status) {
//        super(status.getCode(), status.getText());
        super(status.getText());
        this.status = status;
    }
}
