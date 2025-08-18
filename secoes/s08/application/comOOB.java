package s08.application;

import s08.entities.Triangulo;

import java.util.Locale;
import java.util.Scanner;
import s08.entities.Triangulo;

public class comOOB {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangulo x,y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

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
