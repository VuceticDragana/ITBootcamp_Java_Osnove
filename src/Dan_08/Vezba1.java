package Dan_08;

public class Vezba1
{

  public static void main(String[] args)
  {
    // Napraviti niz od 10 brojeva
    // Napraviti petlju koja ce ispisati elemete niza koji su deljivi sa 3

    // Primer niza: {9,11,15,23,25,43,78,87,92,3}
    // Primer ispisa resenja:
    // Elementiu niza koji su deljivi sa 3 su:
    // 9
    // 15
    // 78
    // 87
    // 3

    // bonus zadatak, napravite funkciju koja prima niz, a vraca niz koji
    // sacinjavaju samo element prosledjenog niza koji su deljivi sa 3

    int[] niz = { 9, 11, 15, 23, 25, 43, 78, 87, 92, 3 };

    System.out.println("Elementiu niza koji su deljivi sa 3 su:");

//    for (int i = 0; i < niz.length; i++)
//    {
//      if (niz[i] % 3 == 0)
//      {
//        System.out.println(niz[i]);
//      }
//    }
    int[] noviNiz = deljivoSa3(niz);
    for (int i = 0; i < noviNiz.length; i++)
    {
      System.out.println(noviNiz[i]);
    }
  }

  // prvo prebrojati koliko ima deljivih sa 3, pa napraviti niz te duzine.
  // pa onda prebaciti brojeve iz prvog niza u drugi
  public static int[] deljivoSa3(int[] niz)
  {
    int[] niz2 = new int[niz.length];
    int j = 0;
    for (int i = 0; i < niz.length; i++)
    {
      if (niz[i] % 3 == 0)
      {
        niz2[j] = niz[i];
        j = j + 1;
      }
    }
    
    int[] niz3 = new int[j];
    for (int i = 0; i < j; i++)
    {
      niz3[i] = niz2[i];
    }
    
    return niz3;
  }

}
