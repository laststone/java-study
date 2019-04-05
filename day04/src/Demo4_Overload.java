public class Demo4_Overload {
    public static void main(String args[]){
        int sum1=add(10,20);
        System.out.println(sum1);

        int sum2=add(10,20,30);
        System.out.println(sum2);

        double sum3=add(10.01,20.43,30.54,4.0);
        System.out.println(sum3);
    }

    //方法名相同，但是参数不同----->方法重载
    public static int add(int a,int b){
        return a+b;
    }

    public static int add(int a,int b, int c){
        return a+b+c;
    }

    public static double add(double a,double b,double c ,double d){     //重载与方法的返回值类型无关
        return a+b+c+d;
    }
}
