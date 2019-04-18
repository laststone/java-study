public class Test1_Animal {
    public static void main(String[] args){
        Cat4 c=new Cat4("加菲猫",8);
        System.out.println(c.getName() + "..." + c.getAge());
        c.eat();
        c.catchMouse();

        System.out.println("------------------------");
        Dog4 d=new Dog4("八公",30);
        System.out.println(d.getName() + "..." + d.getAge());
        d.eat();
        d.lookHome();

    }
}



abstract class Animal4{         // 抽象父类
    private String name;
    private int age;

    public Animal4(){}

    public Animal4(String name,int age){
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

    public abstract void eat();         // 抽象方法
}


class Cat4 extends Animal4{
    public Cat4(){}

    public Cat4(String name,int age){
        super(name,age);
    }

    public void eat(){
        System.out.println("猫吃鱼");
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}

class Dog4 extends Animal4{
    public Dog4(){}

    public Dog4(String name,int age){
        super(name,age);
    }

    public void eat(){
        System.out.println("狗吃骨头");
    }

    public void lookHome(){
        System.out.println("看家");
    }
}