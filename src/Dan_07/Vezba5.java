package Dan_07;

public class Vezba5
{

  public static void main(String[] args)
  {
 // definisati niz 5 imena
    // definisati niz 5 prezimena
    // definisati niz 5 fakulteta
    // definisati niz 5 proseka
    // definisati niz 5 godina
    //napraviti funkciju koja stampa
    // Ime i Prezime je zavrsio/la fakulte ima fakulteta
    //sa prosecnom pocenom prosecna ocena a rodjen je godina
    //funkciju pozvati 5 puta (iteracijama)
    
    for(int i = 0; i < 5; i++)
    {
      prikazPodatakaStudenata(i);
    }

  }
  
  public static void prikazPodatakaStudenata(int index)
  {
    String[] nizImena = { "Pera", "Zika", "Mika", "Djura", "Ceda" };
    String[] nizPrezimena = { "Peric", "Zikic", "Mikic", "Djuric", "Cedic" };
    String[] nizFakulteta = { "Pravni", "FTN", "PMF", "DIF", "Poljoprivredni" };
    double[] nizProseka = { 6.5, 8.7, 7.9, 9.5, 6.9 };
    int[] nizGodina = { 20, 22, 19, 23, 24 };
    
    System.out.printf("Ime: %s\nPrezime: %s\nFakultet: %s\nProsek: %.1f\nGodina: %d\n\n",
        nizImena[index], nizPrezimena[index], nizFakulteta[index], nizProseka[index], nizGodina[index]);
  }

}
