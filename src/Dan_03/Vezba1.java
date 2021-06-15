package Dan_03;

import java.util.Scanner;

public class Vezba1
{

  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Unesi broj od 1 do 7: ");
    int broj = s.nextInt();
    
    if (broj > 0 && broj < 6)
    {
      System.out.println("Radni dan");
    }
    else if (broj >= 6 && broj <= 7)
    {
      System.out.println("Vikend");
    }
    else 
    {
      System.out.println("Uneli ste pogresan broj");
    }
    
    s.close();

  }

}
