/*
class Demo3_Final {
    public static void main(String[] args){
        Demo d=new Demo();
        d.print();
    }
}


class Demo{
    int num=10;

    public void print(){
        System.out.println(num);
    }
}
*/

/*
class Demo3_Final {
    public static void main(String[] args){
        Demo d=new Demo();
        d.print();
    }
}


class Demo{
    final int num=10;               // 成员变量的默认初始化值是无效的

    public void print(){
        System.out.println(num);
    }
}
*/


/*
class Demo3_Final {
    public static void main(String[] args){
        Demo d=new Demo();
        d.print();
    }
}


class Demo{
    final int num;      // 在对象构造前设置final修饰变量即可

    public Demo(){
        num=10;
    }

    public void print(){
        System.out.println(num);
    }
}
*/


class Demo3_Final {
    public static void main(String[] args){
        Demo d=new Demo();
        d.print();
    }
}


class Demo{
    final int num=5;

    public Demo(){
        num=10;         // 在对象构造前已经用final修饰num变量，且已经赋值一次，所以在此构造方法中再次赋值失败
    }

    public void print(){
        System.out.println(num);
    }
}