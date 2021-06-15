package Domaci;

import java.util.Scanner;

public class Zadatak6
{

  public static void main(String[] args)
  {
    // Napisati program koji od korisnika trazi da unese dan u celoj godini a da za
    // rezultat dobije kojoj nedelja pripada taj dan u godini.
    // Primer. korisnik unese 75 a program kao rezultat vrati "11. nedelja u godini"
    // Napomena: Racunajte da je prvi dan u godini ponedeljak.

    Scanner s = new Scanner(System.in);

    System.out.println("Uneti broj dana: ");
    int brojDana = s.nextInt();

    int i = 7;

    if (brojDana < 1 || brojDana > 366)
    {
      System.out.println("Pogresan broj dana. Unesite broj od 1 do 366.");
    }
    else
    {
      while (i < brojDana)
      {
        i = i + 7;
      }
      System.out.println( i / 7 + ". nedelja u godini.");
    }    

    s.close();
    
    // Testiranje: Uneta vrednost - dobijena poruka
    // 0 - Pogresan broj dana. Unesite broj od 1 do 366.
    // 1 - 1. nedelja u godini
    // 75 - 11. nedelja u godini
    // 366 - 53. nedelja u godini
    // 367 - Pogresan broj dana. Unesite broj od 1 do 366.
    
  }

}
