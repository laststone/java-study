package com.heima.test;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args){
        String s="91 27 46 38 50";
        //1.将字符串切割成字符串数组
        String [] sArr=s.split(" ");

        //2.将字符串转换成数字并将其存储到一个等长度的int数组中
        int [] arr=new int[sArr.length];
        for (int i=0;i< sArr.length;i++){
            arr[i]=Integer.parseInt(sArr[i]);       // 将字符串转换成数字
        }

        //3.排序
        Arrays.sort(arr);

        //4.将排序后的结果遍历并拼接成一个字符串
        String str="";
        for (int i=0;i< arr.length;i++){
            if (i==arr.length-1){                   // 不推荐这种拼接字符串方式，因为会产生很多垃圾
                str=str+arr[i];
            }else {
                str=str+arr[i]+" ";
            }
        }
        System.out.println(str);

    }


}
