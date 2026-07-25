import java.util.Scanner;
class Product {
    int id;
    String name;
    double price;
    int quantity;
}
public class Bill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product[] products = new Product[5];
        double totalBill = 0;

        for (int i = 0; i < 5; i++) {
            products[i] = new Product();

            System.out.println("\nEnter Details of Product " + (i + 1));

            System.out.print("Product ID: ");
            products[i].id = sc.nextInt();

            sc.nextLine(); // consume newline

            System.out.print("Product Name: ");
            products[i].name = sc.nextLine();

            System.out.print("Product Price: ");
            products[i].price = sc.nextDouble();

            System.out.print("Product Quantity: ");
            products[i].quantity = sc.nextInt();
        }
        System.out.println("\n------------- PRODUCT BILL -------------");
        System.out.println("ID\tName\t\tPrice\tQty\tAmount");
        for (int i = 0; i < 5; i++) {
            double amount = products[i].price * products[i].quantity;
            totalBill += amount;
            System.out.println(
                products[i].id + "\t" +
                products[i].name + "\t\t" +
                products[i].price + "\t" +
                products[i].quantity + "\t" +
                amount
            );
        }
        double discount = 0;

        if (totalBill >= 5000) {
            discount = totalBill * 20 / 100;
        }
        else if (totalBill >= 3000) {
            discount = totalBill * 15 / 100;
        }
        else if (totalBill >= 1000) {
            discount = totalBill * 10 / 100;
        }
        double finalAmount = totalBill - discount;

        System.out.println("----------------------------------------");
        System.out.println("Total Bill      : " + totalBill);
        System.out.println("Discount Amount : " + discount);
        System.out.println("Final Amount    : " + finalAmount);
        System.out.println("----------------------------------------");

        sc.close();
    }
}