/*
class Demo2_Polymorphic {
    public static void main(String[] args){
        Father f=new Son();             // 父类引用指向子类对象
        System.out.println(f.num);      // 成员变量----> 编译看左边(父类),运行看左边(父类)

        System.out.println("-----------------------");

        Son s=new Son();
        System.out.println(s.num);
    }
}

class Father{
    int num=10;
}

class Son extends Father{
    int num=20;
}
*/

/*
class Demo2_Polymorphic {
    public static void main(String[] args){

        Father f=new Son();             // 父类引用指向子类对象
        f.print();                      // 成员方法--------> 编译看左边(父类)，运行看右边(子类)，动态绑定 <-----父类中没有print方法所以编译阶段就报错了


    }
}

class Father{
    int num=10;
}

class Son extends Father{
    int num=20;
    public void print(){
        System.out.println("son");
    }
}
*/


class Demo2_Polymorphic {
    public static void main(String[] args){

        Father f=new Son();             // 父类引用指向子类对象
        f.print();                      // 成员方法--------> 编译看左边(父类)，运行看右边(子类)，动态绑定


    }
}

class Father{
    int num=10;
    public void print(){
        System.out.println("father");
    }
}

class Son extends Father{
    int num=20;
    public void print(){
        System.out.println("son");
    }
}
