public class Demo2_Sum {
    public static void main(String args[]){
        int a=10;
        int b=20;
        int sum=a+b;
        System.out.println(sum);

        int c=30;
        int d=40;
        int sum2=c+d;
        System.out.println(sum2);

        System.out.println("------------------------");
        //调用方法的返回值
        int sum3=add(10,20);
        System.out.println(sum3);
    }

    public static int add(int a,int b){
        int sum = a + b;
        return sum;
    }

}
