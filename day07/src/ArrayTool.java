// 定义一个工具类ArrayTool
class ArrayTool {

    private ArrayTool(){}           // 如果一个类中全是静态方法，就可以将该类的构造方法通过private关键字私有化，这样会禁止别人通过实例化创建对象来调用其中的静态成员方法

    //public int getMax(int[] arr){               // 获取数组中最大元素方法
    public static int geMax(int[] arr){           // 变成静态成员方法
        int max=arr[0];
        for (int i=1;i<arr.length;i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

    //public void print(int[] arr){               // 遍历数组元素方法
    public static void print(int[] arr){          // 变成静态成员方法
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
    }

    //public void revArray(int[] arr){            // 反转数组元素的方法
    public static void revArray(int[] arr){       // 变成静态成员方法
        for (int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
    }

}
