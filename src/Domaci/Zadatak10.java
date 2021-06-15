package Domaci;

import java.util.Scanner;

public class Zadatak10
{

  public static void main(String[] args)
  {
    // Napisati program gde korisnik unese datum rodjenja i program vrati koji je to
    // horoskopski znak
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Unesi dan rodjenja od: ");
    int dan = s.nextInt();
    
    System.out.println("Unesi mesec rodjenja: ");
    int mesec = s.nextInt()-1;
    
    s.close();
    
    if(mesec < 0 || mesec >= 12)
    {
      System.out.println("Nije unet dobar mesec.");
      return;
    }
    
    int[] granicniDan = {21, 20, 21, 21, 22, 22, 23, 23, 23, 24, 23, 22};
    
    int[] maxDan = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    String[] znakPocetak = {"Jarac", "Vodolija", "Ribe", "Ovan", "Bik", "Blizanci",
        "Rak", "Lav", "Devica", "Vaga", "Skorpija", "Strelac"};
    
    String[] znakKraj = {"Vodolija", "Ribe", "Ovan", "Bik", "Blizanci",
        "Rak", "Lav", "Devica", "Vaga", "Skorpija", "Strelac", "Jarac"};
    
    
      if(dan > 0 && dan < granicniDan[mesec])
      {
        System.out.println("Vas znak je " + znakPocetak[mesec]);
      }
      else if (dan >= granicniDan[mesec] && dan <= maxDan[mesec])
      {
        System.out.println("Vas znak je " + znakKraj[mesec]);
      }
      else
      {
        System.out.println("Nije unet dobar dan");
      }        
      
      
      // Sajt za proveru https://www.astro-tarot.rs/horoskopski-znaci-po-datumima/
      
      // Testovi
      // Dan = 21, Mesec = 6, Ocekivano: Blizanci, Rezultat: Blizanci.
      // Dan = 22, Mesec = 6, Ocekivano: Rak, Rezultat: Rak.
      // Dan = 0,  Mesec = 5, Ocekivano: Nije unet dobar dan, Rezultat: Nije unet dobar dan
      // Dan = 10, Mesec = 0, Ocekivano: Nije unet dobar mesec, Rezultat: Nije unet dobar mesec

  }

}
