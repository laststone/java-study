package com.heima.regex;

public class Demo4_Regex {
    public static void main(String[] args){
        String regex="[abc]{5,15}";         // X{n,m}  X至少n次，但不超过m次
        System.out.println("abcba".matches(regex));
        System.out.println("abcbaabcabbabab".matches(regex));
        System.out.println("abcb".matches(regex));
        System.out.println("abcbaabaabcbaaba".matches(regex));
    }
}
