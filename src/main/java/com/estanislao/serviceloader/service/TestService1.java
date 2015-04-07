package com.estanislao.serviceloader.service;

public class TestService1 implements  TestService {
    @Override
    public String getServiceName() {
        return this.getClass().getSimpleName();
    }
}
