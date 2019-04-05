class Demo2_Continue {
    public static void main(String[] args){
        //continue使用场景：只能在循环中使用
        for (int x=1;x<=10;x++){
            if (x==4){
                continue;
            }
            System.out.println("x = " + x);
        }
    }
}
