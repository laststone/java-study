public class Demo2_Person {
    public static void main(String[] args){
        Person p=new Person();
        p.speak();

        System.out.println("------------");
        Person2 p2=new Person2();
        p2.speak();
    }
}


class Person{
    String name;                    // 成员变量

    public void speak(){
        //int mum;                  // 局部变量如果不赋值，使用时会报错
        int num=10;
        System.out.println(name);
        System.out.println(num);
    }
}


class Person2{
    String name;
    int num;                        // 它俩之所以可以重名，是因为它们的存放位置不同，成员变量属于类，存放在堆内存，局部变量属于方法，存放在占内存

    public void speak(){
        int num=10;                 // 局部变量使用就近原则
        System.out.println(name);
        System.out.println(num);
    }
}

