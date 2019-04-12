class Test3_Person {
    public static void main(String[] args){
        System.out.println("hello world");
    }
}

class Student3{
    private String name;
    private int age;

    public Student3(){}

    public Student3(String name,int age){
        this.name=name;
        this.age=age;
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

    public void eat(){
        System.out.println("学生吃饭");
    }

    public void study(){
        System.out.println("学生学习");
    }
}

class Teacher{
    private String name;
    private int age;

    public Teacher(){}

    public Teacher(String name,int age){
        this.name=name;
        this.age=age;
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

    public void teach(){
        System.out.println("老师讲课");
    }
}