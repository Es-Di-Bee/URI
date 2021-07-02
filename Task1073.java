import java.util.Scanner;
public class Task1073 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 2; i <= n; i+=2) {
            int product = i * i;
            System.out.println(i + "^2 = " + product);
        }
    }
}
            