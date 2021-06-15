package Vezbanje;

import java.util.Scanner;

public class Vezba3
{

  public static void main(String[] args)
  {
    // Napisati da li srednja cifra kod unetog trocifrenog broja parna ili neparna.
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Unesi trocifren broj: ");
    int broj = s.nextInt();
    
    s.close();
    
    if (broj < 100 || broj > 999)
    {
      System.out.println("Greska! Unesi trocifren broj.");
      return;
    }
    
    int srednji;
    
    srednji = broj % 100 / 10;
    
    System.out.println("Srednji broj je " + srednji);
    
    if(srednji % 2 == 0)
    {
      System.out.println("On je paran");
    }
    else
    {
      System.out.println("On je neparan");
    }
    
    

  }

}
