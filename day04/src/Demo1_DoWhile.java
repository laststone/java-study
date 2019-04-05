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
    }
}
