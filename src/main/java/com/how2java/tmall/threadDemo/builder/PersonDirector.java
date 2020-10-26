package com.how2java.tmall.threadDemo.builder;
//Director,指挥者，调用具体建造者类创建复杂对象的各个部分，不负责建造的具体信息，只负责复杂对象按某种次序的创建
public class PersonDirector {

    //组装出来的复杂产品1
    public Arms constructPerson1(PersonBuilder pb){
        pb.builderHelmetMurder();
        pb.builderArmorYanLong();
        pb.builderWeaponYanLong();
        return pb.builderArms();
    }

    //组装出来的复杂产品2
    public Arms constructPerson2(PersonBuilder pb){
        pb.builderHelmetMurder();;
        pb.builderArmorYanLong();
        pb.builderWeaponMurder();
        return pb.builderArms();
    }
}
