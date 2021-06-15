package Dan_07;

public class Vezba1
{

  public static void main(String[] args)
  {
    // Napisati funkciju koja od dva ulazna Stringa
//  formira rezultujuci string.
//  Parametri funkcije su
//  firstStr, secondStr i swap(boolean)
//  Ako se unesu vrednosti:
//  firstStr = "xxx"
//  secondStr = "zzz"
//  swap = false
//  Vraca string:
//  "xxxzzz"
//
//  Ako se unesu vrednosti:
//  firstStr = "xxx"
//  secondStr = "zzz"
//  swap = true
//  Vraca string:
//  "zzzxxx"
    
    String firstStr = "xxx";
    String secondStr = "zzz";
    
    //System.out.println(stringovi(firstStr, secondStr, true));
    System.out.println(stringovi(firstStr, secondStr, false));

  }
  
  public static String stringovi(String firstStr, String secondStr, boolean swap)
  {
    if (swap)
    {
      return secondStr + firstStr;
    }
    else
    {
      return firstStr + secondStr;
    }
  }

}
