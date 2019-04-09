public class Demo2_Person {
    public static void main(String[] args){
        Person2 p=new Person2();        // 调用空参构造
        p.show();

        System.out.println("-------------------");

        Person2 p2=new Person2("张三",23);    // 调用有参构造
        p2.show();

        System.out.println("-------------------");

        Person2 p3=new Person2("李四",24);
        p3.show();



    }
}

class Person2{
    private String name;
    private int age;

    public Person2(){                       // 如果没有特别设置空参构造，系统将自动提供一个无参的空参构造方法
        System.out.println("空参构造");
    }

    public Person2(String name,int age){    // 如果定义了有参构造，而没有特别定义空参构造，此时系统不会自动生成空参构造方法，此时调用空参构造会报错
        this.name=name;
        this.age=age;
        System.out.println("有参构造");
    }

    public void show(){
        System.out.println(name + "..." + age);
    }
}
