package s05;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in, fi, dur;
        System.out.print("Quando começou? ");
        do {
            in = sc.nextInt();
            if (in < 1 || in > 24) {
                System.out.println("Valor inválido!");
            }
        } while (in < 1 || in > 24);
        System.out.print("Quando acabou? ");
        do {
            fi = sc.nextInt();
            if (fi < 1 || fi > 24) {
                System.out.println("Valor inválido!");
            }
        } while (fi < 1 || fi > 24);
        if (in < fi){
            dur = fi - in;
        }else{
            dur = 24 - in + fi;
        }
        System.out.println("A partida durou " + dur + " horas!");
        sc.close();
    }
}
