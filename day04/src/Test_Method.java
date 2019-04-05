import java.util.Scanner;

public class Test_Method {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int x = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int y = sc.nextInt();

        int max=getMax(x,y);
        System.out.println(max);

        System.out.println("----------------------");

        boolean b=isEquals(x,y);
        System.out.println(b);
    }

    //定义一个方法返回两个数值中较大的那个
    public static int getMax(int a,int b){
        return a>b?a:b;
    }

    public static boolean isEquals(int a,int b){
        return a==b;
    }
}
