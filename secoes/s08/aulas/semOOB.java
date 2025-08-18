package s08.aulas;

import java.util.Locale;
import java.util.Scanner;

public class semOOB {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC, pX, areaX, pY, areaY;

        System.out.println("X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.println("Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        pX = (xA + xB + xC) / 2;
        areaX = Math.sqrt(pX * (pX - xA) * (pX - xB) * (pX - xC));
        pY = (yA + yB + yC) / 2;
        areaY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY - yC));

        System.out.printf("Area do Y: %.4f%n", areaY);
        System.out.printf("Area do X: %.4f%n", areaX);

        if (areaX > areaY){
            System.out.println("X é maior");
        } else if (areaY < areaX) {
            System.out.println("Y é maior");
        }else{
            System.out.println("São iguais");
        }

        sc.close();
    }
}
