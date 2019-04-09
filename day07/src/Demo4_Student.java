public class Demo4_Student {
    public static void main(String[] args){
        Student s=new Student();
        s.setName("张三");
        s.setAge(23);

        System.out.println("我的姓名是：" + s.getName() + "，我的年龄是：" + s.getAge());

        System.out.println("----------------");

        Student s2=new Student("李四",24);
        s2.show();
    }
}

class Student{
    private String name;
    private int age;

    public Student(){       // 空参构造

    }

    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return this.age;
    }

    public void show(){
        System.out.println("我的姓名是：" + name + "，我的年龄是：" + age);
    }
}
