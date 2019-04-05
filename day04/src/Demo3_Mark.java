class Demo3_Mark {
    public static void main(String args[]){
        //使用标记来标识某个循环，可以指定对该标识进行操作
        a: for (int i=1;i<=10;i++){
            System.out.println("i = " + i);
            b: for (int j=1;j<=10;j++){
                System.out.println("j = " + j);
                //break;                            //不加标记，break在那个循环中就跳出那个循环
                //break a;                          //指定跳出a循环
                break b;                            //指定跳出b循环
            }
        }

        System.out.println("------------------------");
        //标记要使用合法的标识符，不能用纯数字
        outer:  for (int m=1;m<=10;m++){
            System.out.println("m = " + m);
            inner:  for (int n=1;n<=10;n++){
                System.out.println("n = " + n);
                break outer;                        //指定跳出外层循环
            }
        }

        System.out.println("------------------------");
        // 面试题：下面的程序会不会报错
        System.out.println("大家好");
        http://www.zzz.com                //这里是一个合法的标记，后面的双斜线是注释符号
        System.out.println("才是真的好");
    }
}
