/*
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
*/


/*
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

    private void 泡妞(){                              // 注意：子类不能继承父类中的私有方法
        System.out.println("唱红歌搞定林夕合鸟女士");
    }
}

class Dayone extends 双桨{

}
*/

/*
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
    void 泡妞(){                              // 子类中重写父类的方法时，其权限只能大于等于父类中该方法的权限
        System.out.println("霸王硬上弓");
    }
}
*/

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

    public static void 泡妞(){
        System.out.println("唱红歌搞定林夕合鸟女士");
    }
}

class Dayone extends 双桨{
    public static void 泡妞(){                // 子类在重写父类中的静态方法时，也必须通过静态方法重写
        System.out.println("霸王硬上弓");
    }
}