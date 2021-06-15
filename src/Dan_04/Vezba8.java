package Dan_04;

import java.util.Scanner;

public class Vezba8
{

  public static void main(String[] args)
  {
//  Napisati program koji ucitava N brojeva
//  od korisnika i proverava da li se u
//  unetim brojevima nalazi broj K
//  (K takodje unosi korisnik)
//  Kad korisnik unese broj K program ispise "Zeljeni broj je pronadjen"
//  ako se ne nadje zeljeni broj ispise se poruka da "Zeljeni broj nije pronadjen"

    Scanner s = new Scanner(System.in);

    System.out.println("Unesite koliko zelite brojeva da unesete: ");
    int N = s.nextInt();

    System.out.println("Unesite zeljeni broj: ");
    int K = s.nextInt();    

    int i;
    int broj;
    int k = 0;

    for (i = 0; i < N; i++)
    {
      System.out.println("Unesite " + (i + 1) + ". broj: ");
      broj = s.nextInt();

      if (K == broj)
      {
        k++;
        break;
      }
    }

    if (k == 0)
    {
      System.out.println("Zeljeni broj nije pronadjen");
    }
    else
    {
      System.out.println("Zeljeni broj je pronadjen");
    }

  }

}
