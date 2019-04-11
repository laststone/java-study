class Demo1_ArrayTool {
    public static void main(String[] args){
        int [] arr={33,11,22,66,55,44};
        /*  工具类中成员方法变成静态方法后，不需要实例化就可以直接调用
        ArrayTool at=new ArrayTool();
        int max=at.getMax(arr);
        System.out.println("MAX: " + max);

        System.out.println("---------反转前----------");
        at.print(arr);
        System.out.println("---------反转后----------");
        at.revArray(arr);
        at.print(arr);
        */

        // 直接调用工具类中的静态成员方法
        ArrayTool.print(arr);

        // 由于ArrayTool工具类的构造方法被私有化，因此不能再对ArrayTool类进行实例化
        //ArrayTool at2=new ArrayTool();
    }
}
