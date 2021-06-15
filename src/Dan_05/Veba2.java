package Dan_05;

import java.util.Scanner;

public class Veba2
{

  public static void main(String[] args)
  {
//  Napisati program koji sabira brojeve od korisnika sve dok
//  korisnik ne unese dva ista broja zaredom. Smatrati da korisnik unosi
//  brojeve vece od nule.
//  Primer:
//  Unesite broj: 1
//  Unesite broj: 3
//  Unesite broj: 5
//  Unesite broj: 7
//  Unesite broj: 2
//  Unesite broj: 2
//  Suma je 20

    Scanner s = new Scanner(System.in);

    System.out.println("Unesi broj: ");
    int broj2 = s.nextInt();
    int broj1 = 0;
    int suma = 0;
    
    while (broj1 != broj2)
    {
      broj1 = broj2;
      suma = suma + broj2;
      System.out.println("Unesi broj: ");
      broj2 = s.nextInt();
            
    }
    
    
    System.out.println("Suma je " + suma);
//    
//    if (broj < 0)
//    {
//      System.out.println("Unesi broj veci od 0.");
//    }
//    else if ()
//    {
//      
//    }

  }

}
