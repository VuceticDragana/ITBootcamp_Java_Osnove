package Dan_01;

public class Vezba3
{

  public static void main(String[] args)
  {
//  Napisati program koji
//  cuva podatke o korisniku(Ime, Prezime, Email, godinuRodjenja, 
//  fakultet, prosecnu ocenu, omiljeno slovo i informaciju da li voli programiranje),
//  i stampa podatke u formatu
//  Ime: Milan
//  Prezime: Jovanovic
//  Email: milan@gmail.com
//  godina rodjenja: 1988
//  fakultet: Ekonomski
//  prosecna ocena: 8.57
//  omiljeno slovo: V
//  da li voli programiranje: TRUE

    String ime = "Milan";
    String prezime = "Jovanovic";
    String email = "milan@gmail.com";
    String godinaRodjenja = "1988";
    String fakultet = "Ekonomski";
    double prosecnaOcena = 8.57;
    char omiljenoSlovo ='V';
    boolean voliProgramiranje = true;
    
    System.out.printf("Ime: %s\nPrezime: %s\nEmail: %s\nGodina rodjenja: %s\nFakultet: %s\nProsecna ocena: %.2f\nOmiljeno slovo: %s\nDa li voli programiranje: %s", 
        ime, prezime, email, godinaRodjenja, fakultet, prosecnaOcena, omiljenoSlovo, voliProgramiranje);
  }

}
