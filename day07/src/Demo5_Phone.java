public class Demo5_Phone {
    public static void main(String[] args){
        Phone p=new Phone();
        p.setBrand("苹果");
        p.setPrice(1500);
        System.out.println(p.getBrand() + "..." + p.getPrice());

        System.out.println("--------------------");

        Phone p2=new Phone("小米",98);
        p2.show();
    }
}

class Phone{
    private String brand;
    private int price;

    public Phone(){             // 空参构造

    }

    public Phone(String brand,int price){
        this.brand=brand;
        this.price=price;
    }

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

    public void show(){
        System.out.println(brand + "..." + price);
    }
}
