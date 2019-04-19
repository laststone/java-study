package com.baidu;

public class Person {              // 顶一个带包类Person，在com/baidu包(目录)下
    private String name;
    private int age;

    public Person(){};

    public Person(String name,int age){      // 注意：要想本包中的这个Person类被其他包中的类引用，则需要将Person类及其空参、无参构造的权限全部设置为public，否则无权限访问该Person类
        this.name=name;
        this.age=age;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return this.age;
    }

}
