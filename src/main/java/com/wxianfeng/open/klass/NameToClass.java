package com.wxianfeng.open.klass;

/**
 * Created by haomiao on 2020/06/11 3:51 PM
 */
public class NameToClass {
    public static void main(String[] args) {
        String className = NameToClass.class.getName();

        System.out.printf(className);

        Class clazzz = className.getClass();

        System.out.println(clazzz);


        try {
            Class<?> clazz = Class.forName("com.wxianfeng.open.klass.NameToClass");
            System.out.println(clazz.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
