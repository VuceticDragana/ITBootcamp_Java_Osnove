package Dan_02;

import java.util.Scanner;

public class Vezba6
{

  public static void main(String[] args)
  {
    // unesite broj sa tastature, a program treba da ispise da li je broj jednocifren, dvocifren, cetvorocifren i veci

    Scanner s = new Scanner(System.in);
    
    System.out.println("Unesi jedan ceo broj: ");
    int broj = s.nextInt();
    broj = Math.abs(broj);
    
    if (broj < 10)
    {
      System.out.println("Broj je jednosifren");
    }
    else if (broj < 100)
    {
      System.out.println("Broj je dvocifren");
    }
    else if (broj < 1000)
    {
      System.out.println("Broj je trocifren");
    }
    else 
    {
      System.out.println("Broj je cetvorocifren i vece");
    }
    
    s.close();
  }

}
