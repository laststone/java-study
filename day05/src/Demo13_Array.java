public class Demo13_Array {
    //  二维数组定义格式：
    //    1. 数据类型 数组名[] [] = new 数据类型[m][n];
    //    1. 数据类型 [] 数组名[] = new 数据类型[m][n];
    public static void main(String[] args){
        int [] [] arr=new int[3][2];         // 建议使用这种方式创建二维数组
        int [] arr2 []=new int[3][2];

        System.out.println(arr);
        System.out.println(arr2);
        System.out.println(arr[0][0]);       // 二维数组中第一个数组中第一个元素


    }
}
