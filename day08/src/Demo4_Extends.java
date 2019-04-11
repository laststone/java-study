class Demo4_Extends {
    public static void main(String[] args){
        Son2 s=new Son2();
        s.print();
    }
}

class Father2{
    int num1=10;
    int num2=30;
}

class Son2 extends Father2{
    int num1=40;
    int num2=20;

    public void print(){
        System.out.println(num1);                 // 子父类出现同名变量，只是在讲课演示，在实际开发中不会出现这种情况
        System.out.println(num2);   // 就近原则    // 子类继承父类就是为了使用父类的成员，那么如果定义了同名的成员变量没有意义了

        System.out.println("----------------");

        System.out.println(this.num1);              // this关键字指定调用这里子类中的成员属性，否则则会采用就近原则(在子类中找到用子类的，子类中没找到到父类中寻找)
        System.out.println(this.num2);

        System.out.println("----------------");

        System.out.println(super.num2);             // super关键字指定调用父类中的成员属性

    }
}
