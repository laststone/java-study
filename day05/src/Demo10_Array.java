public class Demo10_Array {
    public static void main(String[] args){
        int [] arr={11,22,33,44,55};
        reverseArray(arr);
        print(arr);
    }

    // 定义函数：将数组元素反转
    public static void reverseArray(int[] arr){
        for (int i=0;i<arr.length/2;i++){
            int tmp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=tmp;
        }
    }

    // 定义函数：遍历打印数组元素
    public static void print(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
    }
}
