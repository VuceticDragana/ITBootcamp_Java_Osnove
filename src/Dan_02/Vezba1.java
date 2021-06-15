package Dan_02;

import java.util.Scanner;

public class Vezba1
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner (System.in);
    
    System.out.println("Unesi prvi boolean: ");
    boolean prviboolean = s.nextBoolean();
    System.out.println("Prvi uneti boolean je " + prviboolean);
    
//    System.out.println("Unesi prvi float broj: ");
//    float prviFloatBroj = s.nextFloat();
//    System.out.println("Prvi uneti float broj je " + prviFloatBroj);
    
//    System.out.println("Unesi prvi string je: ");
//    String prviString = s.nextLine();
//    System.out.println("Prvi uneti string je " + prviString);
//    
//    System.out.println("Unesi prvi decimalni broj: ");
//    double decimalniBroj = s.nextDouble();
//    System.out.println("Prvi decimalni broj koji ste uneli je " + decimalniBroj);
    
//    System.out.println("Unesi prvi broj: ");
//    int prviBroj = s.nextInt();
//    System.out.println("1. Broj koji ste uneli je " + prviBroj);
//    
//    System.out.println("Unesi drugi broj: ");
//    int drugiBroj = s.nextInt();
//    System.out.println("2. Broj koji ste uneli je " + drugiBroj);
//    
//    System.out.println("Zbir unetih brojeva iznosi " + (prviBroj + drugiBroj));
    
    s.close();
  }

}
