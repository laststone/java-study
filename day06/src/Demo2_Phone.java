public class Demo2_Phone {
    public static void main(String[] args){
        System.out.println("Hello World.");
    }
}

/*
    定义手机类，模仿学生类
        * 属性： 品牌brand和价格price
        * 行为： 打电话call、发信息sendMessage、玩游戏plagGame
*/

class Phone{
    String branc;
    int price;

    public void call(){
        System.out.println("打电话");
    }

    private void SendMessage(){
        System.out.println("发信息");
    };

    public void playGame(){
        System.out.println("玩游戏");
    }
}
