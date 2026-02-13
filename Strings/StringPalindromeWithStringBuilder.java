package Strings;

public class StringPalindromeWithStringBuilder {
    
    public static void main(String[] args) {
        String str = "abcd";
        StringBuilder gtr = new StringBuilder(str);
        gtr.reverse();
        String s = gtr + "";
        if(str.equals(s)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        
    }
    
}

