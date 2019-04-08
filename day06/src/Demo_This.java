public class Demo_This {
    public static void main(String[] args){
        Person5 p5=new Person5();
        p5.setName("张三");
        p5.setAge(23);
        System.out.println(p5.getName() + "..." + p5.getAge());

        System.out.println("-------------------------");

        Person5 p6=new Person5();
        p6.setName("李四");
        p6.setAge(24);
        System.out.println(p6.getName() + "..." + p6.getAge());
    }
}


class Person5{
    private String name;
    private int age;

    /*
    public void setAge(int a){
        if(a>0&&a<200){
            age=a;
        }else{
            System.out.println("回火星吧，地球不适合你。。。");
        }
    }

    public int getAge(){
        return age;
    }

    public void setName(String n){
        name=n;
    }

    public String getName(){
        return name;
    }
    */
    public void setAge(int a){
        if(a>0&&a<200){
            this.age=a;
        }else{
            System.out.println("回火星吧，地球不适合你。。。");
        }
    }

    public int getAge(){
        return age;
    }

    public void setName(String n){
        this.name=n;
    }

    public String getName(){
        return name;
    }
}