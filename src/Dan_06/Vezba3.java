package Dan_06;

import java.util.Scanner;

public class Vezba3
{

  public static void main(String[] args)
  {
    // Napisati kalkulator. Korisnik unosi dva broj i operaciju koju zeli da odradi
    // s njima, a mi ispisujemo rezultat. Operacije su +,-,*,/,%

    Scanner s = new Scanner(System.in);
    
    System.out.println("Unesi 1. broj: ");
    int br1 = s.nextInt();
    
    System.out.println("Unesi matematicku operaciju: ");
    String znak = s.next();
    
    System.out.println("Unesi 2. broj: ");
    int br2 = s.nextInt();
    
    int rezultat;
    
    switch(znak)
    {
    case "+": 
    rezultat = sabiranje(br1, br2);
    System.out.println("Rezultat sabiranja je " + rezultat);
    break;
    
    case "-": 
      rezultat = oduzimanje(br1, br2);
      System.out.println("Rezultat oduzimanja je " + rezultat);
      break;
      
    case "*": 
      rezultat = mnozenje(br1, br2);
      System.out.println("Rezultat mnozenja je " + rezultat);
      break;
      
    case "/": 
      rezultat = deljenje(br1, br2);
      System.out.println("Rezultat deljenja je " + rezultat);
      break;
      
    case "%": 
      rezultat = ostatak(br1, br2);
      System.out.println("Rezultat ostatak je " + rezultat);
      break;
      
      default:
        System.out.println("Takva operacija ne postoji");        
    }    
    
    s.close();
  }
  
  public static int sabiranje (int br1, int br2)
  {
    int zbir;
    zbir = br1 + br2;
    return zbir;
  }
  
  public static int oduzimanje (int br1, int br2)
  {
    int oduzimanje;
    oduzimanje = br1 - br2;
    return oduzimanje;
  }
  
  public static int mnozenje (int br1, int br2)
  {
    int mnozenje;
    mnozenje = br1 * br2;
    return mnozenje;
  }
  
  public static int deljenje (int br1, int br2)
  {
    int deljenje;
    deljenje = br1 * br2;
    return deljenje;
  }
  
  public static int ostatak (int br1, int br2)
  {
    int ostatak;
    ostatak = br1 * br2;
    return ostatak;
  }

}
