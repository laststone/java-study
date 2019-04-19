package com.heima.wrapclass;

public class Demo3_Integer {
    public static void main(String[] args){

        // int ---> string  int转换为String
        int i=100;
        String s1=i+"";
        String s2=String.valueOf(i);

        Integer i2=new Integer(i);
        String s3=i2.toString();

        String s4=Integer.toString(i);
        System.out.println(s1);

        // String ---> int  String转换为int
        String s="200";
        Integer i3=new Integer(s);
        int i4=i3.intValue();

        int i5=Integer.parseInt(s);
    }
}
