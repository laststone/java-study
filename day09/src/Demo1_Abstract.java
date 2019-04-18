/*
class Demo1_Abstract {
    public static void main(String[] args){
        System.out.println("hello world!");
    }
}


abstract class Animal3{             // 没有抽象方法的抽象类，能够编译成功！

}
*/


/*
class Demo1_Abstract {
    public static void main(String[] args){
        Animal A=new A();           // 抽象类不能被实例化
    }
}


abstract class Animal3{             // 抽象类
    public abstract void eat();     // 抽象方法
}
*/


class Demo1_Abstract {
    public static void main(String[] args){
        Animal3 a=new Cat3();       // 父类引用指向子类对象
        a.eat();                    // 编译看左边(父类)，运行看右边(子类)
    }
}


abstract class Animal3{             // 抽象类
    public abstract void eat();     // 抽象方法
}

class Cat3 extends Animal3{         // 如果子类继承抽象类，则必须要重写父抽象类中的抽象方法
    public void eat(){
        System.out.println("猫吃鱼");
    }
}