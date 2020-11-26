package cn.enjoy.service.impl;

import cn.enjoy.service.House;

public class HouseImpl implements House {

    @Override
    public void buyHouse(long price) {
        System.out.println(price+"买一个房子");
    }
}
