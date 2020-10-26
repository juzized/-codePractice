package com.how2java.tmall.threadDemo.builder;
public class  Test{
public static void main(String[] args) {
        PersonDirector personDirector = new PersonDirector();
        Arms arms1 = personDirector.constructPerson2(new ArmsBuilder());
        System.out.println(arms1.getHelmet());
        System.out.println(arms1.getArmor());
        System.out.println(arms1.getWeapon());
    }
}
