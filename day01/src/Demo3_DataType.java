public class Demo3_DataType {
    public static void main(String[] args){
        //数据类型转换之隐式转换
        /*
        int x = 3;
        byte b = 4;
        x = x + b;   //int类型+byte类型结果是int类型(4字节) 变大可以。。
        System.out.println(x);
        */

        //数据类型转换之强制转换
        /*
        int x = 3;
        byte b = 4;
        b = (byte)(x+b);    //强制将得到的int类型转换为byte类型
        System.out.println(b);
        */

        //强制转换问题
        //byte b = 126 + 4; //int转换为byte损失精度，失败
        byte b = (byte)(126+4);   //强制转换为byte
        System.out.println(b);

        byte b2 = (byte)300;
        System.out.println(b2);
    }
}
