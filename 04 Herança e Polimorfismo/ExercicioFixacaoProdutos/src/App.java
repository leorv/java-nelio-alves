import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of products:");
        int numberOfProducts = Integer.parseInt(sc.nextLine());

        List<Product> products = new ArrayList<Product>();

        for (int i = 0; i < numberOfProducts; i++) {
            System.out.printf("Product #%d data:", i);
            System.out.println();

            System.out.println("Common, used or imported? (c, u, i)");
            char choice = sc.nextLine().charAt(0);

            System.out.printf("Name: ");
            String name = sc.nextLine();

            System.out.printf("Price: $");
            double price = Double.parseDouble(sc.nextLine());

            Product product;

            if (choice == 'u') {
                DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                System.out.printf("Manufacture data (dd/MM/yyyy): ");
                LocalDate manufactureDate = LocalDate.parse(sc.nextLine(), fmt1);
                product = new UsedProduct(name, price, manufactureDate);
            } else if (choice == 'i') {
                System.out.printf("CUstoms fee: $");
                double customsFee = Double.parseDouble(sc.nextLine());
                product = new ImportedProduct(name, price, customsFee);
            } else {
                product = new Product(name, price);
            }

            products.add(product);
        }

        System.out.println("PRICE TAGS:");

        for (Product p : products) {
            p.priceTag();
        }

        sc.close();
    }
}
