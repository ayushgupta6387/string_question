package main9;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int uppersum = 0;
        int lowersum = 0;
        char c[] = input.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (Character.isUpperCase(c[i]))
                uppersum += (int) c[i];
            else if (Character.isLowerCase())
                lowersum += (int) c[i];

        }

    }
}

}
