package Vezbanje;

public class Vezba5
{

  public static void main(String[] args)
  {
    // 1. Napisati funkciju koja ce da spoji 2 niza.
    // Nizove spojiti jedan posle drugog.

    // 2. Napraviti kopiju niza sa pomeranjem elementa niza za 1 udesno, a zadnji
    // postaje prvi.

    // 3. Spojiti rezultate prva 2 zadatka.

    // 4. Napisati funkciju koja vraca kopiju niza. Svi parni brojevi su zamenjeni
    // nulom.

    // 5. Popraviti zadatak 2 da radi sa jednim i nula elemenata.

    // 6. Napisati funkciju koja stampa niz u jednom redu sa enterom na kraju i
    // zarez koristiti za odvajanje elemenata.

    int[] niz1 = { 1, 2, 3, 4 };
    int[] niz2 = { 5, 6, 7, 8 };
    int[] niz3 = {};

    // 1.
    int[] rezultat = spajanjeNizova(niz1, niz2);
    stampaj(rezultat);

    // 2.
    int[] rezultat2 = pomeranje(rezultat);
    stampaj(rezultat2);

    // 3.
    int[] spojenRezultat = spajanjeNizova(rezultat, rezultat2);
    stampaj(spojenRezultat);

    // 4.
    int[] parni = parniNiz(spojenRezultat);
    stampaj(parni);   

    // 5.
    int[] elementi = pomeranje(niz3);
    stampaj(elementi);

  }

  public static int[] spajanjeNizova(int[] niz1, int[] niz2)
  {
    int[] niz3 = new int[niz1.length + niz2.length];

    for (int i = 0; i < niz1.length; i++)
    {
      niz3[i] = niz1[i];
    }

    for (int i = 0; i < niz2.length; i++)
    {
      niz3[i + niz1.length] = niz2[i];
    }

    return niz3;
  }

  public static int[] pomeranje(int[] niz1)
  {
    int[] niz4 = new int[niz1.length];

    if (niz1.length > 0)
    {
      for (int i = 0; i < niz1.length - 1; i++)
      {
        niz4[i + 1] = niz1[i];
      }
      niz4[0] = niz1[niz1.length - 1];
    }

    return niz4;
  }

  public static int[] parniNiz(int[] niz1)
  {
    int[] niz5 = new int[niz1.length];

    for (int i = 0; i < niz1.length; i++)
    {
      if (niz1[i] % 2 == 0)
      {
        niz5[i] = 0;
      }
      else
      {
        niz5[i] = niz1[i];
      }
    }
    return niz5;
  }

  public static void stampaj(int[] niz1)
  {
    if (niz1.length > 0)
    {
      for (int i = 0; i < niz1.length - 1; i++)
      {
        System.out.print(niz1[i] + ", ");
      }
      System.out.println(niz1[niz1.length - 1]);
    }
  }
}
