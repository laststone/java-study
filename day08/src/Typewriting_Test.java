public class Typewriting_Test {
    public static void main(String[] args){
        A a=new A();
        String [] arr={"aaa","bbbb","cccc","dddd"};
        a.test(arr);
    }
}

class A{
    private String name;
    private int age;

    public A(){}

    public A(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return this.age;
    }

    public void test(String[] arr){
        for (int i=1;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}