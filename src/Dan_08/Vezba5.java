package Dan_08;

import java.util.Scanner;

public class Vezba5
{

  public static void main(String[] args)
  {
  //NAPISATI FUNKCIJU koja racuna broj bodova nekog tima
    //Pobeda nosi 4 boda
    //Nereseno nosi 2 boda
    //Poraz nosi 1 bod
    //Ispise izvrsiti iz main metode
    
    //Primer resenja
    //Unesite broj pobeda:
    //3
    //Unesite broj neresenih utakmica:
    //4
    //Unesite broj poraza:
    //2
    //Ekipa ima 22 bodova
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Unesite broj pobeda: ");
    int pobeda = s.nextInt();
    
    System.out.println("Unesite broj neresenih utakmica: ");
    int nereseno = s.nextInt();
    
    System.out.println("Unesite broj poraza: ");
    int poraz = s.nextInt();
    
    s.close();
    
    int rezultat = sabiranjeBodova(pobeda, nereseno, poraz);
    System.out.println("Ekipa ima " + rezultat + " bodova");

  }
  
  public static int sabiranjeBodova(int pobeda, int nereseno, int poraz)
  {
    int rezultat;
    rezultat = pobeda * 4 + nereseno * 2 + poraz;
    return rezultat;
  }

}
