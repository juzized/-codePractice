package com.how2java.tmall.threadDemo.builder;
//Builder：抽象建造者，给出一个抽象接口，以规范产品对象各个组成成分的创建，这个接口只是规范
public interface PersonBuilder {

    //对头盔属性的规范
    void builderHelmetMurder();
    void builderHelmetYanLong();

    //对护甲的规范
    void builderArmorMurder();
    void builderArmorYanLong();

    //对武器的规范
    void builderWeaponMurder();
    void builderWeaponYanLong();

    //对象属性的组装
    Arms builderArms();
}
