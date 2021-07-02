import java.util.Scanner;
public class Task1061 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.next(); // this is used to input the " : " between integers
        int iDay = sc.nextInt();
        int iHour = sc.nextInt();
        str = sc.next();
        int iMin = sc.nextInt();
        str = sc.next();
        int iSec = sc.nextInt();
        str = sc.next();
        int eDay = sc.nextInt();
        int eHour = sc.nextInt();
        str = sc.next();
        int eMin = sc.nextInt();
        str = sc.next();
        int eSec = sc.nextInt();
        int days = 0, hours = 0, minutes = 0, seconds = 0;
        boolean bHour = false, bMin = false, bSec = false; /*  boolean is used to check first if the initial times are greater than
        the final times. If it is checked later, by then the initial times are already changed due to ++ use  */
        
        if (iHour > eHour) {
            bHour = true;
        }
        if (iMin > eMin) {
            bMin = true;
        }
        if (iSec > eSec) { 
            bSec = true;
        }
        
        
        while (iDay != eDay) {
            days++;
            iDay++;
        }
        while (iHour != eHour) {
            hours++;
            iHour++;
            if (iHour == 25) {
                iHour = 1;
            }
        }
        while (iMin != eMin) {
            minutes++;
            iMin++;
            if (iMin == 61) {
                iMin = 1;
            }
        }
        while (iSec != eSec) {
            seconds++;
            iSec++;
            if (iSec == 61) {
                iSec = 1;
            }
        }
        
        
        if (bHour == true) {
            days--;
        }
        if (bMin == true) {
            hours--;
        }
        if (bSec == true) {
            minutes--;
        }
        System.out.println(days + " dia(s)");
        System.out.println(hours + " hora(s)");
        System.out.println(minutes + " minuto(s)");
        System.out.println(seconds + " segundo(s)");
    }
}
    