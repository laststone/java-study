public class Demo2_Student {
    public static void main(String[] args){
        print(10);

        System.out.println("------------------");

        Student2 s=new Student2();              // 创建对象，并将对象的地址值赋值给s
        print(s);
    }

    public static void print(int x){            // 基本数据类型当做形式参数
        System.out.println(x);
    }

    public static void print(Student2 stu){     // 引用数据类型当做形式参数
        stu.name="张三";
        stu.age=23;                             //
        stu.speak();
    }
}

class Student2{
    String name;
    int age;

    public void speak(){
        System.out.println(name + "..." + age);
    }
}
