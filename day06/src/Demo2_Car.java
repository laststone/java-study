public class Demo2_Car {
    public static void main(String[] args){
        Car2 c=new Car2();
        c.run();

        System.out.println("----------------");

        new Car2().run();       // 匿名对象方式调用
    }
}

class Car2{
    String color;
    int num;

    public void run(){
        System.out.println("车运行");
    }
}
