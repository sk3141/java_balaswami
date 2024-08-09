import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the type of item (1 for Mill cloth, 2 for Handloom items): ");
        int itemType = scanner.nextInt();

        System.out.print("Enter the purchase amount: ");
        double purchaseAmount = scanner.nextDouble();

        double discount = 0.0;

        switch (itemType) {
            case 1: 
                if (purchaseAmount >= 0 && purchaseAmount <= 100) {
                    discount = 0.0;
                } else if (purchaseAmount >= 101 && purchaseAmount <= 200) {
                    discount = 5.0;
                } else if (purchaseAmount >= 201 && purchaseAmount <= 300) {
                    discount = 7.5;
                } else if (purchaseAmount > 300) {
                    discount = 10.0;
                }
                break;

            case 2: 
                if (purchaseAmount >= 0 && purchaseAmount <= 100) {
                    discount = 5.0;
                } else if (purchaseAmount >= 101 && purchaseAmount <= 200) {
                    discount = 7.5;
                } else if (purchaseAmount >= 201 && purchaseAmount <= 300) {
                    discount = 10.0;
                } else if (purchaseAmount > 300) {
                    discount = 15.0;
                }
                break;

            default:
                System.out.println("Invalid item type entered.");
                return;
        }

        
        double discountAmount = (discount / 100) * purchaseAmount;
        double netAmount = purchaseAmount - discountAmount;

        System.out.println("Discount: " + discount + "%");
        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Net Amount to be paid: " + netAmount);
    }
}