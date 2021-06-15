package Dan_05;


public class Vezba4
{

  public static void main(String[] args)
  {
    String[] nizBoja = new String[4];
    
    nizBoja[0] = "zuta";
    nizBoja[1] = "zelena";
    nizBoja[2] = "plava";
    nizBoja[3] = "crvena";
    
    int duzinaNiza = nizBoja.length;
    System.out.println("Niz sadrzi " + duzinaNiza + " elemenata.");
    
    for (int i = 0; i < nizBoja.length; i++)
    {
      System.out.println((i+1) + ". element niza je " + nizBoja[i]);
    }
    
    
    

  }

}
