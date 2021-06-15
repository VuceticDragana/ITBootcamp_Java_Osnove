package Dan_02;

import java.util.Scanner;

public class Vezba3
{

  public static void main(String[] args)
  {
    // Napisati program koji
//  cuva podatke o korisniku(Ime, Prezime, Email, godinuRodjenja, 
//  fakultet, prosecnu ocenu, omiljeno slovo i informaciju da li voli programiranje),
//  i stampa podatke u formatu
//  Ime: Milan
//  Prezime: Jovanovic
//  Email: milan@gmail.com
//  godina rodjenja: 1988
//  fakultet: Ekonomski
//  prosecna ocena: 8.57
//  omiljeno slovo: V
//  da li voli programiranje: TRUE
//  sve unose izvrsiti kroz tastaturu
    
    Scanner s = new Scanner (System.in);
    
    System.out.println("Unesi ime: ");
    String ime = s.next();
    
    System.out.println("Unesi prezime: ");
    String prezime = s.next();
    
    System.out.println("Unesi email: ");
    String email = s.next();
    
    System.out.println("Unesi godinu rodjenja: ");
    int godinaRodjenja = s.nextInt();
    
    System.out.println("Unesi fakultet: ");
    String fakultet = s.next();
    
    System.out.println("Unesi prosecnu ocenu: ");
    double prosecnaOcena = s.nextDouble();
    
    System.out.println("Unesi omiljeno slovo: ");
    char omiljenoSlovo = s.next().charAt(0);
    
    System.out.println("Da li volis programiranje? ");
    boolean programiranje = s.nextBoolean();
    
    System.out.printf("\nIme: %s\nPrezime: %sEmail: %s\nGodina rodjenja: %d\nFakultet: %s\nProsecna osena: %.2f\nOmiljeno slovo: %s\nDa li voli programiranje: %s",
        ime, prezime, email, godinaRodjenja, fakultet, prosecnaOcena, omiljenoSlovo, programiranje);
    
    s.close();

  }

}
