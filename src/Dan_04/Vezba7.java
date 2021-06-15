package Dan_04;

import java.util.Scanner;

public class Vezba7
{

  public static void main(String[] args)
  {
    //   Napisati program koji ucitava N broja od korisnika
    //  i ispisuje koliko je pozitivnih brojeva uneo.
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Unesite koliko zelite brojeva da unesete: ");
    int N = s.nextInt();
    int i;
    int broj;
    int suma = 0;
    
    for (i = 0; i < N; i++)
    {
      System.out.println("Unesite " + (i+1) +". broj: ");
      broj = s.nextInt();
      
      if(broj > 0)
      {
        suma = suma + 1;
      }
      
    }
    
    System.out.println("Suma unetih brojeva je " + suma);
    
    s.close();

  }

}
