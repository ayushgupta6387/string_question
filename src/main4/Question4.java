package main4;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String s = "aeiouAEIOU";
        for (int i = 0; i < 10; i++) {
            String r = s.charAt(i) + "";
            input = input.replace(r, "*");
        }
        System.out.println(input);
        char c[] = input.toCharArray();
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '*') {
                count++;
            }
            if (c[i] == '*' && count % 3 == 2) {
                c[i] = '^';
            }

        }
