package Dan_08;

import java.util.Scanner;

public class Vezba3
{

  public static void main(String[] args)
  {
  //korisnik unosi dan u nedelji, ako pogresi unos ispisite gresku
    //napisite program koji ce nam reci u kom mestu je ringispil i koje mu je radno vreme
    //ringispil radnim danima radi od 09-15h, a vikoendom od 10 do 21h
    //raspored po mestima je pon, utorak i subota: Novi Sad
    //sre i cet: Temerin
    //pet i ned: Kac
    
    //Primer resenja:
    //Molim vas unesite dan u nedelji:
    //Utorak
    //ringispil je utorkom u Novom Sadu, a radno vreme mu je 09-15h
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Molim vas unesite dan u nedelji: ");
    String dan = s.next();
    
    s.close();
    
    switch(dan)
    {
    case "Ponedeljak": System.out.printf("Ringispil je ponedeljkom u Novom Sadu, a radno vreme mu je 09-15h");
    break;
    
    case "Utorak": System.out.println("Ringispil je utorkom u Novom Sadu, a radno vreme mu je 09-15h");
    break;
    
    case "Sreda": System.out.println("Ringispil je sredom u Temerinu, a radno vreme mu je 09-15h");
    break;
    
    case "Cetvrtak": System.out.println("Ringispil je cetvrtkom u Temerinu, a radno vreme mu je 09-15h");
    break;
    
    case "Petak": System.out.println("Ringispil je petkom u Kacu, a radno vreme mu je 09-15h");
    break;
    
    case "Subota": System.out.println("Ringispil je subotom u Novom Sadu, a radno vreme mu je 10-21h");
    break;
    
    case "Nedelja": System.out.println("Ringispil je nedeljom u Kacu, a radno vreme mu je 10-21h");
    break;
    
    default: System.out.println("Greska! Nije dobar dan.");
    
    }

  }

}
