class Test3_Employee {
    public static void main(String[] args){
        Coder c=new Coder("德玛西亚","007",8000);
        c.work();

        System.out.println("--------------------------");

        Manager m=new Manager("苍老师", "9527",20000,30000);
        m.work();
    }
}


abstract class Employee{
    private String name;
    private String id;
    private double salary;

    public Employee(){}

    public Employee(String name,String id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void setId(String id){
        this.id=id;
    }

    public String getId(){
        return this.id;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

    public double getSalary(){
        return this.salary;
    }

    public abstract void work();

}

//程序员
class Coder extends Employee{
    public Coder(){}

    public Coder(String name,String id,double salary){
        super(name,id,salary);
    }

    public void work(){
        System.out.println("我的姓名是：" + this.getName() + "，我的工号是：" + this.getId() + "，我的工资是：" + this.getSalary() + "，我的工作是敲代码");
    }
}


// 项目经理

class Manager extends Employee{
    private int bonus;

    public Manager(){}

    public Manager(String name,String id,double salary,int bonus){
        super(name,id,salary);
        this.bonus=bonus;
    }

    public void work(){
        System.out.println("我的姓名是：" + this.getName() + "，我的工号是：" + this.getId() + "，我的工资是：" + this.getSalary() + "，我的奖金是：" + bonus + "，我的工作内容时管理");

    }
}