import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class Demo11_Array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入星期范围1-7：");
        int week=sc.nextInt();

        System.out.println("星期" + getWeek(week));
    }

    // 定义函数： 根据索引值返回对应的星期
    public static char getWeek(int week){
        char [] arr={' ','一','二','三','四','五','六','日'};
        return arr[week];
    }
}
