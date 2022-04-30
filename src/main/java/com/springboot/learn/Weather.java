package com.springboot.learn;

import org.springframework.stereotype.Component;

@Component
public class Weather {

    /**
     * 主键
     */
    private Long id;
    /**
     * 描述
     */
    private String description;
    /**
     * 天气状态几级
     */
    private Integer level;
    /**
     * 备注
     */
    private String remark;

    public Weather() {
        System.out.println("我被加载进了Spring容器了");
    }
}
