package Dan_03;

public class WhilePetlja
{

  public static void main(String[] args)
  {
    int i = 1;
    //int n = 1;
    int zbir = 0;
    
    while (i < 15)
    {
      zbir = zbir + i;
      System.out.println("i je " + i + ", a trenutni zbir je " + zbir);
      //System.out.println("Usao sam u petlju " + n + ". put, a vrednost i je " + i);
      i++;
      //n++;
    }
    
    System.out.println("Kraj programa");

  }

}
