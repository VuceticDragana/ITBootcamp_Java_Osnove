package Dan_04;

import java.util.Scanner;

public class Vezba6
{

  public static void main(String[] args)
  {
    //   Napisati program koji sabira N brojeva.
//  Korisnik unosi N i unosi brojeve.
//  Primer:
//  Unesite koliko brojeva zelimo da saberemo: 5
//  Unesite 1. broj: 1
//  Unesite 2. broj: 3
//  Unesite 3. broj: 4
//  Unesite 4. broj: 2
//  Unesite 5. broj: 6
//  Suma unetih brojeva je 16
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Unesite koliko brojeva zelimo da saberemo: ");
    int N = s.nextInt();
    
    int i;
    int suma = 0;
    
    for (i = 0; i < N; i++)
    {      
        System.out.println("Unesite " + (i+1) +". broj: ");
        suma = suma + s.nextInt();
    }
    System.out.println("Suma unetih brojeva je " + suma);
    
    s.close();

  }

}
