/*
class Demo4_Abstract {
    public static void main(String[] args){
        System.out.println("hello world");
    }
}


abstract class Demo2{
                        // 没有一个抽象方法的抽象类这样定义是可以的，这样做的目的：不让其他类创建本类对象
}
*/



/*
class Demo4_Abstract {
    public static void main(String[] args){
        System.out.println("hello world");
    }
}


abstract class Demo2{
    public static abstract void print();   // 错误：非法修饰符组合：abstract和static
}                                          // 被abstract修饰的方法有方法体，而被static修饰的方法可以用类名调用，但是"类名.抽象方法"这样是没有意义的
*/

/*
class Demo4_Abstract {
    public static void main(String[] args){
        System.out.println("hello world");
    }
}


abstract class Demo2{
    public final abstract void print();   // 错误：非法修饰符组合：final和abstract
}                                         // 被abstract修饰的方法强制子类重写，而被final修饰的方法不允许子类重写，所以它俩是矛盾的
*/

/*
class Demo4_Abstract {
    public static void main(String[] args){
        System.out.println("hello world");
    }
}


abstract class Demo2{
    private abstract void print();   // 错误：非法修饰符组合：private和abstract
}                                    // 被abstract修饰是为了让子类看到并强制重写，而被private修饰的方法不让子类访问，所以它俩是矛盾的
*/