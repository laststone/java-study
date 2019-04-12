class Demo7_Extends {
    public static void main(String[] args){
        Son5 s=new Son5();
        s.print();
        s.method();
    }
}


class Father5{
    public void print(){
        System.out.println("Fu Print");
    }
}

class Son5 extends Father5{
    public void method(){
        System.out.println("Zi method");
    }

    public void print(){
        super.print();                      // super可以调用父类的成员方法
        System.out.println("Zi Print");
    }
}