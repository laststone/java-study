class Test2_For {
    public static void main(String args[]){
        //1-10的和
        int sum = 0;
        for (int i=1;i<=10;i++){
            sum=sum+i;
        }
        System.out.println("sum = " + sum);

        System.out.println("----------------------");

        //1-100的偶数和
        int sum1=0;
        for (int i=1;i<=100;i++){
            if (i%2==0){
                sum1=sum1+i;
            }
        }
        System.out.println("Sum = " + sum1);
    }
}
