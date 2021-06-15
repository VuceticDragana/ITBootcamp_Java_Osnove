package Vezbanje;

public class Vezba7
{

  public static void main(String[] args)
  {
    //  Napisti funkciju koja za broj n,
    //  vraca poslednju cifru.
    //  Primer:
    //  Ako se prosledi n=3290329, ona vrati 9
    
    //bonus zadatak: funkcija koja vraca pretposlednji broj

    int n = 3290329;
    
    int rezultat = zadnjiBroj(n);    
    System.out.println("Poslednja cifra je " + rezultat);
    
    int rezultat2 = predzadnjiBroj(n);    
    System.out.println("Predposlednja cifra je " + rezultat2);
    
  }
  
  public static int zadnjiBroj(int n)
  {
    int rezultat;
    rezultat = n % 10;
    
    return rezultat;
  }
  
  public static int predzadnjiBroj(int n)
  {
    int rezultat;
    rezultat = n % 100 / 10;
    
    return rezultat;
  }
  
  

}
