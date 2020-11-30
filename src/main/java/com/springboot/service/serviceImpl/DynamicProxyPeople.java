package com.springboot.service.serviceImpl;

import org.springframework.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;

public class DynamicProxyPeople implements InvocationHandler {
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        return null;
    }
}
