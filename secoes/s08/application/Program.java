package s08.application;

import s08.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Product " + product);

        System.out.println();
        System.out.print("Enter the number add: ");
        int quantity = sc.nextInt();
        product.AddProducts(quantity);
        System.out.println();
        System.out.println("Update data " + product);
        System.out.println();
        System.out.print("Enter the number remove: ");
        quantity = sc.nextInt();
        product.RemoveProducts(quantity);
        System.out.println();
        System.out.println("Update data " + product);
        System.out.println();

        sc.close();
    }
}
