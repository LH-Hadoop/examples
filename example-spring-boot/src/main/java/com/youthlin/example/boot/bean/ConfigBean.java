package com.youthlin.example.boot.bean;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * @author : youthlin.chen @ 2019-09-18 22:10
 */
@Data
public class ConfigBean {
    @NotNull(message = "出发地不能为空")
    @Pattern(regexp = "\\*|[A-Z0-9]{2,3}", message = "出发地格式应为*或国家二字码或城市三字码(大写)")
    private String dep;
    @NotNull(message = "航司不能改为空")
    @Pattern(regexp = "[A-Z0-9]{2}(,A-Z0-9]{2})*", message = "航司格式应为二字码，多个用英文逗号分隔")
    private String carrier;
    private boolean support;
}
