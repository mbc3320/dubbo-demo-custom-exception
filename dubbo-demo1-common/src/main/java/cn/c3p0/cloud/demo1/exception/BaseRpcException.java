package cn.c3p0.cloud.demo1.exception;

import cn.c3p0.cloud.demo1.enums.ValueEnum;
import org.apache.dubbo.rpc.RpcException;

public class BaseRpcException extends RpcException {

    private ValueEnum status;

    public BaseRpcException(ValueEnum status) {
        super(status.getCode(), status.getText());
        this.status = status;
    }
}
