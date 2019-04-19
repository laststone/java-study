/*
class Demo2_Interface {
    public static void main(String[] args){
        Demo4 d=new Demo4();
        d.print();
    }
}

interface Inter2 {
    int num=10;                     // 接口中的成员变量都是常量，这里其实隐藏了一个final关键字，如果不写会自动帮忙加上
    //final int num=10;             // 加上final关键字效果也是一样的
}

class Demo4 implements Inter2{
    public void print(){
        //num=20;                   // 接口中的变量都是常量，在实现类方法中是不能被修改的，所以这里会报错
        System.out.println(num);
    }
}
*/


/*
class Demo2_Interface {
    public static void main(String[] args){
        System.out.println(Inter2.num);             // 可以通过"接口类名.属性"方式调用----->接口中的成员变量是静态的（其隐藏了一个static关键字）
    }
}

interface Inter2 {
    int num=10;
}

class Demo4 implements Inter2{
    public void print(){
        System.out.println(num);
    }
}
*/


/*
class Demo2_Interface {
    public static void main(String[] args){
        Demo4 d=new Demo4();
        d.print();
    }
}

interface Inter2 {
    public static final int num=10;             // 接口都是暴露的，所以默认还会加上public关键字，（接口成员变量都会在变量名前面默认添加上这三个修饰关键字）
}

class Demo4 implements Inter2{
    public void print(){
        System.out.println(num);
    }
}
*/


/*
class Demo2_Interface {
    public static void main(String[] args){
        Demo4 d=new Demo4();
        d.print();
    }
}

interface Inter2 {
    public static final int num=10;

    //public Inter2(){}                 // 接口中是没有构造方法的，所以这里添加一个构造方法就报错！！
}

class Demo4 implements Inter2{
    public void print(){
        System.out.println(num);
    }
}
*/


/*
class Demo2_Interface {
    public static void main(String[] args){
        Demo4 d=new Demo4();
        d.print();
    }
}

interface Inter2 {
    public static final int num=10;

    //public Inter2(){}                 // 接口中是没有构造方法的
}

//class Demo4 implements Inter2{
class Demo4 extends Object implements Inter2{    // 如一个接口实现类不写任何继承类，则默认继承Object类，由于这个接口实现类默认继承Objects父类，所以它会使用Object类的构造方法
    public void print(){
        System.out.println(num);
    }
}
*/

/*
class Demo2_Interface {
    public static void main(String[] args){
        Demo4 d=new Demo4();
        d.print();
    }
}

interface Inter2 {
    public static final int num=10;

    //public void print(){                          // 接口中不能定义非抽象方法，
    //    System.out.println("print1");
    //}

    //void print();                  // 在接口中定义了一个print方法，它通过了编译，说明这个方法前面隐藏了abstract关键字
    //abstract  void print();        // 加上abstract关键字后效果一样， 此外接口中的方法都是公开的，所以这里还隐藏了一个public关键字
    public abstract void  print();   // 所以接口中定义的方法，默认会加上public和abstract两个关键字
}

//class Demo4 implements Inter2{
class Demo4 extends Object implements Inter2{
    public void print(){
        System.out.println(num);
    }
}
*/


class Demo2_Interface {
    public static void main(String[] args){
        Demo4 d=new Demo4();
        d.print();
    }
}

interface Inter2 {
    public static final int num=10;

    public abstract void  print();   // 所以接口中定义的方法，默认会加上public和abstract两个关键字
}

//class Demo4 implements Inter2{
class Demo4 extends Object implements Inter2{
    //void print(){                 // 接口实现子类中重写接口抽象方法时，如果去掉前面的public关键字，则会报错：无法分配更低的权限， ===》 证明接口类中定义抽象方法时，默认隐藏了public关键字
    public void print(){
        System.out.println(num);
    }
}
