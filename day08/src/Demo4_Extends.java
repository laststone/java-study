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
    int num2=20;

    public void print(){
        System.out.println(num1);                 // 子父类出现同名变量，只是在讲课演示，在实际开发中不会出现这种情况
        System.out.println(num2);   // 就近原则    // 子类继承父类就是为了使用父类的成员，那么如果定义了同名的成员变量没有意义了
    }
}
