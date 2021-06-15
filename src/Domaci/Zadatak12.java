package Domaci;

import java.util.Scanner;

public class Zadatak12
{

  public static void main(String[] args)
  {
    // Napisati program gde korisnik preko skenera unese brojeve od 1 do 10
    // (ukljucujuci 1 i 10) i program mu vrati odgovor da li je broj prost ili ne.
    // (Prost broj je onaj koji je deljiv samo sa brojem 1 i sa sobom)
    
    Scanner s = new Scanner(System.in);
    System.out.println("Unesi broj od 1 do 10: ");
    int broj = s.nextInt();
    
    s.close();  
    
    if(broj < 1 || broj > 10)
    {
      System.out.println("Uneti broj nije dobar.");
      return;
    }
    
    if(isProst(broj))
    {
      System.out.println(broj + " je prost broj.");
    }
    else
    {
      System.out.println(broj + " nije prost broj.");
    }
  }
  
  public static boolean isProst(int broj)
  {
    boolean prostBroj = true;
    
    for(int i = 2; i < broj; i++)
    {
      if(broj % i == 0) 
      {
        prostBroj = false;
        break;
      }
    }
    return prostBroj;
  }
  
  // Test
  // Broj - Rezultat
  // 0  - Uneti broj nije dobar.
  // 1  - 1 je prost broj.
  // 7  - 7 je prost broj.
  // 8  - 8 nije prost broj.
  // 10 - 10 nije prost broj.
  // 11 - Uneti broj nije dobar.

}
