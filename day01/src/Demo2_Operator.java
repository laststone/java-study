public class Demo2_Operator {
    public static void main(String[] args){
        //单独使用；放在操作数前后效果一样
        int a = 3;
        a++;
        System.out.println(a);

        int c= 3;
        ++c;
        System.out.println(c);

        //参与运算：后面--先自增后赋值，前面--先赋值后自增
        int b = 3;
        int d = b++;
        System.out.println(d);

        int e = 3;
        int f = ++e;
        System.out.println(f);



    }
}
