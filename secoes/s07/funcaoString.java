package s07;

import java.util.Scanner;

public class funcaoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original = "abcd efghAS AfSD    cd      ";
        String s1 = original.toLowerCase();
        String s2 = original.toUpperCase();
        String s3 = original.trim();
        String s4 = original.substring(2);
        String s5 = original.substring(2, 8);
        String s6 = original.replace('a', 'x');
        String s7 = original.replace("abcd", "xy");
        int i = original.indexOf("cd");
        int j = original.lastIndexOf("cd");

        System.out.println("Original: -" + original + "-");
        System.out.println("Lower: -" + s1 + "-");
        System.out.println("Upper: -" + s2 + "-");
        System.out.println("Trim: -" + s3 + "-");
        System.out.println("SubString 2: -" + s4 + "-");
        System.out.println("SubString 2/8: -" + s5 + "-");
        System.out.println("Replace char: -" + s6 + "-");
        System.out.println("Replace string: -" + s7 + "-");
        System.out.println("Index: -" + i + "-");
        System.out.println("Last Index: -" + j + "-");

        sc.close();
    }
}
