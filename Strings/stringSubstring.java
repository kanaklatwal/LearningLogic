package Strings;

public class stringSubstring {
    //substring :- the substring is the continouus part of a string
    /* if str = "abcd" 
    than substrings of string str are a, ab, abc, abcd, b, bc, bcd, c, cd, d
    substring(0,3) -> 0th index -> (3-1 =2) index  0->included, 3->excluded*/
    public static void main(String[] args) {
        String str = "abcde";
        System.out.println(str.substring(0,2));//ab
        System.out.println(str.substring(0,5));// abcde
        System.out.println(str.substring(0));//abcde
        System.out.println(str.substring(3));//de

    }


}
