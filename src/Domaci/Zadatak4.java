package Domaci;

import java.util.Scanner;

public class Zadatak4
{

  public static void main(String[] args)
  {
    // Napisati program za prijavu polaganja vozacke dozvole gde korisnik unese kroz
    // skener broj godina i program mu vrati jednu od cetiri poruke zavisno od
    // unosa. Ako je korisnik maloletan ispisuje "Samo osobe starije od 18 godina
    // mogu imati vozacku dozvolu", ako je korisnik stariji od 65 godina ispisuje
    // "Korisnici stariji od 65 godina ne mogu polagati za vozacku dozvolu" i ako
    // korisnik unese neki izmedju broj ispisati "Vasa prijava je prihvacena"
    
    System.out.println("-- Prijavu polaganja vozacke dozvole --\n");
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Unesite koliko godina imate: ");
    int godine = s.nextInt();
    
    if (godine < 0)
    {
      System.out.println("Vas unos je pogresan. Uneta vrednost ne moze da bude manja od nule.");
    }
    else if (godine < 18)
    {
      System.out.println("Samo osobe starije od 18 godina mogu imati vozacku dozvolu.");
    }
    else if (godine > 65)
    {
      System.out.println("Korisnici stariji od 65 godina ne mogu polagati za vozacku dozvolu.");
    }
    else
    {
      System.out.println("Vasa prijava je prihvacena.");
    }
    
    s.close();

  }

}
