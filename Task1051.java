import java.util.Scanner;
public class Task1051 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double tax1 = 0;
        double tax2 = 0;
        double tax3 = 0;
        double totalTax = 0;
        double remainder;
        if (x <= 2000) {
            System.out.println("Isento");
        }
        remainder = x - 2000;
        if (remainder > 0) {
            if (remainder <= 1000) { 
                tax1 = remainder * 0.08;
                System.out.printf("R$ %.2f%n", tax1);
            } else { 
                tax1 = 1000 * 0.08;
            }
            remainder = remainder - 1000;
        }
        if (remainder > 0) {
            if (remainder <= 1500) {
                tax2 = remainder * 0.18;
                totalTax = tax1 + tax2;
                System.out.printf("R$ %.2f%n", totalTax);
            } else {
                tax2 = 1500 * 0.18;
            }
            remainder = remainder - 1500;
        }
        if (remainder > 0) {
            tax3 = remainder * 0.28;
            totalTax = tax1 + tax2 + tax3;
            System.out.printf("R$ %.2f%n", totalTax);
        }
    }
}






