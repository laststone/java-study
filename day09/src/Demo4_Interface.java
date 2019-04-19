public class Demo4_Interface {
    public static void main(String[] args){
        System.out.println("hello world");
    }
}


interface 某干爹{
    public void 关系();
    public void 潜规则();
}


class 某女星 implements 某干爹{
    public void 关系(){
        System.out.println("借助干爹关系上位");
    }

    public void 潜规则(){
        System.out.println("你们懂的");
    }
}