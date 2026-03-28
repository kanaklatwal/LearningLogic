package Strings;

import java.util.Scanner;

// input : I am Student
//Output: Student am I
public class wordsReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        for(int i=words.length-1; i>=0; i--){
            System.out.print(words[i] + " ");
        }
//        String result ="";
//        for(int i=words.length-1; i>=0; i--){
//            result += words[i];
//            if(i!=0){
//                result += " ";
//            }
//        }
//        System.out.println(result);
    }
}
