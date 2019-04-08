public class Demo1_Person {
    public static void main(String[] args){
        Person3 p3=new Person3();
        p3.name="张三";
        p3.age=-17;
        p3.speak();

        System.out.println("------------------");

        Person4 p4=new Person4();
        p4.name="张三";
        //p4.age=-17;
        p4.setAge(-17);
        //p4.speak();
        System.out.println(p4.getAge());
    }
}


class Person3{
    String name;
    int age;

    public void speak(){
        System.out.println(name + "..." + age);
    }
}


class Person4{
    String name;
    private int age;    // age变量加上private关键字后，被私有化只能在本类(Person4)中访问，如果在其他类中访问则报错，可以单独设置set、get方法

    public void speak(){
        System.out.println(name + "..." + age);
    }

    public void setAge(int a){
        //age=a;
        // 加入对年龄数值的合法性判断
        if (a>0 && a<200){
            age=a;
        }else{
            System.out.println("请回火星吧，地球不适合你。。。");
        }
    }

    public int getAge(){
        return age;
    }
}