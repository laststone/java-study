class Demo5_Extends {
    public static void main(String[] args){
        Son3 s=new Son3();
    }
}


class Father3 extends Object{                       // 可以把它写全了，默认继承Object父类
//class Father3{
    public Father3(){
        //super();                                  // 这里默认也有一个super()，执行父类的空参构造方法----这里Father类的父类默认是Object类
        System.out.println("Father 的空参构造方法");
    }
}

class Son3 extends Father3{
    public Son3(){
        //super();                                // 这条语句，如果不写系统也会默认加上，用来访问父类中的空参构造
        System.out.println("Son 的构造方法");      // 子类中所有的构造犯法默认都会访问父类中空参构造方法
    }
}