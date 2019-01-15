package com.example.demo.domain;

import lombok.Data;

/**
 * @author huangyang
 * 用户表
 */
@Data
public class UserDO {
    /**
     * 自增id
     */
    private Long id;
    /**
     * 用户名称
     */
    private String name;
}
