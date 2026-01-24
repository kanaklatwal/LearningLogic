package Strings;

import java.util.Scanner;

public class countFrequency {

    public static void count(String s) {
        boolean[] visited = new boolean[s.length()];

        for (int i = 0; i < s.length(); i++) {
            if (visited[i]) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println("The frequency of " + s.charAt(i) + " is " + count);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        count(str);
    }
}
