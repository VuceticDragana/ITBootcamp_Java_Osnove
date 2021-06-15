package Dan_05;

public class Vezba7
{

  public static void main(String[] args)
  {
//  Napisati program koji svaki element niza
//  povecava za vrednost pozicije na kojoj se
//  element nalazi. Vrednosti i broj elemenata niza su proizvoljni
//  Primer izvrsenja:
//  niz = {1, 5, 7, -1, 4}
//  Nakon izvrsenja programa:
//  niz = {1, 6, 9, 2, 8}
//  Kako je ovaj niz dobijen?
//  niz = {1+0, 5+1, 6+2, -1+3, 4+4}
    
    int[] nizBrojeva = {1, 5, 7, -1, 4};
    
    for(int i = 0; i < nizBrojeva.length; i++)
    {
      System.out.print(nizBrojeva[i] + ", ");
    }
    
    System.out.println("\n");
    for(int i = 0; i < nizBrojeva.length; i++)
    {      
      System.out.print(nizBrojeva[i] + i + ", ");
    }

  }

}
