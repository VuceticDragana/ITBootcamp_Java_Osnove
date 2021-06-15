package Dan_02;

import java.util.Scanner;

public class Vezba7
{
  public static void main(String[] args)
  {
    // uneti broj sa tastaturi i videti da li je broj paran ili neparan
//    int a = 5;
//    int b = 3;
//    
//    System.out.println("Ostatak pri deljenju gbrojeva " + a + " i " + b + " je " + a%b);

    Scanner s = new Scanner(System.in);

    System.out.println("Unesi jedan ceo broj: ");
    int broj = s.nextInt();
    broj = broj % 2;

    if (broj  == 0)
    {
      System.out.println("Broj je paran");
    }
    else
    {
      System.out.println("Broj je neparan");
    }    
    
   s.close();
  }
}
