package Domaci;

public class Zadatak1
{

  public static void main(String[] args)
  {
    // Ispisite podatke o nekom glumcu i glumici tako sto cete 
    // ime i prezime prikazati kao dve promenljive, pol kao karakter, 
    // godine kao integer, vasa ocena njih od 1 do 10 i da li je iz 
    // Srbije odgovorite preko booleana.
    // Zakomentarisite u eclipse jedan film u kom se pojavljuju.
    
    
    // Glumac iz filma "Pirates of the Caribbean"
    
    String imeGlumca = "Johnny";
    String prezimeGlumca = "Depp";
    char PolGlumca = 'M';
    int godinaGlumac = 57;
    double ocenaGlumac = 10.0;
    boolean izSrbije1 = false;
    
    System.out.printf("Ime glumca: %s\nPrezime glumca: %s\nPol: %s\nGodine starosti: %d\nMoja ocena: %.1f\nDa li je iz Srbije: %s\n", 
        imeGlumca, prezimeGlumca, PolGlumca, godinaGlumac, ocenaGlumac, izSrbije1);
    
    
    // Glumica iz filma "Scary Movie"
    
    String imeGlumice = "Anna";
    String prezimeGlumice = "Faris";
    char PolGlumice = 'F';
    int godinaGlumica = 44;
    double ocenaGlumica = 10.0;
    boolean izSrbije2 = false;
    
    System.out.printf("\nIme glumice: %s\nPrezime glumice: %s\nPol: %s\nGodine starosti: %d\nMoja ocena: %.1f\nDa li je iz Srbije: %s\n", 
        imeGlumice, prezimeGlumice, PolGlumice, godinaGlumica, ocenaGlumica, izSrbije2);

  }

}
