class Demo1_ForFor {
    public static void main(String[] args){
        //外循环控制行数，内循环控制列数
        for (int i=1;i<=3;i++){
            System.out.println("i = " + i);
            for (int j=1;j<=3;j++){
                System.out.println("j = " + j);
            }
        }

        System.out.println("-------------------");

        for (int m=1;m<=4;m++){
            for (int n=1;n<=5;n++){
                //System.out.println("*");   //println会自动换行
                System.out.print("*");     //print不会自动换行，所有输出在一行
            }
            System.out.println();
        }
    }
}
