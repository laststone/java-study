package com.hemai.regex;

public class Demo1_Regex {

    public static void main(String[] args){

        String regex="[1-9]\\d{4,14}";                      // 利用正则表达式匹配
        System.out.println("1553868".matches(regex));
        System.out.println("012345".matches(regex));
        System.out.println("2553868abc".matches(regex));
    }
}
