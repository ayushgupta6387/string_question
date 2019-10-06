package main5;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("Enter substring you want to replace");
        String input1 = sc.nextLine();
        System.out.println("from which string");
        String input2 = sc.nextLine();
        String new_string = input.replace(input1, input2);
        System.out.println(new_string);

    }
}
