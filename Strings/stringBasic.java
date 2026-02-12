package Strings;
import java.util.Scanner;
public class stringBasic {
    public static void main(String[] args){
       String str = "Hello World";  // Declaration
       System.out.println(str);
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();//Initialization
       System.out.println(s);
       // next() method only takes input until the first space, while
       // nextLine() method takes input until the end of the line (include spaces).

       System.out.println(s.length());  // length() method is used to get the length of a string.

       System.out.println(s.charAt(3));
       //charAt(i) method is used to get the character at a specific index in a string

       System.out.println(s.indexOf('a'));
       // indexOf() method is used to find the index of the first occurrence of a specified character or substring in a string.
       

       // compareTo() method is used to compare two strings lexographically. It returns a negative integer, zero, or a positive integer as this string is less than, equal to, or greater than the specified object.
       String str1 = "Hello";
       String str2 = "Zello";
       System.out.println(str1.compareTo(str2)); //-18
       
       String strr = "Happens";
       System.out.println(strr.contains("pens"));
       //contains() method is used to check if a string contains a specified sequence of characters. It returns true if the string contains the specified sequence of characters, and false otherwise.
       
       System.out.println(strr.startsWith("Ha"));
       System.out.println(strr.endsWith("ens"));
       // startsWith() method is used to check if a string starts with a specified prefix. It returns true if the string starts with the specified prefix and false otherwise.
       // endsWith() method is used to check if a string ends with a specified suffix. It returns true if the string ends with the specified suffix and false otherwise.
       

       // toLowerCase() method is used to convert all the characters in a string to lowercase. 
       // toUpperCase() method id used to convert all the characters in a string to uppercase.
       String str3 = "JAAVA PRogramming";
       System.out.println(str3.toLowerCase());
       System.out.println(str3.toUpperCase());

       System.out.println(str1.concat(str2));
       String ss = str1.concat(str2);
       System.out.println(ss);
       //concat() method is used to concatenate two strings. It returns a new string that is the result of concatenating the specified string to the end of the current string.

       
       sc.close();
    }
}
