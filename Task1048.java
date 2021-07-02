import java.io.IOException;

import java.util.Scanner;
public class Task1048 {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        double moneyEarned, newSalary; 
        if(salary>=0 && salary<=400)
        {
            moneyEarned = salary * 0.15;
            newSalary = salary + moneyEarned;
            System.out.printf("Novo salario: %.2f%n", newSalary);
            System.out.printf("Reajuste ganho: %.2f%n", moneyEarned);
            System.out.println("Em percentual: 15 %");
        }
        else if(salary>400 && salary<=800)
        {
            moneyEarned = salary * 0.12;
            newSalary = salary + moneyEarned;
            System.out.printf("Novo salario: %.2f%n", newSalary);
            System.out.printf("Reajuste ganho: %.2f%n", moneyEarned);
            System.out.println("Em percentual: 12 %");
        }
        else if(salary>800 && salary<=1200)
        {
            moneyEarned = salary * 0.10;
            newSalary = salary + moneyEarned;
            System.out.printf("Novo salario: %.2f%n", newSalary);
            System.out.printf("Reajuste ganho: %.2f%n", moneyEarned);
            System.out.println("Em percentual: 10 %");
        }
        else if(salary>1200 && salary<=2000)
        {
            moneyEarned = salary * 0.07;
            newSalary = salary + moneyEarned;
            System.out.printf("Novo salario: %.2f%n", newSalary);
            System.out.printf("Reajuste ganho: %.2f%n", moneyEarned);
            System.out.println("Em percentual: 7 %");
        }
        else if(salary>2000)
        {
            moneyEarned = salary * 0.04;
            newSalary = salary + moneyEarned;
            System.out.printf("Novo salario: %.2f%n", newSalary);
            System.out.printf("Reajuste ganho: %.2f%n", moneyEarned);
            System.out.println("Em percentual: 4 %");
        }
    }
}

