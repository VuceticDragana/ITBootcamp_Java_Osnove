package Dan_08;

import java.util.Scanner;

public class Vezba4
{

  public static void main(String[] args)
  {
 // NAPISATI FUNKCIJU koja unetu vrednost distance prebacuje u metre
    // 1 Yard = 0.9144 metara
    // 1 Foot = 0.3048 metara
    // 1 Inch = 0.0254 metara
    // Korisnik unosi distancu i mernu jedinicu
    // Ispis u konzoli se vrsi iz main funkcije
    // Primer resenja:
    // Molim vas unesite distancu:
    // 150
    // Molim vas unesite mernu jedinicu (Yard, Foot ili Inch):
    // Yard
    // 150 Yard je isto sto i 137.16 metara
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Molim vas unesite distancu: ");
    double distanca = s.nextDouble();
    
    System.out.println("Molim vas unesite mernu jedinicu (Yard, Foot ili Inch): ");
    String jedinica = s.next();
    
    s.close();
    
    double rezultat = konvertor(distanca, jedinica);
    System.out.printf("%.0f %s je isto sto i %.2f metara", distanca, jedinica, rezultat);

  }
  
  public static double konvertor(double distanca, String jedinica)
  {
    double metri;    
    
    switch(jedinica)
    {
    case "Yard": metri = distanca * 0.9144;
    break;
    
    case "Foot": metri = distanca * 0.3048;
    break;
    
    case "Inch": metri = distanca * 0.0254;
    break;
    
    default: metri = distanca;
    }
    return metri;
  }

}
