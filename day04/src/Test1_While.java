class Test1_While {
    public static void main(String[] args){
        int sum=0;
        int i=1;
        while (i<=100){
            sum+=i;
            i++;
        }
        System.out.println("sum = " + sum);

        System.out.println("----------------------");

        int count=0;
        int n=100;
        while (n<=999){
            int ge=n%10;
            int shi=n/10%10;
            int bai=n/10/10%10;
            if (ge*ge*ge+shi*shi*shi+bai*bai*bai==n){
                count++;
            }
            n++;
        }
        System.out.println("count = " + count);

        System.out.println("----------------------");

        int j=1;
        while (j<=10){
            System.out.println("I Love You!");
            j++;
        }
    }
}
