class Demo3_Main {
    //public static void main(String[] a){            // 将数组名由args更改为a也能通过编译，只不过通常习惯使用args作为数组名
    public static void main(String[] args){

        System.out.println(args.length);         // 打印键盘录入数组的长度

        System.out.println("-------------------");

        // 遍历打印键盘输入的数组中的每个成员
        for (int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
}
