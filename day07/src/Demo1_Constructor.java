public class Demo1_Constructor {
    public static void main(String[] args){
        Person p=new Person();
        //p.Person();               // 构造方法不能用对象来调用

        p.show();

        System.out.println("---------------");

        Person p1=new Person();
        p1.show();
    }
}

class Person{
    private String name;
    private int age;

    // 构造方法：方法名和类名一样的方法就是构造方法(不用刻意调用，在对象实例化时自动调用)
    public Person(){
        //System.out.println("hello world.");
        //return;     // return可以不写，系统会自动加上这个return

        name="张三";
        age=23;
    }

    public void show(){
        System.out.println(name + "..." + age);
    }
}
