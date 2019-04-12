class Test4_Person {
    public static void main(String[] args){
        Student5 s1=new Student5();
        s1.setName("张三");
        s1.setAge(23);
        System.out.println(s1.getName() + "..." + s1.getAge());
        s1.eat();
        s1.study();

        System.out.println("------------------------");
        Student5 s2=new Student5("李四",24);
        System.out.println(s2.getName() + "..." + s2.getAge());
        s2.eat();
        s2.study();

    }
}


class Person{
    private String name;
    private int age;

    public Person(){}

    public Person(String name,int age){
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

    public void eat(){
        System.out.println(name + "吃饭");
    }
}

class Student5 extends Person{

    public Student5(){}

    public Student5(String name,int age){
        super(name,age);
    }

    public void study(){
        //System.out.println("学生学习");
        //System.out.println(name + "学习");               // name是父类中的私有变量，继承的子类中是不能直接调用的
        //System.out.println(this.getName() + "学习");      // 可采用this关键字，调用从父类继承的getName()方法来获取name属性值
        System.out.println(super.getName() + "学习");      // 还可以用super关键字，指定调用父类的getName()方法获取name属性值
    }
}

class Teacher2 extends Person{

    public Teacher2(){}

    public Teacher2(String name,int age){
        super(name,age);
    }

    public void teach(){
        System.out.println("老师讲课");
    }
}
