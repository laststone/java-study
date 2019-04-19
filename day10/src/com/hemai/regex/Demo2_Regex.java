package com.hemai.regex;

public class Demo2_Regex {

    public static void main(String[] args){
        //demo2();

        //demo3();          // command+option+m 抽象被选中代码为方法

        //demo4();

        demo5();


    }

    public static void demo5() {
        String regex="[a-z&&[^m-p]]";
        System.out.println("m".matches(regex));
        System.out.println("a".matches(regex));
        System.out.println("z".matches(regex));
        System.out.println("n".matches(regex));
    }

    public static void demo4() {
        String regex="[a-z&&[def]]";
        System.out.println("a".matches(regex));
        System.out.println("d".matches(regex));
    }

    public static void demo3() {
        String regex="[a-zA-Z]";
        System.out.println("a".matches(regex));
        System.out.println("A".matches(regex));
        System.out.println("z".matches(regex));
        System.out.println("Z".matches(regex));
        System.out.println("1".matches(regex));
        System.out.println("%".matches(regex));
    }

    public static void demo2() {
        String regex="[abc]";                       // []代表匹配其中某一个字符
        System.out.println("a".matches(regex));
        System.out.println("b".matches(regex));
        System.out.println("c".matches(regex));         // idea中将选中代码抽取为方法快捷键：command+option+m
        System.out.println("d".matches(regex));
        System.out.println("e".matches(regex));
        System.out.println("f".matches(regex));
        System.out.println("g".matches(regex));
    }
}
