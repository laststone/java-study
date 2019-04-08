public class Demo1_Car {
    public static void main(String[] args){
        Car c1=new Car();       // 创建对象
        c1.color="red";         // 调用属性并赋值
        c1.num=8;
        c1.run();               // 调用行为

        Car c2=new Car();       // 再创建一个新对象
        c2.color="black";
        c2.num=4;
        c2.run();

        //c2=null;              // 用null把原来的地址给覆盖掉
        //c2.run();             // c2里面记录的是null，所以报错空指针异常
    }
}

class Car{
    String color;           // 车的颜色
    int num;                // 轮胎数量

    public void run(){      // 车运行
        System.out.println(color + "..." + num);
    }
}
