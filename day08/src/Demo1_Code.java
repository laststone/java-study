class Demo1_Code {
    public static void main(String[] args){

        /*
        {
            int x=10;               // 限定变量的声明周期
        }
            System.out.println(x);  // 上述代码块中的变量x，在出了代码块后就被释放，所以这里报错找不到x
        */

        {
            int x=10;
            System.out.println(x);
        }

        Student s1=new Student();
        System.out.println("---------------");
        Student s2=new Student("张三",23);



    }
    static {
        System.out.println("我是主方法中的静态代码块");      // 主方法main中的静态代码块-----优先于主方法先执行
    }
}

/*
class Student{
    private String name;
    private int age;

    public Student(){
        study();                            // 在空参构造方法中添加对study成员方法的调用----只要新创建对象就会调用该study方法
        System.out.println("空参构造");
    }

    public Student(String name,int age){
        study();
        this.name=name;
        this.age=age;
        System.out.println("有参构造");
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

    {
        System.out.println("构造代码块");        // 构造代码块：每创建一次对象就会执行一次，优先于构造函数执行
    }

    public void study(){                    // 定义一个学习方法，要求只要创建student类时，就调用该方法
        System.out.println("学生学习");
    }
}
*/

/*
class Student{
    private String name;
    private int age;

    public Student(){
        System.out.println("空参构造");
    }

    public Student(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("有参构造");
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

    {
        study();                        // 调用方式2： 将study()方法调用语句放入构造代码块----优先于构造方法执行，这样每次新创建对象时都会调用该study方法
    }

    public void study(){                    // 定义一个学习方法，要求只要创建student类时，就调用该方法
        System.out.println("学生学习");
    }
}
*/


class Student{
    private String name;
    private int age;

    public Student(){
        System.out.println("空参构造");
    }

    public Student(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("有参构造");
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

    static{
        System.out.println("静态代码块");     // 静态代码块，随着类的加载而加载，且只执行一次
    }                                        // 作用：用来给类进行初始化，一般用来加载驱动

    public void study(){                    // 定义一个学习方法，要求只要创建student类时，就调用该方法
        System.out.println("学生学习");
    }
}