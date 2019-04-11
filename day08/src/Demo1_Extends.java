public class Demo1_Extends {
    public static void main(String[] args){
        Cat c=new Cat();
        c.color="花";
        c.leg=4;
        c.eat();
        c.sleep();
    }
}


class Animail{
    String color;
    int leg;

    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(){
        System.out.println("睡觉");
    }
}

class Cat extends Animail{

}

class Dog extends Animail{

}