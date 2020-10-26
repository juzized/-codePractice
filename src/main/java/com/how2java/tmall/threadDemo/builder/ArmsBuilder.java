package com.how2java.tmall.threadDemo.builder;
//ConcreteBuilder，具体建造者，实现抽象建造者接口，实现了各个部件的构建和创造方法，定义并明确了他所创建的复杂对象
public class ArmsBuilder implements PersonBuilder{
    private Arms arms;

    //创建一个Arms实例，用来调用set方法
    public ArmsBuilder(){
        arms = new Arms();
    }

    //头盔属性的具体实现
    public void builderHelmetMurder(){
        arms.setHelmet("夺命头盔");
    }
    public void builderHelmetYanLong(){
        arms.setHelmet("炎龙头盔");
    }

    //护甲属性的具体实现
    public void builderArmorMurder(){
       arms.setArmor("夺命护甲");
    }
    public void builderArmorYanLong(){
        arms.setArmor("炎龙护甲");
    }

    //武器属性的具体实现
    public void builderWeaponMurder(){
        arms.setWeapon("夺命宝刀");
    }
    public void builderWeaponYanLong(){
        arms.setWeapon("炎龙宝刀");
    }

    //明确构建的复杂对象
    public Arms builderArms(){
        return arms;
    }
}
