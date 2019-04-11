public class Demo1_Static {
    public static void main(String[] args){
        Person5 p1=new Person5();
        p1.name="苍老师";
        //p1.country="日本";
        //p1.speak();

        System.out.println("-------------------------");

        Person5 p2=new Person5();
        p2.name="小哲老师";
        p2.country="日本";
        p1.speak();
        p2.speak();

        System.out.println("--------------------------");
        Person5.country="美国";                               // 静态成员变量可以采用这种方式赋值
        System.out.println(Person5.country);                 // 静态成员变量可以采用这种类名方式调用，不需要实例化

    }
}

class Person5{
    String name;
    static String country;          // 加上static关键字，将成员变量设置为静态，所有实例化对象共享该该变量

    public void speak(){
        System.out.println(name + "..." + country);
    }
}