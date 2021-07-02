import java.util.Scanner;
public class Task1042 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int min = 0;
        int max = 0;
        int remNum = 0;
        if(num1>num2 && num1>num3)
        {
            max = num1;
            if(num2>num3)
            {
                min = num3;
                remNum = num2;
            }
            else
            {
                min = num2;
                remNum = num3;
            }
        }
        else if(num2>num1 && num2>num3)
        {
            max = num2;
            if(num1>num3)
            {
                min = num3;
                remNum = num1;
            }
            else
            {
                min = num1;
                remNum = num3;
            }
        }
        else if(num3>num1 && num3>num2)
        {
            max = num3;
            if(num1>num2)
            {
                min = num2;
                remNum = num1;
            }
            else
            {
                min = num1;
                remNum = num2;
            }
        }
        System.out.println(min);
        System.out.println(remNum);
        System.out.println(max);
        System.out.println();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);  
    }
}