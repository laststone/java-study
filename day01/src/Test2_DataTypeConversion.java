public class Test2_DataTypeConversion {
    public static void main(String[] args){
        float f = 12.3f;
        long x = 12345;
        f = x;                  //隐式转换
        System.out.println(f);

        //x = f;                    //反过来转换就是从float到long会损失精度，报错
        //System.out.println(x);

        x = (long)f;            //要使用强制转换
        System.out.println(x);

    }
}
