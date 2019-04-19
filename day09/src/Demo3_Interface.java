/*
class Demo3_Interface {
    public static void main(String[] args){
        System.out.println("hello world");
    }
}


interface InterA{
    public abstract void printA();
}

interface InterB{
    public abstract void printB();
}

class Demo5 implements InterA{
    public void printA(){
        System.out.println("printA");   // Demo5类实现接口InterA，并且重写InterA接口中所有的抽象方法，所有编译成功
    }
}
*/


/*
class Demo3_Interface {
    public static void main(String[] args){
        System.out.println("hello world");
    }
}


interface InterA{
    public abstract void printA();
}

interface InterB{
    public abstract void printB();
}

class Demo5 implements InterA,InterB{       // 接口可以多实现：同时实现InterA和InterB两个接口，并且重写这两个接口中的所有抽象方法，所以编译成功

//class Demo5 implements InterA,implements InterB{       // 接口多实现不能按照这种格式书写，是非法的，不允许的
    public void printA(){
        System.out.println("printA");
    }

    public void printB(){
        System.out.println("printB");
    }
}
*/

/*
class Demo3_Interface {
    public static void main(String[] args){
        System.out.println("hello world");
    }
}


interface InterA{
    public abstract void printA();
}

interface InterB{
    public abstract void printB();
}

interface  InterC extends InterB{        // 接口之间是可以单继承的

}


class Demo5 implements InterA{
    public void printA() {
        System.out.println("printA");
    }
}
*/

/*
class Demo3_Interface {
    public static void main(String[] args){
        System.out.println("hello world");
    }
}


interface InterA{
    public abstract void printA();
}

interface InterB{
    public abstract void printB();
}

interface  InterC extends InterA,InterB{        // 接口之间是也可以多继承的

}


class Demo5 implements InterA{
    public void printA() {
        System.out.println("printA");
    }
}
*/


class Demo3_Interface {
    public static void main(String[] args){
        System.out.println("hello world");
    }
}


interface InterA{
    public abstract void printA();
}

interface InterB{
    public abstract void printB();
}

interface  InterC extends InterA,InterB{

}


class Demo5 extends Object implements InterA,InterB{        // 接口的实现类：可以单继承一个父类，同时多实现多个接口
    public void printA() {
        System.out.println("printA");
    }

    public void printB(){
        System.out.println("printB");
    }
}
