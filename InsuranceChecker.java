import java.util.Scanner;

public class InsuranceChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Is the driver married? (yes/no): ");
        String married = scanner.next();

        System.out.print("Is the driver male? (yes/no): ");
        String male = scanner.next();

        System.out.print("Enter the driver's age: ");
        int age = scanner.nextInt();

        boolean isInsured;

        if (married.equalsIgnoreCase("yes")) {
            isInsured = true;
        } else {
            if (male.equalsIgnoreCase("yes")) {
                isInsured = age > 30;
            } else {
                isInsured = age > 25;
            }
        }

        System.out.println("Is the driver insured? " + (isInsured ? "Yes" : "No"));
    }
}
