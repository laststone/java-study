/*
class Demo2_Abstract {
    public static void main(String[] args){
        System.out.println("hello world");
    }
}


abstract class Demo{
    int num1=10;            // 成员变量：变量      ------> 抽象类的成员变量：可以是变量，也可以是常量
    final int num2=20;      // 成员变量：常量
}
*/


/*
class  Demo2_Abstract {
    public static void main(String[] args){
        System.out.println("hello world");
    }
}



abstract class Demo{
    int num1=10;
    final int num2=20;

    public Demo(){}

    public void print(){
        System.out.println("1111");   // 非抽象的成员方法      ------> 抽象类的成员方法：可以是非抽象方法，也可以是抽象方法
    }

    public abstract void method();    // 抽象的成员方法
}
*/



class  Demo2_Abstract {
    public static void main(String[] args){
        System.out.println("hello world");
    }
}



abstract class Demo{
    int num1=10;
    final int num2=20;

    public Demo(){}

    public void print(){
        System.out.println("1111");
    }

    public abstract void method();    // 抽象的成员方法
}

class Test extends Demo{
    public void method(){
        System.out.println("2222");     // 子类继承抽象父类，必须要重写其所有抽象方法
    }
}