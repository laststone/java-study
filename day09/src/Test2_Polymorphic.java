class Test2_Polymorphic {
    public static void main(String[] args){
        //A a=new A();      // 打印"我"
        //A a=new B();      // 打印"爱"
        A a=new C();        // 打印"你"
        a.show();
    }
}

class A{
    public void show(){
        show2();
    }

    public void show2(){
        System.out.println("我");
    }
}


class B extends A{
    public void show2(){
        System.out.println("爱");
    }
}


class C extends B{
    public void show(){
        show2();
    }

    public void show2(){
        System.out.println("你");
    }
}
