package cn.c3p0.cloud.demo1.exception.status;

import cn.c3p0.cloud.demo1.enums.ValueEnum;

public enum DemoStatusCode implements ValueEnum {

    ERROR1(1000, "异常测试");

    private Integer code;

    private String text;

    DemoStatusCode(Integer code, String text) {
        this.code = code;
        this.text = text;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getText() {
        return text;
    }
}
