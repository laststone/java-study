package com.heima;

import com.baidu.Person;

public class Demo1_Package {
    public static void main(String[] args){
        com.baidu.Person p=new com.baidu.Person("张三",23);
        System.out.println(p.getName());
    }
}
