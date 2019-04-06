public class Demo9_Array {
    public static void main(String[] args){
        int [] arr={11,22,33,44,55};
        int max = getMax(arr);
        System.out.println(max);

        System.out.println("------------------------");
        int [] arr1={-33,-77,-22,-44,-55};
        int max1=getMax(arr1);
        System.out.println(max1);
    }

    // 定义函数，返回数组中值最大的元素
    public static int getMax(int[] arr){
        int max=arr[0];
        for (int i=1;i<arr.length;i++){
            if (max < arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
