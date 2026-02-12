import java.util.*;
public class stringIntChar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = "abc";
        str = str + "xyz";
        str += 'r';
        str += 10;
        System.out.println(str);
        System.out.println("abc" + "xyz");  // abcxyz
        System.out.println("abc" + 10 + 20); // abc1020
        System.out.println("abc" + (10 + 20)); // abc30
        System.out.println( 10 + 20 +"abc" );  // 30abc
    }
}