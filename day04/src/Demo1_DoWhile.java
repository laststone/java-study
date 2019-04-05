class Demo1_DoWhile {
    public static void main(String args[]){
        int i=1;
        do {
            System.out.println("i = " + i);
            i++;
        }
        while (i<=10);

        System.out.println("-------------------");
        //do...while语句至少要执行一次循环体
        int n=11;
        do {
            System.out.println("n = " + n);
            n++;
        }
        while (n<=10);

        System.out.println("-------------------");
        //while语句可以不执行循环体
        int j=11;
        while (j<=10){
            System.out.println("j = " + j);
            j++;
        }

        System.out.println("-------------------");
        //for循环结束释放变量
        for (int m=1;m<=10;m++){
            System.out.println("m = " + m);
            m++;
        }
        //System.out.println("m = " + m);    //for循环接受会释放变量m，所以这里会报错找不到变量m

        System.out.println("-------------------");
        //简单的死循环之一   while(true){...}
//        while (true){
//            System.out.println("hello world");
//        }

        //简单死循环之二  for(;;){...}
        for(;;){
            System.out.println("hello world");
        }
    }
}
