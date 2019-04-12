class Demo1_polymorphic {
    public static void main(String[] arts){
        Cat c=new Cat();
        c.eat();

        System.out.println("------------------");

        Animal a=new Cat();             // 父类引用指向子类对象
        a.eat();
    }
}


class Animal{
    public void eat(){
        System.out.println("动物吃饭");
    }
}

class Cat extends Animal{
    public void eat(){
        System.out.println("猫吃鱼");
    }
}