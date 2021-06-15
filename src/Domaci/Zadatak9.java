package Domaci;

public class Zadatak9
{

  public static void main(String[] args)
  {
    // Napisati niz brojeva i prikazati aritmeticku sredinu niza
    
    //int[] nizBrojeva = {5, 2, 10, 23, 34};
    int[] nizBrojeva = {-10, -2, -5, -21, -35};
    int i;
    double suma = 0;
    double prosek;
    
    for (i = 0; i < nizBrojeva.length; i++)
    {
      suma = suma + nizBrojeva[i];
    }
    
    prosek = suma / nizBrojeva.length;
    
    System.out.println("Aritmetiska sredina niza iznosi " + prosek);
  }

  // Test1
  // Niz brojeva: {5, 2, 10, 23, 34}
  // Ocekivano je 14.8 izracunato kalkulatorom
  // Dobijeno je 14.8
  
  // Test2
  // Niz brojeva: {} - prazan niz
  // Ocekivano je 0
  // Dobijeno je NaN
  
}
