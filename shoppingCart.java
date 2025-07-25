import java.util.Scanner;
public class shoppingCart {
    public static void main(String[] args){
        // Shopping cart program

        Scanner scanner = new Scanner(System.in);
         String item;
         double price;
         int qty;
         char currency='$';
         double total;

        System.out.print("Item purchased: ");
        item = scanner.nextLine();

        System.out.print("Price of one item pruchased: ");
        price = scanner.nextDouble();

        System.out.print("Qty of item purchased :");
        qty = scanner.nextInt();

        total = price * qty;
        System.out.println("Your total amount is : " + total+ currency);
        scanner.close();


    }
}
