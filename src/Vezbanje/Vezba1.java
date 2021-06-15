package Vezbanje;

import java.util.Scanner;

public class Vezba1
{

  public static void main(String[] args)
  {
    // Sabrati sve cele brojeve u rasponu koji korisnik unese
    // ukljucujuci i unete brojeve
    // npr: od 2 do 5. 2+3+4+5
    
    System.out.println("Program sabira sve brojeve izmedju unetih, ukljucujuci i njih\n");
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Unesi prvi broj: ");
    int broj1 = s.nextInt();
    
    System.out.print("Unesi drugi broj: ");
    int broj2 = s.nextInt();
    
    s.close();
    
    if(broj1 > broj2)
    {
      System.out.println("\nBrojevi su zamenjeni, jer prvi ne moze da bude veci od drugog.");
      
      int temp;
      temp = broj1;
      broj1 = broj2;
      broj2 = temp;
    }
    
    int i;
    int suma = 0;
    
    for(i = broj1; i <= broj2; i++)
    {
      suma = suma + i;
    }
    
    System.out.printf("\nSuma brojeva u rasponu od %d do %d iznosi %d", broj1, broj2, suma);

  }

}
