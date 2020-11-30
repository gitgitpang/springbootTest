package com.springboot.service.serviceImpl;


import com.springboot.service.House;

public class HouseImpl implements House {
    @Override
    public void buyHouse(String address,long price) {
        System.out.println("买下"+address+"价值"+price+"的房子");
    }
}
