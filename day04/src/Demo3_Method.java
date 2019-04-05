import java.util.Scanner;

public class Demo3_Method {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入行数：");
        int row=sc.nextInt();
        System.out.println("请输入列数：");
        int column=sc.nextInt();

        print(row,column);

        //System.out.println(print(row,column));          //返回类型为void空，不能打印

    }

    public static void print(int a, int b){
        for (int i=1;i<=a;i++){
            for (int j=1;j<=b;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        return;                     //如果返回值类型是void，return可以省略
    }
}
