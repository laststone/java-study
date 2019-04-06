public class Demo6_Array {
    public static void main(String[] args){
        // 格式一 声明和赋值在一行
        int [] arr1=new int[] {11,22,33,44,55};  // 非简写形式
        int [] arr2={11,22,33,44,55};            // 简写形式

        // 格式二 先声明，后赋值
        int [] arr3;
        arr3=new int [] {11,22,33,44,55};

        int [] arr4;
        //arr4={11, 22, 33, 44, 55};   // 简写形式不能先声明后赋值

        System.out.println(arr2);
        System.out.println(arr2[4]);

    }
}
