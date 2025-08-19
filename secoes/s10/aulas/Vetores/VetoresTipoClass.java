package secao10.aulas.Vetores;

import secao10.aulas.Vetores.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class VetoresTipoClass {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String name;
        double price;
        double amount = 0.0;
        Product[] vect = new Product[N];

        for(int i = 0; i < vect.length; i++){
            sc.nextLine();
            System.out.print("Enter name:");
            name = sc.nextLine();
            System.out.print("Enter price:");
            price = sc.nextDouble();
            sc.nextLine();
            amount += price;

            vect[i] = new Product(name, price);
        }
        amount = amount/vect.length;

        System.out.printf("Average: $ %.2f%n", amount);

        sc.close();
    }
}
