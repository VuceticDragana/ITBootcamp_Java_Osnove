package Dan_04;

import java.util.Scanner;

public class Vezba2
{

  public static void main(String[] args)
  {
    // uneti dva broja s tastature (prvi je manji, drugi je veci) i napraviti while
    // petlju koja ispisuje
    // sve brojeve izmedju ukljucujuci i granicne vrednosti
    // ako se unesu 4 i 8 ispisace se 4 5 6 7 8
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Unesi 1. broj: ");
    int prviBroj = s.nextInt();
    
    System.out.println("Unesi 2. broj koji je veci od 1. broja: ");
    int drugiBroj = s.nextInt();   
    
    
    while (prviBroj <= drugiBroj)
    {
      System.out.println("Broj je " + prviBroj);
      prviBroj++;
    }    
    
    s.close();

  }

}
