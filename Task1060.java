import java.io.IOException;
import java.util.Scanner;

public class Task1060 {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int positiveCount = 0;
        for(int i = 1; i<=6; i++)
        {
            double num = sc.nextDouble();
            if(num > 0)
            {
                positiveCount++;
            }
        }
        System.out.println(positiveCount + " valores positivos");
    }
}
        
        
        
    
