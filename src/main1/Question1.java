package main1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.print("index :" + "\t");
        for (int i = 0; i < input.length(); i++) {
            if (i == 0) {
                System.out.print(i + "\t" + "\t");
            } else {
                System.out.print(i + "\t");
            }
        }
        System.out.println("");
        System.out.print("chars :" + "\t");
        for (int i = 0; i < input.length(); i++) {
            if (i == 0) {
                System.out.print(input.charAt(i) + "\t" + "\t");
            } else {
                System.out.print(input.charAt(i) + "\t");
            }
        }

    }
}
