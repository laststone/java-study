public class Demo1_Car {
    public static void main(String[] args){
        Car c1=new Car();       // 创建对象
        c1.color="red";         // 调用属性并赋值
        c1.num=8;
        c1.run();               // 调用行为
    }
}

class Car{
    String color;           // 车的颜色
    int num;                // 轮胎数量

    public void run(){      // 车运行
        System.out.println(color + "..." + num);
    }
}
