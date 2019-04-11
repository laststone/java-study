class Demo3_Extends {
    public static void main(String[] args){
        Son s=new Son();
        s.show();
    }
}


class Father{
    //private void show(){                        // 私有成员不能被继承
    public void show(){                           // 非私有成员可以被继承
        System.out.println("Hello world");
    }
}

class Son extends Father{

}