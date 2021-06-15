package Vezbanje;

import java.util.Scanner;

public class Vezba2
{

  public static void main(String[] args)
  {
    // Izracunaj vrednost Fibonacijevog niza sa indexom n. n broj unosi korisnik.
    // Pocetni index niza je 0.
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Unesi index Fibonacijevog broja u nizu: ");
    int n = s.nextInt();
    
    s.close();
    
    if(n < 2)
    {
      System.out.println("Index mora da da bude minimum 2.");
      return;
    }
    
    int a = 0;
    int b = 0;
    int c = 1;
    
    for(int i = 0; i < n-1; i++)
    {
    a = b;
    b = c;
    
    c = a + b;
    }
    System.out.printf("Vrednost Fibonacijevog niza sa indexom %d je %d.", n, c);
    
    
    

  }

}
