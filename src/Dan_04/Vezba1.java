package Dan_04;

public class Vezba1
{

  public static void main(String[] args)
  {
    int i = 5;
    
    /*while (i > 2)
    {
      System.out.println("Usao sam u petlju");
      i--;
    }*/
    
    do
    {
      i--;
      System.out.println("Usao sam u do while petlju, trenutna vrednos i je " + i);      
    }
    while(i < 3);
    
    System.out.println("Kraj programa");

  }

}
