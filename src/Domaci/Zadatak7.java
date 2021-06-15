package Domaci;

import java.util.Scanner;

public class Zadatak7
{

  public static void main(String[] args)
  {
    // Napisati program koji unosi i sabira brojeve dokle god nije unesen 
    // negativan broj, ispisuje njihov zbir (zbir pozitivnih brojeva).
    // primer: ako korisnik unese 1 2 5 3 -1, program treba da ispise 11
    
    Scanner s = new Scanner(System.in);    

    int broj;
    int suma = 0;
    
    do
    {
      System.out.println("Unesi broj: ");
      broj = s.nextInt();
      
      if (broj > 0)
      {      
      suma = suma + broj;
      }
    }
    while(broj >= 0);
    
    System.out.println("Zbir pozitivnih brojeva je " + suma);
    
    s.close();
    
    // Test1
    // Uneto: 1, 2, -1
    // Rezultat: 3
    
    // Test2
    // Uneto: -10
    // Rezultat: 0

  }

}
