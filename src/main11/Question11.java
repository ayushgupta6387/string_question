package main11;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        String input = cs.nextLine();
        char ch = cs.next().charAt(0);
        char ar[] = input.toCharArray();
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == ch) {
                System.out.println(i);

            }
        }
    }
}
