package Dan_05;

public class Vezba5
{

  public static void main(String[] args)
  {
    // dane u nedelji stavite u niz, a zatim ih sve ispisite
    
//    String[] daniUNedelji = new String[7];
    
//    daniUNedelji[0] = "Ponedeljak";
//    daniUNedelji[1] = "Utorak";
//    daniUNedelji[2] = "Sreda";
//    daniUNedelji[3] = "Cetvrtak";
//    daniUNedelji[4] = "Petak";
//    daniUNedelji[5] = "Subota";
//    daniUNedelji[6] = "Nedelja";
    
    String[] daniUNedelji = {"Ponedeljak", "Utorak", "Sreda", "Cetvrtak", "Petak", "Subota", "Nedelja"};
    
    for(int i = 0; i < daniUNedelji.length; i++)
    {
      System.out.println(daniUNedelji[i]);
    }

  }

}
