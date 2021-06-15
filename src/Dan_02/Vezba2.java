package Dan_02;

import java.util.Scanner;

public class Vezba2
{

  public static void main(String[] args)
  {
//  Napisati program koji ucitava vrednosti a i b
//  sa tastature i pronalazi njihovu srednju vrednosti
//  I na kraju ispistuje tu vrednost.
    
    Scanner s = new Scanner (System.in);
    
    System.out.println("Uneti vrednost a: ");
    int a = s.nextInt();
    System.out.println("Uneti vrednost b: ");
    int b = s.nextInt();
    
//    System.out.println("Uneti vrednost a: ");
//    double a = s.nextDouble();
//    System.out.println("Uneti vrednost b: ");
//    double b = s.nextDouble();
    
    System.out.println("Srednja vrednost a i b je: " + (a + b) / 2.0);
    
    s.close();

  }

}
