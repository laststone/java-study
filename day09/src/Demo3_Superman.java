class Demo3_Superman {
    public static void main(String[] args){

        Person2 p=new SuperMan();           // 父类引用指向子类对象，超人提升为普通人
        System.out.println(p.name);         // John <---成员变量：编译看左边(父类）运行看左边(父类)
        p.谈生意();                          // 成员方法：编译看左边(父类) 运行看右边(子类)
        //p.fly();                          // 因为父类中没有改成员方法 <--- 成员方法编译看左边(父类)，编译失败

        System.out.println("------------------");
        SuperMan sm=(SuperMan)p;        // 强制向下转型：类似于大转小可能损失精度，但是使用强制转换一样的原理
        sm.fly();

    }
}

class Person2{
    String name="John";

    public void 谈生意(){
        System.out.println("谈生意");
    }
}


class SuperMan extends Person2{
    String name="superman";

    public void 谈生意(){
        System.out.println("谈几个亿的大生意");
    }

    public void fly(){
        System.out.println("飞出去救人");
    }
}
