public class Demo12_Array {
    public static void main(String[] args){
        int [] arr={11,22,33,44,55,66,77};
        int index=getIndex(arr,33);
        System.out.println(index);
    }

    // 定义函数：查找元素索引
    public static int getIndex(int[] arr,int value){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==value){
                return i;
            }
        }
        return -1;
    }

}
