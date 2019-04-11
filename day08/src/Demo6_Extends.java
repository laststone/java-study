class Demo6_Extends {
    public static void main(String[] args){
        Son4 s=new Son4();
        System.out.println("------------------");
        Son4 s2=new Son4("张三",23);
    }
}

/*
class Father4{
    private String name;
    private int age;

    public Father4(){
        System.out.println("Father 的空参构造");
    }

    public Father4(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("Father 的有参构造");
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
}


class Son4 extends Father4{
    public Son4(){
        //super();                              // 这个地方隐藏了一个super()方法------去调用父类的空参构造方法
        System.out.println("Son 的空参构造");
    }

    public Son4(String name,int age){
        //super();                              // 这个地方隐藏了一个super()方法------去调用父类的空参构造方法
        System.out.println("Son 的有参构造");
    }
}
*/

class Father4{
    private String name;
    private int age;

    //public Father4(){                                 // 注意：如果注释父类中的空参构造，那么子类继承时应隐藏的super()方法会调用父类的空参，因为父类下面还有有参构造，所有此时会找不到父类的空参构造而报错！
    //    System.out.println("Father 的空参构造");
    //}

    public Father4(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("Father 的有参构造");
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
}


class Son4 extends Father4 {
    //public Son4() {
    //    //super();                              // 这个地方隐藏了一个super()方法------去调用父类的空参构造方法
    //    System.out.println("Son 的空参构造");
    //}

    public Son4(){
        //super("李四",24);                     // 父类中没有空参构造方法的解决办法一  -----> 用super()传递参数调用父类中存在的有参构造
        this("李四",24);             // 父类中没有空参构造方法的解决办法二  -----> 用this()传递参数调用本类中存在的有参构造，进而进一步往上调用父类的有参构造
        System.out.println("Son 的空参构造");
    }

    public Son4(String name, int age) {
        //super();                              // 这个地方隐藏了一个super()方法------去调用父类的空参构造方法
        super(name,age);                        // 在super方法中指定调用父类的有参构造
        System.out.println("Son 的有参构造");
    }
}