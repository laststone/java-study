package com.heima.regex;

public class Demo3_Regex {

    public static void main(String[] args){
        //demo1();

        String regex="..";
        System.out.println("a".matches(regex));
        System.out.println("ab".matches(regex));
    }

    public static void demo1() {
        String regex=".";       // . 代表匹配任意一个字符
        System.out.println("a".matches(regex));
        System.out.println("ab".matches(regex));
    }

}
