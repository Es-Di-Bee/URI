import java.io.IOException;
import java.util.Scanner;

public class Task1070 {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0)
        {
            num = num + 1;
        }
        System.out.println(num);
        num += 2;
        System.out.println(num);
        num += 2;
        System.out.println(num);
        num += 2;
        System.out.println(num);
        num += 2;
        System.out.println(num);
        num += 2;
        System.out.println(num);
        num += 2;
    }
}

