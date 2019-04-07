public class Demo15_Array {
    public static void main(String[] args){
        int [] [] arr = new int[3][];           // 这是一个二维数组，这个二维数组中有三个一位数组

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        arr[0]=new int[3];                      // 第一个一位数组可以存储三个int值
        arr[1]=new int[5];                      // 第二个一位数组可以存储五个int值
        System.out.println("------------------");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
