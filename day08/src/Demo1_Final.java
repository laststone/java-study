/*
class Demo1_Final {
    public static void main(String[] args){
        System.out.println("hello world");
    }
}

class Father8{
    public final void print(){                  // 父类中的方法加上final关键字后就不能被子类改写了
        System.out.println("访问底层数据资源");
    }
}

class Son8 extends Father8{
    public void print(){
        System.out.println("哈哈，功能被我干掉了");
    }
}
*/


/*
class Demo1_Final {
    public static void main(String[] args){
        System.out.println("hello world");
    }
}

final class Father8{                            // 如果整个父类中的方法都不希望被子类改写，则可以给父类加上final关键字，将其变成一个最终类
    public void print(){
        System.out.println("访问底层数据资源");
    }
}

class Son8 extends Father8{
    public void print(){
        System.out.println("哈哈，功能被我干掉了");
    }
}
*/


/*
class Demo1_Final {
    public static void main(String[] args){
        System.out.println("hello world");
    }
}

class Father8{
    public final void print(){
        System.out.println("访问底层数据资源");
    }
}

class Son8 extends String{                      // String类也是一个被final修饰的最终类，它只能被子类继承，但不能被改写
    public void print(){
        System.out.println("哈哈，功能被我干掉了");
    }
}
*/


/*
class Demo1_Final {
    public static void main(String[] args){
        Son8 s=new Son8();
        s.print();
    }
}

class Son8 {
    int num=10;                     // 没有被final修饰的num变量，可以被任意修改
    public void print(){
        num=20;
        System.out.println(num);
    }
}
*/

/*
class Demo1_Final {
    public static void main(String[] args){
        Son8 s=new Son8();
        s.print();
    }
}

class Son8 {
    fina int num=10;                     // 被final修饰的num变量，不能被任意修改
    public void print(){
        num=20;
        System.out.println(num);
    }
}
*/

class Demo1_Final {
    public static void main(String[] args){
        Son8 s=new Son8();
        s.print();
    }
}

class Son8 {
    final int NUM=10;                     // 注意规范：被final修饰的变量不能被修改，被称为"常量" ，常量一般被设置成大写
    public void print(){
        //NUM=20;
        System.out.println(NUM);
    }
}