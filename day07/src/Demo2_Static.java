public class Demo2_Static {
    public static void main(String[] args){
        Demo d=new Demo();
        d.print();          // 非静态方法只能在实例化之后通过对象调用

        Demo.print2();      // 静态方法是可以直接通过类名调用
    }
}

class Demo{
    int num1=10;
    static int num2=20;

    public void print(){            // 非静态成员方法
        System.out.println(num1);
        System.out.println(num2);
    }

    public static void print2(){    // 静态成员方法
        //System.out.println(num1);     // 注意：静态成员方法中不能访问非静态成员变量
        System.out.println(num2);
    }
}
