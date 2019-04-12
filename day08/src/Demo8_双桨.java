public class Demo8_双桨 {
    public static void main(String[] args){
        Dayone d=new Dayone();
        d.泡妞();
    }
}

class 双桨{
    public void sing(){
        System.out.println("唱红歌");
    }

    public void 泡妞(){
        System.out.println("唱红歌搞定林夕合鸟女士");
    }
}

class Dayone extends 双桨{
    public void 泡妞(){
        System.out.println("霸王硬上弓");
    }
}
