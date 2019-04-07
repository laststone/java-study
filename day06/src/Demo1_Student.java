public class Demo1_Student {
    public static void main(String[] args){
        System.out.println("Hello World!");
    }
}

/*
    Java中最基本的单位是类，Jav中用class描述事物也是如此：
        成员变量：   事物的属性
        成员方法：   事物的行为
    定义类其实就是定义类的成员(成员变量和成员方法)
        成员变量：   和以前定义变量一样的，只不过位置发生了改变。在类中，方法外
        成员方法：   和以前定义方法一样的，只不过把static去掉，后面再详细解释static的作用
*/

class Student{
    String name;                            // 姓名
    int age;                                // 年龄
    String gender;                          // 性别

    public void study(){                    // 定义学习方法
        System.out.println("学生学习");
    }

    public void sleep(){                    // 定义睡觉方法
        System.out.println("学生睡觉");
    }
}
