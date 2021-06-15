package Vezbanje;

public class Vezba6
{

  public static void main(String[] args)
  {
    // napisati funkciju koja prima niz brojeva i vraca sumu svih brojeva niza

    // bonus zadatak: napisati dodatnu funkciju koja prima dva niza i vraca sumu
    // svih elemenata iz oba niza

    int[] niz = {1, 2, 3, 4, 5};
    int[] niz2 = {6, 7, 8, 9, 10};
    
    int suma = vracaSumu (niz);
    System.out.println("Suma niza je " + suma);
    
    int suma2 = vracaSumu2 (niz, niz2);
    System.out.println("Suma dva niza je " + suma2);
  }
  
  public static int vracaSumu (int[] niz)
  {
    int suma = 0;
    
    for(int i = 0; i < niz.length; i++)
    {
      suma = suma + niz[i];
    }
    return suma;
  }
  
  public static int vracaSumu2 (int[] niz, int[] niz2)
  {
    int suma = 0;
    
    for(int i = 0; i < niz.length; i++)
    {
      suma = suma + niz[i];
    }
    
    for(int i = 0; i < niz2.length; i++)
    {
      suma = suma + niz2[i];
    }
    return suma;
  }

}
