package Dan_04;

public class Vezba5
{

  public static void main(String[] args)
  {
//  Napisati program koji stampa sve parne
//  brojeve u opsegu od 3 do 33

    int i;
    int j = 1;
    for (i = 3; i <= 33; i++)
    {
      if (i % 2 == 0)
      {
        System.out.println(j + ". parni broje je " + i);
        j++;
      }

    }
  }
}
