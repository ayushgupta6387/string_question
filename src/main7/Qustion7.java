package main7;

import java.util.Scanner;

public class Qustion7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char c[] = input.toCharArray();
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            sum = sum + (int) c[i];
        }

    }
}
