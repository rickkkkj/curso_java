package s07;

import java.util.Scanner;

public class split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "batata arroz feijao";

        // split vai cortar onde tiver oq tiver entre aspas("")
        String[] vect = s.split(" ");
        String p0 = vect[0];
        String p1 = vect[1];
        String p2 = vect[2];

        System.out.println(s);
        System.out.println(p0);
        System.out.println(p1);
        System.out.println(p2);

        sc.close();
    }
}
