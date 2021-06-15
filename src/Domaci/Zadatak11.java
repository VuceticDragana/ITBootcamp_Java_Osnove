package Domaci;

import java.util.Scanner;

public class Zadatak11
{

  public static void main(String[] args)
  {
    // Napisati program gde korisnik unese ime, prezime i pol (preko void metode) a
    // main metoda stampa i vraca "Dobrodosao u IT" ili "Dobrodosla u IT" zavisno
    // koji pol unese
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Unesi ime: ");
    String ime = s.next();
    
    System.out.println("Unesi prezime: ");
    String prezime = s.next();
    
    System.out.println("Unesi pol (M/F): ");
    String pol = s.next();
    
    s.close();
    
    prikaz(ime, prezime, pol);
  }
  
  public static void prikaz (String ime, String prezime, String pol)
  {
    if(pol.equals("M") || pol.equals("m"))
    {
      System.out.printf("Dobrodosao u IT %s %s", ime, prezime);
    }
    else if (pol.equals("F") || pol.equals("f"))
    {
      System.out.printf("Dobrodosla u IT %s %s", ime, prezime);
    }
    else
    {
      System.out.println("Unesen nepostojeci pol");
    }
  }
  
  // Test za odredjivanje pola
  // Vrednost - Rezultat
  // M - Dobrodosao u IT ime prezime
  // m - Dobrodosao u IT ime prezime
  // F - Dobrodosla u IT ime prezime
  // a - Unesen nepostojeci pol

}
