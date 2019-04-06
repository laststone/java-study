public class Demo8_Array {
    public static void main(String[] args){
        int [] arr={11,22,33,44,55};

//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);

        for(int i=1;i<5;i++){
            System.out.println(arr[i]);
        }

        System.out.println("--------------------");
        // arr.length 代表的是数组长度
        System.out.println("arr length is : " + arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println("--------------------");
        int [] arr2={3,4,5};
        print(arr2);
    }

    // 定义一个print方法
    public static void print(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
    }
}
