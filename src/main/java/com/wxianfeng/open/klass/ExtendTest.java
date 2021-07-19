package com.wxianfeng.open.klass;

/**
 * @author wang.fl1429@gmail.com
 * @date 2021/07/05 10:34 AM
 */
public class ExtendTest {
    public static void main(String[] args) {
        Man man = new Man();
        man.setAge(10);
        man.setName("xf");

        // Man(super=Person(name=xf), age=10)
        System.out.println(man);
        // xf
        System.out.println(man.getName());

        Man man1 = new Man();
        man1.setAge(20);
        man1.setName("aa");

        System.out.println(man1);

        ManSonSon manSonSon = new ManSonSon();
        manSonSon.setName("sonson");
        manSonSon.setAge(20);
        manSonSon.setAge(1);
        // ManSonSon(super=Man(super=Person(name=sonson), age=1), sex=null)
        System.out.println(manSonSon);
    }
}
