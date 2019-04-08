public class Demo3_Car {
    public static void main(String[] args){
        new Car3().color="Red";
        new Car3().num=8;           // 匿名对象可以调用属性，但是没有意义，因为调用后就变成垃圾
        new Car3().run();

        System.out.println("---------------");

        Car3 c3=new Car3();
        method(c3);

        System.out.println("---------------");

        method(new Car3());         // 匿名对象可以当做参数传递
    }

    // 抽取方法提高代码复用性
    public static void method(Car3 cc){
        cc.color="Red";
        cc.num=8;
        cc.run();
    }
}

class Car3{
    String color;
    int num;

    public void run(){
        System.out.println(color + "..." + num);
    }
}
