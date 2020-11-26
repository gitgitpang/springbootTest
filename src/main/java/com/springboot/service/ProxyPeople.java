package cn.enjoy.service.impl;

import cn.enjoy.service.House;

public class ProxyPeople implements House {

     private House house;
     public  ProxyPeople(House house){
         this.house=house;
     }

    @Override
    public void buyHouse(long price) {
        //1.上网找中介
        System.out.println("上网找中介");
        //2.让中介看房子
        System.out.println("让中介根据"+price+"找房子");
        //3.由中介来砍价
        System.out.println("由中介来砍价到"+(price-100));
        //买房子
        house.buyHouse(price-100);
        //搬新家开始住
        System.out.println("愉快的接受中介的价格,搬新家开始住");
    }
}
