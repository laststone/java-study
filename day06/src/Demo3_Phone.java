public class Demo3_Phone {
    public static void main(String[] args){
        Phone2 p=new Phone2();
        p.setBrand("三星");
        p.setPrice(5288);

        System.out.println(p.getBrand() + "..." + p.getPrice());
        p.call();
        p.sendMessage();
        p.playGame();
    }
}

class Phone2{                   // java bean ： 包含get和set方法的类叫java bean
    private String brand;
    private int price;

    public void setBrand(String brand){
        this.brand=brand;
    }

    public String getBrand(){
        return this.brand;
    }

    public void setPrice(int price){
        this.price=price;
    }

    public int getPrice(){
        return this.price;
    }

    public void call(){
        System.out.println("打电话");
    }

    public void sendMessage(){
        System.out.println("发短信");
    }

    public void playGame(){
        System.out.println("玩游戏");
    }
}
