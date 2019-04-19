class Demo1_Interface {
    public static void main(String[] args){
        //Inter i=new Inter();                    // 错误：接口被能被实例化

        Inter i=new Demo3();        // 父类引用指向子类对象
        i.print();
    }
}


interface Inter{
    public abstract void print();           // 接口中的方法都是抽象的
}

class Demo3 implements Inter{
    public void print(){
        System.out.println("print");        // 实现接口的子类中必须要重写接口中的所有抽象方法
    }
}