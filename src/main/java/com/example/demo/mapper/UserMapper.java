package com.example.demo.mapper;

import com.example.demo.domain.UserDO;

/**
 * @author huangyang 
 */
public interface UserMapper {
    /**
     * 新增用户 返回自增id
     * @param userDO
     * @return
     */
    Long insert(UserDO userDO);
}
