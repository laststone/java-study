class Demo2_Extends {
    public static void main(String[] args){
        DemoC d=new DemoC();
        d.show();
    }
}

/*
class DemoA{
    public void show(){
        System.out.println("DemoA");
    }
}

class DemoB{
    public void show(){
        System.out.println("DemoB");
    }
}

//class DemoC extends DemoA,DemoB{      // java只支持单继承，不支持多继承
class DemoC extends DemoA{

}
*/

class DemoA{
    public void show(){
        System.out.println("DemoA");
    }
}

class DemoB extends DemoA{
    public void method(){
        System.out.println("DemoB");
    }
}

class DemoC extends DemoB{
    public void print(){
        System.out.println("DemoC");
    }
}