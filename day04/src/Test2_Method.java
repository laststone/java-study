import java.util.Scanner;

public class Test2_Method {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请录入一个整数，范围在1-9之间：");
        int num=sc.nextInt();

        print99(num);
    }

    //根据输入数值打印部分九九乘法表
    public static void print99(int a){
        for (int i=1;i<=a;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j + "*" + i + "=" + (j*i) + "\t");
            }
            System.out.println();
        }
    }
}
