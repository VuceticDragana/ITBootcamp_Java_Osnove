package Domaci;

import java.util.Scanner;

public class Zadatak5
{

  public static void main(String[] args)
  {
    // Napisati program koji od korisnika trazi unos broja dana u jednom mesecu i da
    // za
    // rezultat ispise koliko meseci u godini ima toliko dana.
    // Primer. korisnik unese 31 a program vrati rezultat "7 meseci u godini ima 31
    // dan"

    Scanner s = new Scanner(System.in);

    System.out.println("Uneti broj dana: ");
    int brojDana = s.nextInt();

    if (brojDana < 1 || brojDana > 31)
    {
      System.out.println("Unos nije validan.");
    }
    else
    {
      switch (brojDana)
      {
      case 29:
      {
        System.out.println("11 meseci ima toliko dana, a 12 svake prestupne godine.");
        break;
      }
      case 30:
      {
        System.out.println("4 meseci ima toliko dana.");
        break;
      }
      case 31:
      {
        System.out.println("7 meseci ima toliko dana.");
        break;
      }
      default:
      {
        System.out.println("12 meseci ima toliko dana.");
        break;
      }
    }

    s.close();

    // Testiranje: Uneta vrednost - dobijena poruka
    // 0 - Unos nije validan.
    // 1 - 12 meseci ima toliko dana.
    // 27 - 12 meseci ima toliko dana.
    // 28 - 12 meseci ima toliko dana.
    // 29 - 11 meseci ima toliko dana, a 12 svake prestupne godine
    // 30 - 4 meseci ima toliko dana.
    // 31 - 7 meseci ima toliko dana.
    // 32 - Unos nije validan.

  }
  }
}
