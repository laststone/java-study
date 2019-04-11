class Demo2_Math {
    public static void main(String[] args){
        // Math.random()会生成大于等于0.0，并且小于1.0的伪随机数
        for (int i=1;i<10;i++){
                System.out.println(Math.random());
        }

        System.out.println("--------------------------");
        // 生成1-100的随机数
        for (int i=1;i<10;i++){
            System.out.println((int) (Math.random() * 100)+1);
        }

    }
}
