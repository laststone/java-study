public class Test1_Rectangle {
    public static void main(String[] arags){
        Rectangle r=new Rectangle(10,20);
        System.out.println(r.getLength());              //获取周长
        System.out.println(r.getArea());                //获取面积
    }
}


class Rectangle{
    private int width;
    private int high;

    public Rectangle(){}        // 空参构造

    public Rectangle(int width,int high){
        this.width=width;
        this.high=high;
    }

    public void setWidth(int width){
        this.width=width;
    }

    public int getWidth(){
        return this.width;
    }

    public void setHigh(int high){
        this.high=high;
    }

    public int getHigh(){
        return this.high;
    }

    public int getLength(){
        return 2*(width+high);
    }

    public int getArea(){
        return width*high;
    }
}