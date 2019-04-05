public class Test3_Overload {

    //使用方法重载，分别比较int类型和double类型的
    public static void main(String[] args){
        boolean b1=isEqual(10,10);
        System.out.println(b1);

        boolean b2=isEqual(10.32,10.23);
        System.out.println(b2);
    }

    public static boolean isEqual(int a,int b){
        return a==b;
    }

    public static boolean isEqual(double a,double b){
        return a==b;
    }

}
