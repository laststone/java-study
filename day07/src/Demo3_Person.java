public class Demo3_Person {
    public static void main(String[] args){
        Person3 p=new Person3("张三",23);   // 走有参构造
        //p=new Person3("张天翼",23);  // 对有参构造，要改变变量值，使用这种方式叫做杀人----实际将原对象变成了垃圾
        System.out.println(p.getName() + "..." + p.getAge());

        System.out.println("------------------------");

        Person3 p2=new Person3();   // 走无参构造
        p2.setName("李四");
        p2.setAge(24);
        p2.setName("李鬼");      // 这种改变变量的方式---在不删除对象的基础上改变对象的属性
        System.out.println(p2.getName() + "..." + p2.getAge());

    }
}


class Person3{
    private String name;
    private int age;

    public Person3(){       //空参构造

    }

    public Person3(String name,int age){  //有参构造
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