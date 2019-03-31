public class Test1_operator {
    public static void main(String[] args){
        //第一题
        int a = 10;
        int b = 10;
        int c = 10;
        a = b++;
        c = --a;
        b = ++a;
        a = c--;
        System.out.println("a = " + a + ",b = " + b + ",c = " + c);

        //第二题
        int x = 4;
        int y = (x--) + (++x) + (x*10);
        System.out.println("x = " + x + ",y = " + y);

        //第三题
        byte e = 10;
        e++;
        System.out.println("e = " + e);


        byte f = 10;
        //f = f + 1;
        f = (byte)(f+1);
        System.out.println(f);
        System.out.println("改过后的代码");

    }
}
