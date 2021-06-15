package Domaci;

import java.util.Scanner;

public class Zadatak13
{

  public static void main(String[] args)
  {
    // Napisati program gde korisnik unese redni broj dana u godini (1-365) i
    // program vrati odgovor koji je to dan u nedelji. Podjimo od pretpostavke da je
    // 1. januar ponedeljak.
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Unesite redni broj dana (1-365): ");
    int brDana = s.nextInt();
    
    s.close();
    
    if(brDana < 1 || brDana > 365)
    {
      System.out.println("Greska! Uneli ste broj van granice");
      return;
    }
    
    int ostatak;
    ostatak = brDana % 7;    
    
    switch(ostatak)
    {
    case 0: System.out.println("Nedelja");
    break;
    
    case 1: System.out.println("Ponedeljak");
    break;
    
    case 2: System.out.println("Utorak");
    break;
    
    case 3: System.out.println("Sreda");
    break;
    
    case 4: System.out.println("Cetvrtak");
    break;
    
    case 5: System.out.println("Petak");
    break;
    
    case 6: System.out.println("Subota");
    break;
    }
    
    // Alternativno resenje
    // String[] daniUNedelji = {"Nedelja", "Ponedeljak", "Utorak", "Sreda", "Cetvrtak", "Petak", "Subota"};
    // System.out.println(daniUNedelji[ostatak]);
    
    // Test
    // Broj - Rezultata
    // 0 - Greska! Uneli ste broj van granice
    // 1 - Ponedeljak
    // 100 - Utorak
    // 365 - Ponedeljak
    // 366 - Greska! Uneli ste broj van granice
    
  }

}
