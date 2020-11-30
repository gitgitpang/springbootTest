package com.springboot.service.serviceImpl;


import com.springboot.service.House;

public class ProxyPeople implements House {

     private House house;
     public ProxyPeople(House house){
         this.house=house;
     }


    @Override
    public void buyHouse(String address,long price) {
        //1.上网找中介
        System.out.println("上网找中介,让中介在"+address+"找房子");
        //2.让中介看房子
        System.out.println("中介以"+price+"元价格找合适房源");
        //3.买房子
        house.buyHouse(address,price);
        //4.搬新家开始住
        System.out.println("愉快的接受中介给的价格");
    }
}
