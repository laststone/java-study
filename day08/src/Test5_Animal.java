class Test5_Animal {
    public static void main(String[] args){
        Cat2 c1=new Cat2("花色",4);
        System.out.println(c1.getColor() + "..." + c1.getLeg());
        c1.eat();
        c1.catchMouse();

        System.out.println("---------------------");

        Dog2 d1=new Dog2("黑色",4);
        d1.eat();
        d1.lookHome();

    }
}

class Animal2{
    private String color;
    private int leg;

    public Animal2(){}

    public Animal2(String color,int leg){
        this.color=color;
        this.leg=leg;
    }

    public void setColor(String color){
        this.color=color;
    }

    public String getColor(){
        return this.color;
    }

    public void setLeg(int leg){
        this.leg=leg;
    }

    public int getLeg(){
        return this.leg;
    }

    public void eat(){
        System.out.println("吃饭");
    }

}

class Cat2 extends Animal2{

    public Cat2(){}

    public Cat2(String color,int leg){
        super(color,leg);
    }

    public void eat(){
        System.out.println("猫吃鱼");
    }

    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}


class Dog2 extends Animal2{

    public Dog2(){}

    public Dog2(String color,int leg){
        super(color,leg);
    }

    public void lookHome(){
        System.out.println("看家");
    }
}
