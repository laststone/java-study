class Demo2_Final {
    public static void main(String[] args){
        final int num=10;
        //num=20;                   // 常量不能被修改
        System.out.println(num);

        System.out.println("----------------------");
        final Person8 p=new Person8("张三",23);
        //p=new Person8("李四",24);                           // 对于引用类型的变量p，这里只能被赋值一次
        p.setName("李四");                                    // 虽然不能更改p的引用对象，但是可以改变其对象中的各种属性
        p.setAge(24);
        System.out.println(p.getName() + "..." + p.getAge());

        method(10);     // 方法声明上使用final
        method(20);     // 调用两次也不会报错，因为这里是两个不同的x变量，其实每个x只被赋值了一次
    }


    public static void method(final int x){
        System.out.println(x);
    }

}

class Person8{
    private String name;
    private int age;

    public Person8(){}

    public Person8(String name,int age){
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
}