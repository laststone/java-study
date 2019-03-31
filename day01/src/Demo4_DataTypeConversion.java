public class Demo4_DataTypeConversion {
    public static void main(String[] args){
        System.out.println('a');
        System.out.println('a' + 1);  //字符与int计算时，字符会提升为int类型，而a字符的ascii码是97

        System.out.println("hello"+"world"+1); //任何数据类型与字符串相加产生新的字符串
        System.out.println('a'+1+"hello");

        System.out.println(" 5 + 5 = " + (5 + 5));

    }
}
