package cn.c3p0.cloud.demo1.exception;

import cn.c3p0.cloud.demo1.enums.ValueEnum;

public class BaseException extends RuntimeException {

    private ValueEnum status;

    public BaseException() {
    }

    public BaseException(ValueEnum status) {
//        super(status.getCode(), status.getText());
        super(status.getText());
        this.status = status;
    }

    public ValueEnum getStatus() {
        return status;
    }

    public void setStatus(ValueEnum status) {
        this.status = status;
    }
}
