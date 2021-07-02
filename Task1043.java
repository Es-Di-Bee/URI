import java.io.IOException;

import java.util.Scanner;
public class Task1043 {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double greatest = 0;
        double perimeter, trapezium;
        if(A+B > C)
        {
            if(B+C > A)
            {
                if(C+A > B)
                {
                    perimeter = A + B + C;
                    System.out.printf("Perimetro = %.1f", perimeter);
                    System.out.println();
                }
                else
                {
                    trapezium = ( ( A + B ) / 2 ) * C;
                    System.out.printf("Area = %.1f", trapezium);
                    System.out.println();      
                }
            }
            else
            {
                trapezium = ( ( A + B ) / 2 ) * C;
                System.out.printf("Area = %.1f", trapezium);
                System.out.println();      
            }
        }
        else
        {
            trapezium = ( ( A + B ) / 2 ) * C;
            System.out.printf("Area = %.1f", trapezium);
            System.out.println();      
        }
    }
}
