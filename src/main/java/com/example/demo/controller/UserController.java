package com.example.demo.controller;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaReferenceBinding;
import com.example.demo.dto.UserDTO;
import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;
import com.example.demo.utils.BeanUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


/**
 * @author huangyang
 */
@RestController
@Component
public class UserController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private BeanUtil beanUtil;

    @SofaReference(interfaceType = UserService.class,
            binding = @SofaReferenceBinding(bindingType = "bolt"))
    private UserService userService;


    @RequestMapping(value = "/user/insert", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    @ResponseBody
    public Long addUser(@RequestBody UserModel userModel) {
        if (userModel == null) {
            throw new RuntimeException("用户信息为空");
        }
        logger.info("插入了一条用户{}", userModel.getName());
        UserDTO userDTO = beanUtil.convert(userModel, UserDTO.class);
        return userService.insert(userDTO);
    }
}
