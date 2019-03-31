public class Test1_DataTypeConversion {
    public static void main(String[] args){
        byte b1 = 2;
        byte b2 = 4;
        //byte b3 = b1 + b2;    //进行运算需要两个int类型，这里会转换为int相加，得到结果为int，转换为float损失精度报错
        byte b3 = (byte)(b1 + b2);
        System.out.println(b3);

        byte b4 = 3 + 4;   //java有常量优化机制，3+4会当成int计算得到int类型的7，然后判断7处于-128到+127之间，就将其值转换为byte类型
        byte b5 = 7;
        System.out.println(b4);
        System.out.println(b5);
    }
}
