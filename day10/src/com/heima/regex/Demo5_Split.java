package com.heima.regex;

public class Demo5_Split {

    public static void main(String[] args){
        String s="金三胖 郭美美 李dayone";
        String [] arr=s.split(" ");

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
