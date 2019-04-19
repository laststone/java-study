package com.heima.array;

public class Demo2_Array {
    public static void main(String[] args){
        int [] arr={11,22,33,44,55,66,77};
        System.out.println(getIndex(arr,22));
        System.out.println(getIndex(arr,66));
        System.out.println(getIndex(arr,88));
    }

    /*
    二分查找
    1. 返回值类型int
    2. 参数列表int [] arr,int value
     */

    public static int getIndex(int[] arr,int value){
        int min=0;
        int max=arr.length-1;
        int mid=(min + max)/2;

        while (arr[mid] != value){
            if (arr[mid] < value){
                min=mid+1;
            }else if (arr[mid] > value){
                max=mid-1;
            }
            mid=(min + max) / 2;

            if (min > max){
                return -1;
            }
        }

        return mid;
    }
}
