package s08.exercicios.ex01.application;

import s08.exercicios.ex01.entities.Rectangle;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.print("Height: ");
        rectangle.height = sc.nextDouble();
        System.out.print("Width: ");
        rectangle.width = sc.nextDouble();

        System.out.println("Area: " + String.format("%.2f",rectangle.Area()));
        System.out.println("Perimeter: " + String.format("%.2f",rectangle.Perimeter()));
        System.out.println("Diagonal: " + String.format("%.2f",rectangle.Diagonal()));

        sc.close();
    }
}
