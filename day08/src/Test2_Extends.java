class Test2_Extends {
    public static void main(String[] args){
        Zi2 z=new Zi2();
    }
}


class Fu2{
    static {
        System.out.println("静态代码块Fu");
    }

    {
        System.out.println("构造代码块Fu");
    }

    public Fu2(){
        System.out.println("构造方法Fu");
    }
}


class Zi2 extends Fu2{
    static {
        System.out.println("静态代码块Zi");
    }

    {
        System.out.println("构造代码块Zi");
    }

    public Zi2(){
        System.out.println("构造方法Zi");
    }
}