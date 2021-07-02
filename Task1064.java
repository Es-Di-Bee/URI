import java.io.IOException;
import java.util.Scanner;

public class Task1064 {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int positiveCount = 0;
        double sum = 0;
        for(int i = 1; i<=6; i++)
        {
            double num = sc.nextDouble();
            if(num >= 0)
            {
                positiveCount++;
                sum += num;
            }
        }
        double avg = sum / positiveCount;
        System.out.println(positiveCount + " valores positivos");
        System.out.printf("%.1f%n", avg);
    }
}

    
