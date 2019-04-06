public class Demo7_Exception {
    public static void main(String[] args){
        int [] arr=new int[5];
        //System.out.println(arr[5]);  // 访问的元素不存在，出现越界异常

        arr=null;
        System.out.println(arr[0]);  // 当数组引用赋值为null，再去调用数组中的元素就会出现空指针异常
    }
}
