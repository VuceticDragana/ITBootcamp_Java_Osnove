package Dan_04;

public class Vezba4
{

  public static void main(String[] args)
  {
//  Napisati program koji stampa sve brojeve
//  od 25 do 15 pomocu for petlje

    int i = 0;

//    for (i = 25; i >= 15; i--)
//    {
//      System.out.println("i je " + i);
//    }
    
    int j = 1;
    for (i = 0; i <= 76; i++)
    {
      if(i % 10 == 0 && i != 0)
      {
        System.out.println(j + ". Broj koji je deljiv sa 10 je " + i);
        j++;
      }
      
    }

  }

}
