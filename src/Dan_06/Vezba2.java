package Dan_06;

public class Vezba2
{

  public static void main(String[] args)
  {
    // 1. napisati funkciju koja stampa podatke o osobi. salju joj se ime, prezime i
    // br
    // godina, a funkcija to odstampa

    // 2. Napisati funkciju koja prima broj i vraca text da li je broj pozitivan
    // negativan ili nula. Resenje ispisati iz main metode

    Osoba("Dragana", "Vucetic", 35);    
    
    System.out.println(brojevi(0));
  }

  public static void Osoba(String ime, String prezime, int godine)
  {
    System.out.printf("Ime: %s\nPrezime: %s\nGodina: %d\n", ime, prezime, godine);
  }
  
  public static String brojevi (int broj)
  {
    if (broj > 0)
    {
      return "Broj je pozitivan";
    }
    else if (broj < 0)
    {
      return "Broj je negativan";
    }
    else
    {
      return "Broj je nula";
    }
    
  }

}
