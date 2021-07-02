import java.io.IOException;

import java.util.Scanner;
public class Task1046 {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int sTime = sc.nextInt();
        int eTime = sc.nextInt();
        int duration = 0;
        if(sTime < eTime)
        {
            duration = eTime - sTime;
        }
        else if(sTime > eTime)
        {
            duration = (24 - sTime) + eTime;
        }
        else if(sTime == eTime)
        {
            duration = 24;
        }
        System.out.printf("O JOGO DUROU %d HORA(S)", duration);
        System.out.println();
    }
}

