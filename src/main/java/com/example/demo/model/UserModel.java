package com.example.demo.model;

import lombok.Data;

/**
 * @author huangyang
 * 用户表
 */
@Data
public class UserModel {
    /**
     * 自增id
     */
    private Long id;
    /**
     * 用户名称
     */
    private String name;
}
