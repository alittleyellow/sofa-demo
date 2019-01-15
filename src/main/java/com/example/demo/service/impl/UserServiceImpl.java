package com.example.demo.service.impl;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import com.example.demo.domain.UserDO;
import com.example.demo.dto.UserDTO;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import com.example.demo.utils.BeanUtil;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
@Component
@SofaService(interfaceType = UserService.class, bindings = {@SofaServiceBinding(bindingType = "bolt")})
public class UserServiceImpl implements UserService {
    @Resource
    private BeanUtil beanUtil;
    @Resource
    private UserMapper userMapper;

    @Override
    public Long insert(UserDTO userDTO) {
        UserDO userDO = beanUtil.convert(userDTO, UserDO.class);
        return userMapper.insert(userDO);
    }
}
