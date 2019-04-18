class Test1_Polymorphic {
    public static void main(String[] args){
        Fu f=new Fu();
        //f.method();           // 编译看左边，父类中没有这个方法，所以编译报错！！
        f.show();               // 编译看左边，运行看右边（父类中由此方法，所以编译通过，且运行的时候子类中又该方法，则优先执行子类的该方法）
    }
}


class Fu{
    public void show(){
        System.out.println("Fu show");
    }
}

class Zi extends Fu{
    public void show(){
        System.out.println("Zi show");
    }

    public void method(){
        System.out.println("Zi method");
    }
}