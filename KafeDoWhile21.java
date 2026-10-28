import java.util.Scanner;

public class KafeDoWhile21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int coffee, tea, breads;
        String customerName;
        int coffeePrice = 12000, teaPrice = 7000, breadPrice = 20000;
        int totalPrice;

        do {
            System.out.print("Enter customer name (type 'cancel' to exit): ");
            customerName = sc.nextLine();

            if (customerName.equalsIgnoreCase("cancel")) {
                System.out.println("Transaction canceled.");
                break;
            }

            System.out.print("Number of coffees: ");
            coffee = sc.nextInt();
            System.out.print("Number of teas: ");
            tea = sc.nextInt();
            System.out.print("Number of breads: ");
            breads = sc.nextInt();

            totalPrice = (coffee * coffeePrice) + (tea * teaPrice) + (breads * breadPrice);
            System.out.println("Total to be paid: Rp " + totalPrice);
            
            sc.nextLine(); // Clear buffer newline
        } while (true);

        System.out.println("All transactions are complete.");
        sc.close();
    }
}