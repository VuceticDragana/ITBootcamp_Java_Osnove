package Domaci;

import java.util.Scanner;

public class Zadatak3
{

  public static void main(String[] args)
  {
    // Napisati program gde korisnik unese kroz skener neko ime, prezime i broj
    // godina, a program stampa ime, prezime i godinu u kojoj je korisnik rodjen (godiste).
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Unesite vase ime: ");
    String ime = s.next();
    
    System.out.println("Unesite vase prezime: ");
    String prezime = s.next();
    
    System.out.println("Unesite koliko godina imate: ");
    int godine = s.nextInt();
    
    System.out.printf("\nIme: %s\nPrezime: %s\nGodiste: %d", ime, prezime, 2021 - godine);
    
    s.close();
    

  }

}
