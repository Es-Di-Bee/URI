import java.io.IOException;

import java.util.Scanner;
public class Task1047 {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int sHour = sc.nextInt();
        int sMin = sc.nextInt();
        int eHour = sc.nextInt();
        int eMin = sc.nextInt();
        int hours = 0;
        int minutes = 0;
        
        if(sHour < eHour)
        {
            if( (eHour- sHour) == 1)
            {
                if(sMin == eMin)
                {
                    hours = 1;
                }
                else
                {
                    hours = 0;
                }
            }
            else
            {
                hours = eHour - sHour;
            }
            if(sMin < eMin)
            {
                minutes = eMin - sMin;
            }
            else if(sMin > eMin && hours == 0)
            {
                minutes = (60 - sMin) + eMin;
            }
            else if(sMin > eMin && hours != 0)
            {
                hours -= 1;
                minutes = (60 - sMin) + eMin;
            }
            else if(sMin == eMin)
            {
                minutes = 0;
            }
        }
        
        
        else if(sHour > eHour)
        {
            if(sMin < eMin)
            {
                hours = (24 - sHour) + eHour;
                minutes = eMin - sMin;
            }
            else if(sMin > eMin)
            {
                hours = (24 - sHour) + eHour - 1;
                minutes = (60 - sMin) + eMin;
            }
            else if(sMin == eMin)
            {
                hours = 24 - (sHour - eHour);
                minutes = 0;
            }
        }
        
        else if(sHour == eHour && sMin == eMin)
        {
            hours = 24;
            minutes = 0;
        }
        
        else if(sHour == eHour && sMin > eMin)
        {
            hours = 23;
            minutes = 60 - (sMin - eMin);
        } 
        
        else if(sHour == eHour && sMin < eMin)
        {
            hours = 0;
            minutes = eMin - sMin;
        }
        
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", hours, minutes);
        System.out.println();
    }
}

