public class Demo2_DataType {
    public static void main(String[] args){

        //作用域问题：不能在同一个区域中使用相同的变量名
        int x = 10;
        //int x = 20;
        System.out.println(x);

        //局部变量使用之前，必须要赋值
        int y;
        y = 10;
        System.out.println(y);

        //一句语句定义多个变量
        int a,b,c,d,e;
        a = 10;
        b = 20;
        c = 30;
        d = 40;
        e = 50;
        System.out.println(a);

        //一条语句定义单个变量
        int f = 10;
        int g = 20;
        int h = 30;
    }
}
