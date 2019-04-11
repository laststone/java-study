public class Test2_Employee {
    public static void main(String[] args){
        Employee e=new Employee();
        e.work();
    }
}

class Employee{
    private String name;
    private String id;
    private double salary;

    public Employee(){}         // 空参构造

    public Employee(String name,String id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public void setName(String name) {
        this.name = name;
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

    public void work(){
        System.out.println("我的姓名是：" + name + "，我的工号是：" + id + "，我非工资是：" + salary + ",我的工作是敲代码");
    }

}