import java.io.IOException;

import java.util.Scanner;
public class Task1049 {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        String type1 = "vertebrado";
        String type2 = "ave";
        String type3 = "mamifero";
        String type4 = "carnivoro";
        String type5 = "onivoro";
        String type6 = "herbivoro";
        String type7 = "invertebrado";
        String type8 = "inseto";
        String type9 = "anelideo";
        String type10 = "hematofago";
        
        if(a.equals(type1))
        {
            if(b.equals(type2))
            {
                if(c.equals(type4))
                {
                    System.out.println("aguia");
                }
                else if(c.equals(type5))
                {
                    System.out.println("pomba");
                }
            }
            else if(b.equals(type3))
            {
                if(c.equals(type5))
                {
                    System.out.println("homem");
                }
                else if(c.equals(type6))
                {
                    System.out.println("vaca");
                }
            }
        }
        else if(a.equals(type7))
        {
            if(b.equals(type8))
            {
                if(c.equals(type10))
                {
                    System.out.println("pulga");
                }
                else if(c.equals(type6))
                {
                    System.out.println("lagarta");
                }
            }
            else if(b.equals(type9))
            {
                if(c.equals(type10))
                {
                    System.out.println("sanguessuga");
                }
                else if(c.equals(type5))
                {
                    System.out.println("minhoca");
                }
            }    
        }
    }
}
            
            
            
            
            
