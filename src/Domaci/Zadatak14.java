package Domaci;

import java.util.Scanner;

public class Zadatak14
{

  public static void main(String[] args)
  {
    // Napisati funkciju koja za parametre prima tri broja num1, num2 i num3 i
    // proverava da li je zbir num1 i num2 jednak num3.
    // Primer:
    // Ako se unese num1 = 2, num2 = 4, i num3 = 99 vraca false
    // Ako se unese num1 = 2, num2 = 4, i num3 = 6 vraca true

    Scanner s = new Scanner(System.in);
    
    System.out.print("Unesi 1. broj: ");
    int num1 = s.nextInt();
    
    System.out.print("Unesi 2. broj: ");
    int num2 = s.nextInt();
    
    System.out.print("Unesi 3. broj: ");
    int num3 = s.nextInt();
    
    s.close();
    
    if(proveraZbira(num1, num2, num3))
    {
      System.out.println("Vrednost zbira num1 i num2 JESTE ista kao num3.");
    }
    else
    {
      System.out.println("Vrednost zbira num1 i num2 NIJE ista kao num3.");
    }
    
  }
  
  public static boolean proveraZbira(int num1, int num2, int num3)
  {
    boolean vrednost = true;
    
    if(num1 + num2 != num3)
    {
      vrednost = false;
    }    
    return vrednost;
  }

  // Test
  
  // Brojevi: 
  // num1 = 1; num2 = 2; num3 = 3;
  // Rezultat:
  // Vrednost zbira num1 i num2 JESTE ista kao num3.
  
  //Brojevi: 
  // num1 = 4; num2 = 5; num3 = 6;
  // Rezultat:
  // Vrednost zbira num1 i num2 NIJE ista kao num3.
}
