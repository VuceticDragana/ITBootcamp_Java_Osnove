package Vezbanje;

public class Vezba4
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
    
    int[] niz = {9,11,15,23,25,43,78,87,92,3};
    
    //int[] rezultat = vracaDeljivoSaTri(niz);
    //int[] rezultat = asdf(niz);
    //int rezultat = zbirNiza3(niz);
    int[] rezultat = nizOstataka(niz);
    
    //System.out.println(rezultat);
    
    for(int i = 0; i < rezultat.length; i++)
    {
      System.out.println(rezultat[i]);
    }

  }
  
  public static int[] vracaDeljivoSaTri (int[] niz)
  {
    int j = 0;    
    
    for(int i = 0; i < niz.length; i++)
    {
      if(niz[i] % 3 == 0)
      {
        j = j + 1;
      }
    }
    
    int[] niz2 = new int[j];
    int k = 0;
    
    for(int i = 0; i < niz.length; i++)
    {
      if(niz[i] % 3 == 0)
      {
        niz2[k] = niz[i];
        k = k + 1;
      }
    }
    return niz2;
  }
  
  public static int[] asdf (int[] niz)
  {
    int[] niz2 = new int[niz.length];
    
    for(int i = 0; i < niz.length; i++)
    {
      niz2[niz2.length - i-1] = niz[i];
    }    
    return niz2;
  }
  
  public static int zbirNiza (int[] niz)
  {
    int zbir = 0;
    
    for(int i = 0; i < niz.length; i++)
    {
      zbir = zbir + niz[i];
    }    
    return zbir;
  }
  
  public static int zbirNiza3 (int[] niz)
  {
    int zbir = 0;
    
    for(int i = 0; i < niz.length; i++)
    {
      int ostatak;
      ostatak = niz[i] % 3;
      zbir = zbir + ostatak;
//      if(niz[i] % 3 == 0)
//      {
//      zbir = zbir + niz[i];
//      }
    }    
    return zbir;
  }
  
  public static int[] nizOstataka (int[] niz)
  {
    int[] ostatci = new int[niz.length];
    
    for(int i = 0; i < niz.length; i++)
    {
      ostatci[i] = niz[i] % 3;
    }
    return ostatci;
  }
}
