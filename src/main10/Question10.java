package main10;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char ch = sc.next().charAt(0);
        char cs[] = input.toCharArray();
        for (int i = 0; i < input.length(); i++) {
            if (cs[i] == ch) {
                System.out.println(i);
                break;
            }

            }
        }
}