package Dan_07;

public class Vezba4
{

  public static void main(String[] args)
  {
    // napisati funkciju koja prima niz brojeva i vraca sumu svih brojeva niza

    // bonus zadatak: napisati dodatnu funkciju koja prima dva niza i vraca sumu
    // svih elemenata iz oba niza

    int[] niz = { 1, 3, 5, 7, 9, 11 };
    int[] niz2 = { 2, 4, 6, 8, 10, 12 };
    
    int suma = sumaNiza(niz);
    System.out.println("Suma niza iznosi " + suma);
    
    int ukupnaSuma = sumaDvaNiza(niz, niz2);
    System.out.println("Suma dva niza iznosi " + ukupnaSuma);
    
  }

  public static int sumaNiza(int niz[])
  {
    int suma = 0;
    for (int i = 0; i < niz.length; i++)
    {
      suma = suma + niz[i];
    }
    return suma;
  }
  
  public static int sumaDvaNiza(int niz[], int niz2[])
  {
    int suma = 0;
    for (int i = 0; i < niz.length; i++)
    {
      suma = suma + niz[i];
    }
    
    int suma2 = 0;
    for (int i = 0; i < niz2.length; i++)
    {
      suma2 = suma2 + niz2[i];
    }
    
    int ukupnaSuma;
    ukupnaSuma = suma + suma2;
    
    return ukupnaSuma;
  }

}
