import java.io.IOException;
import java.util.Scanner;

public class Task1065 {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int evenCount = 0;
        for(int i = 1; i<=5; i++)
        {
            int num = sc.nextInt();
            if(num %2 == 0)
            {
                evenCount++;
            }
        }
        System.out.println(evenCount + " valores pares");
    }
}

    
