/*
class Demo4_Animal {
    public static void main(String[] args){

        //Cat2 c=new Cat2();          // 创建一只猫，但是。。。要创建几只猫时就要一直重复这几句话，所以将其抽象为一个方法(见下)
        //c.eat();

        method(new Cat2());          // 将创建猫对象抽象成一个静态方法后，每次要创建猫对象只需要调用这个跟方法传入一个new的猫对象即可，但是该方法不能传入一个狗对象

        //method(new Dog2());        // 向上述猫的方法中传入狗对象 ---> 结果报错 ----> 看来还需要为狗对象也创建一个类似的方法(见下)

        method(new Dog2());          // 问题来了：要是还有一些猪狗羊牛鸡的话，也需要维他命单独创建这些方法，太重复了-----> 需要找一个方法让他们都能共用

    }

    public static void method(Cat2 c){
        c.eat();
    }

    public static void method(Dog2 d){
        d.eat();
    }
}


class Animal2{
    public void eat(){
        System.out.println("动物吃饭");
    }
}


class Cat2 extends Animal2{
    public void eat(){
        System.out.println("猫吃鱼");
    }

    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}


class Dog2{
    public void eat(){
        System.out.println("狗吃肉");
    }

    public void lookHome(){
        System.out.println("看家");
    }
}
*/


//class Demo4_Animal {
//    public static void main(String[] args){
//
//        //Cat2 c=new Cat2();          // 创建一只猫，但是。。。要创建几只猫时就要一直重复这几句话，所以将其抽象为一个方法(见下)
//        //c.eat();
//
//        /*
//        method(new Cat2());          // 将创建猫对象抽象成一个静态方法后，每次要创建猫对象只需要调用这个跟方法传入一个new的猫对象即可，但是该方法不能传入一个狗对象
//
//        //method(new Dog2());        // 向上述猫的方法中传入狗对象 ---> 结果报错 ----> 看来还需要为狗对象也创建一个类似的方法(见下)
//
//        method(new Dog2());          // 问题来了：要是还有一些猪狗羊牛鸡的话，也需要维他命单独创建这些方法，太重复了-----> 需要找一个方法让他们都能共用
//        */
//
//        method(new Cat2());
//        method(new Dog2());          // 开发的时候很少在创建对象的时候使用父类引用指向子类对象，而是直接创建子类对象更方便，可以使用子类中的特有属性和行为
//
//    }
//    /*
//    public static void method(Cat2 c){
//        c.eat();
//    }
//
//    public static void method(Dog2 d){
//        d.eat();
//    }
//    */
//
//    public static void method(Animal2 a){       // 多态的使用：当做参数的时候使用多台最好，因为扩展性强
//        a.eat();
//    }
//}
//
//
//class Animal2{
//    public void eat(){
//        System.out.println("动物吃饭");
//    }
//}
//
//
//class Cat2 extends Animal2{
//    public void eat(){
//        System.out.println("猫吃鱼");
//    }
//
//    public void catchMouse(){
//        System.out.println("抓老鼠");
//    }
//}
//
//
//class Dog2 extends Animal2{
//    public void eat(){
//        System.out.println("狗吃肉");
//    }
//
//    public void lookHome(){
//        System.out.println("看家");
//    }
//}


//class Demo4_Animal {
//    public static void main(String[] args){
//
//        //Cat2 c=new Cat2();          // 创建一只猫，但是。。。要创建几只猫时就要一直重复这几句话，所以将其抽象为一个方法(见下)
//        //c.eat();
//
//        /*
//        method(new Cat2());          // 将创建猫对象抽象成一个静态方法后，每次要创建猫对象只需要调用这个跟方法传入一个new的猫对象即可，但是该方法不能传入一个狗对象
//
//        //method(new Dog2());        // 向上述猫的方法中传入狗对象 ---> 结果报错 ----> 看来还需要为狗对象也创建一个类似的方法(见下)
//
//        method(new Dog2());          // 问题来了：要是还有一些猪狗羊牛鸡的话，也需要维他命单独创建这些方法，太重复了-----> 需要找一个方法让他们都能共用
//        */
//
//        method(new Cat2());
//        method(new Dog2());          // 开发的时候很少在创建对象的时候使用父类引用指向子类对象，而是直接创建子类对象更方便，可以使用子类中的特有属性和行为
//
//    }
//    /*
//    public static void method(Cat2 c){
//        c.eat();
//    }
//
//    public static void method(Dog2 d){
//        d.eat();
//    }
//    */
//
//    public static void method(Animal2 a){       // 多态的使用：当做参数的时候使用多台最好，因为扩展性强
//        a.eat();
//        //a.catchMouse();                // 现在想要调用猫类中的catchMouse()方法，但是因为父类中没有这个方法，所以编译通不过--->报错
//                                         // 为了解决这个问题，可以在父类中添加一个catchMouse()方法，单着这会导致猪狗羊牛鸡都会这个抓老鼠方法，显然不太好----》 于是需要向下转型
//    }
//}
//
//
//class Animal2{
//    public void eat(){
//        System.out.println("动物吃饭");
//    }
//}
//
//
//class Cat2 extends Animal2{
//    public void eat(){
//        System.out.println("猫吃鱼");
//    }
//
//    public void catchMouse(){
//        System.out.println("抓老鼠");
//    }
//}
//
//
//class Dog2 extends Animal2{
//    public void eat(){
//        System.out.println("狗吃肉");
//    }
//
//    public void lookHome(){
//        System.out.println("看家");
//    }
//}



//class Demo4_Animal {
//    public static void main(String[] args){
//
//        //Cat2 c=new Cat2();          // 创建一只猫，但是。。。要创建几只猫时就要一直重复这几句话，所以将其抽象为一个方法(见下)
//        //c.eat();
//
//        /*
//        method(new Cat2());          // 将创建猫对象抽象成一个静态方法后，每次要创建猫对象只需要调用这个跟方法传入一个new的猫对象即可，但是该方法不能传入一个狗对象
//
//        //method(new Dog2());        // 向上述猫的方法中传入狗对象 ---> 结果报错 ----> 看来还需要为狗对象也创建一个类似的方法(见下)
//
//        method(new Dog2());          // 问题来了：要是还有一些猪狗羊牛鸡的话，也需要维他命单独创建这些方法，太重复了-----> 需要找一个方法让他们都能共用
//        */
//
//        method(new Cat2());
//        method(new Dog2());          // 开发的时候很少在创建对象的时候使用父类引用指向子类对象，而是直接创建子类对象更方便，可以使用子类中的特有属性和行为
//
//    }
//    /*
//    public static void method(Cat2 c){
//        c.eat();
//    }
//
//    public static void method(Dog2 d){
//        d.eat();
//    }
//    */
//
//    public static void method(Animal2 a){
//        Cat2 c=(Cat2)a;                     // 现在使用强制向下转型为猫类，只有猫类可以向下转型成功，但是狗类也调用了该方法，所以狗类调用该方法的时候会报错(转换异常) ---》不能将一个狗类强制向下转型为猫类
//        c.eat();                            // 解决办法： 加入判断，如果传入猫类，则向下转型为猫类，如果传入狗类则向下转型为狗类
//        c.catchMouse();
//
//    }
//}
//
//
//class Animal2{
//    public void eat(){
//        System.out.println("动物吃饭");
//    }
//}
//
//
//class Cat2 extends Animal2{
//    public void eat(){
//        System.out.println("猫吃鱼");
//    }
//
//    public void catchMouse(){
//        System.out.println("抓老鼠");
//    }
//}
//
//
//class Dog2 extends Animal2{
//    public void eat(){
//        System.out.println("狗吃肉");
//    }
//
//    public void lookHome(){
//        System.out.println("看家");
//    }
//}



class Demo4_Animal {
    public static void main(String[] args){

        //Cat2 c=new Cat2();          // 创建一只猫，但是。。。要创建几只猫时就要一直重复这几句话，所以将其抽象为一个方法(见下)
        //c.eat();

        /*
        method(new Cat2());          // 将创建猫对象抽象成一个静态方法后，每次要创建猫对象只需要调用这个跟方法传入一个new的猫对象即可，但是该方法不能传入一个狗对象

        //method(new Dog2());        // 向上述猫的方法中传入狗对象 ---> 结果报错 ----> 看来还需要为狗对象也创建一个类似的方法(见下)

        method(new Dog2());          // 问题来了：要是还有一些猪狗羊牛鸡的话，也需要维他命单独创建这些方法，太重复了-----> 需要找一个方法让他们都能共用
        */

        method(new Cat2());
        method(new Dog2());          // 开发的时候很少在创建对象的时候使用父类引用指向子类对象，而是直接创建子类对象更方便，可以使用子类中的特有属性和行为

    }
    /*
    public static void method(Cat2 c){
        c.eat();
    }

    public static void method(Dog2 d){
        d.eat();
    }
    */

    public static void method(Animal2 a){
        if (a instanceof Cat2){              // 解决办法： 加入判断，如果传入猫类，则向下转型为猫类，如果传入狗类则向下转型为狗类
            Cat2 c=(Cat2)a;
            c.eat();                         // 虽然这种方式行得通，但是实际开发中很少使用这种方式的多态
            c.catchMouse();
        }else if (a instanceof Dog2){
            Dog2 d=(Dog2)a;
            d.eat();
            d.lookHome();
        }else{
            a.eat();
        }

    }
}


class Animal2{
    public void eat(){
        System.out.println("动物吃饭");
    }
}


class Cat2 extends Animal2{
    public void eat(){
        System.out.println("猫吃鱼");
    }

    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}


class Dog2 extends Animal2{
    public void eat(){
        System.out.println("狗吃肉");
    }

    public void lookHome(){
        System.out.println("看家");
    }
}
