package Dan_02;

import java.util.Scanner;

public class Vezba5
{

  public static void main(String[] args)
  {
    // uneti broj sa tastature i ispisati da li je pozitivan, negativan ili jednak nulu
    
   Scanner s =  new Scanner(System.in);
   
   System.out.println("Unesi ceo broj: ");
   int broj = s.nextInt();
   
   if (broj > 0)
   {
     System.out.println("Uneti broj je pozitivan.");
   }
   else if (broj < 0)
   {
     System.out.println("Uneti broj je negativan.");
   }
   else
   {
     System.out.println("Uneti broj je nula.");
   }
   
   
   s.close();

  }

}
