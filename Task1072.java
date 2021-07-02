import java.util.Scanner;
public class Task1072 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int inCount = 0;
        int outCount = 0;
        for(int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            if (x >= 10 && x <=20) {
                inCount++;
            } else {
                outCount++;
            }
        }
        System.out.println(inCount + " in");
        System.out.println(outCount + " out");
    }
}
            