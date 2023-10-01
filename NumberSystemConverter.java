# Nexabyt
  import java.util.Scanner;

public class NumberSystemConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number System Converter");
        System.out.println("1. Decimal to Binary");
        System.out.println("2. Binary to Decimal");
        System.out.print("Select an option (1/2): ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter a decimal number: ");
                int decimalNumber = scanner.nextInt();
                String binaryResult = decimalToBinary(decimalNumber);
                System.out.println("Binary equivalent: " + binaryResult);
                break;
            case 2:
                System.out.print("Enter a binary number: ");
                String binaryNumber = scanner.nextLine();
                int decimalResult = binaryToDecimal(binaryNumber);
                System.out.println("Decimal equivalent: " + decimalResult);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    public static String decimalToBinary(int decimalNumber) {
        return Integer.toBinaryString(decimalNumber);
    }

    public static int binaryToDecimal(String binaryNumber) {
        return Integer.parseInt(binaryNumber, 2);
    }
                  }
