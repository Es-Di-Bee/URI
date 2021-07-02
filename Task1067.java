import java.io.IOException;
import java.util.Scanner;

public class Task1067 {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0; i <= num; i++)
        {
            if(i%2 != 0)
            {
                System.out.println(i);
            }
        }
    }
}




