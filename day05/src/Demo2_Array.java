public class Demo2_Array {
    public static void main(String[] args){
        int [] arr = new int[5];
        System.out.println(arr[0]);     //系统给的默认初始值都是0

        arr[0]=10;                      //给数组中的元素赋值
        System.out.println(arr[0]);

        System.out.println(arr);
        /*
            [I@610455d6
                [           代表是数组，几个"["就代表是几维数组
                I           代表的是int类型
                @           固定写法
                610455d6    代表的是十六进制的地址值
        */
    }
}
