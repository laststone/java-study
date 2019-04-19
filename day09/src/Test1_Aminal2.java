class Test1_Aminal2 {
    public static void main(String[] args){
        Cat5 c=new Cat5("加菲猫",8);
        c.eat();
        c.sleep();

        System.out.println("------------------------");

        JumpCat jc=new JumpCat("跳高猫",3);
        jc.eat();
        jc.sleep();
        jc.jump();
    }
}

abstract class Animal5{
    private String name;
    private int age;

    public Animal5(){};

    public Animal5(String name,int age){
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

    public abstract void eat();

    public abstract void sleep();
}

interface Jumping{
    public void jump();
}

class Cat5 extends Animal5{
    public Cat5(){};

    public Cat5(String name,int age){
        super(name,age);
    }

    public void eat(){
        System.out.println("猫吃鱼");
    }

    public void sleep(){
        System.out.println("侧着睡");
    }
}

class JumpCat extends Cat5 implements Jumping{
    public JumpCat(){};

    public JumpCat(String name,int age){
        super(name,age);
    }

    public void jump(){
        System.out.println("猫跳高");
    }
}