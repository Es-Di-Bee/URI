import java.util.Scanner;
public class Task1071 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = 0;
        if (x > y) { 
            int number = y + 1;
            while (number < x) {
                if(number % 2 != 0) {
                    sum += number;
                }
                number++;
            }
        }  else if (x < y) { 
            int number = x + 1;
            while (number < y) {
                if(number % 2 != 0) {
                    sum += number;
                }
                number++;
            }
        } else {
            sum = 0;
        }
        System.out.println(sum);
    }
}
                
                