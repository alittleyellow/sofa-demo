package com.example.demoservice;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import com.example.demofacade.HelloService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@SofaService(interfaceType = HelloService.class,
        bindings = { @SofaServiceBinding(bindingType = "bolt") })
@Component
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        return "我是你爸爸";
    }
}
