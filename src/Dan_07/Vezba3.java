package Dan_07;

public class Vezba3
{

  public static void main(String[] args)
  {
//  Napisti funkciju koja za broj n,
//  vraca poslednju cifru.
//  Primer:
//  Ako se prosledi n=3290329, ona vrati 9
    
  //bonus zadatak: funkcija koja vraca pretposlednji broj

    int n = 3290395;
    System.out.println(poslednjaCifra(n));
    System.out.println(predposlednja(n));
    
  }
  
  public static int poslednjaCifra(int broj)
  {
    int ostatak;
    ostatak = broj % 10;
    return ostatak;
  }
  
  public static int predposlednja(int broj)
  {
    int ostatak;
    ostatak = broj % 100 / 10;    
    return ostatak;
  }

}
