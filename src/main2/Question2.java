package main2;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int f1 = sc.nextInt();
        int f2 = sc.nextInt();
        String m = input.substring(f1, f2 + 1);
        System.out.println(m);
    }
}
