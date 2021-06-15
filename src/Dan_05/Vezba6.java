package Dan_05;

public class Vezba6
{

  public static void main(String[] args)
  {
    // u ovom nizu brojeva ispisite koji je najmanji broj
    
    int[] nizBrojeva = {3, 34, 8, 1, 5 , 67};
    //int zbir = 0;
    int b = nizBrojeva[0];
    
    for (int i = 1; i < nizBrojeva.length; i++)
    {
      if (nizBrojeva[i] < b)
      {
       b = nizBrojeva[i];
      }
    }
    System.out.println("Najmanji elemenata je " + b);
    
//    for (int i = 0; i < nizBrojeva.length; i++)
//    {
//      zbir = zbir + nizBrojeva[i];
//    }
//    System.out.println("Zbir elemenata je " + zbir);

  }

}
