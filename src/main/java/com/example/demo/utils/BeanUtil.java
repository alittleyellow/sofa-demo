package com.example.demo.utils;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.stereotype.Component;

@Component
public class BeanUtil {
    private MapperFacade mapperFacade = null;
    protected  MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
    public BeanUtil() {
        mapperFacade = mapperFactory.getMapperFacade();
    }

    public <V, P> P convert(V v, Class<P> p) {
        return mapperFacade.map(v, p);
    }

}
