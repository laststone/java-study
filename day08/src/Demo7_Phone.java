class Demo7_Phone {
    public static void main(String[] args){
        Ios8 i=new Ios8();
        i.siri();
        i.call();
    }
}


class Ios7{
    public void call(){
        System.out.println("打电话");
    }

    public void siri(){
        System.out.println("speak English");
    }
}

class Ios8 extends Ios7{
    public void siri(){
        System.out.println("说中文");            // 重写父类中相同方法
        super.siri();                           // 也可以用super调用父类中的方法
    }
}