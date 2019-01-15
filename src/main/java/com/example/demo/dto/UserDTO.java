package com.example.demo.dto;

import lombok.Data;

/**
 * @author huangyang
 * 用户表
 */
@Data
public class UserDTO {
    /**
     * 自增id
     */
    private Long id;
    /**
     * 用户名称
     */
    private String name;
}
