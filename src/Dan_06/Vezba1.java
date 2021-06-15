package Dan_06;

public class Vezba1
{

  public static void main(String[] args)
  {
    //ispisiNesto();
    //ispisiNesto("Dragana");
    ispisiNesto(3);
    
    int suma = sabiranje(5, 8);
    System.out.println("Ispis iz mejna, suma je " + suma);
    
    //String rezultatFunkcije = punoletan(35);
    boolean rezultatFunkcije = punoletan2(35);
    System.out.println("Dragana je " + rezultatFunkcije);
    
    if (rezultatFunkcije)
    {
      System.out.println("Dragana je punoletna");
    }
    else
    {
      System.out.println("Dragana je maloletna");
    }
  }
  
  public static void ispisiNesto() // zaglavlje funkcije
  {
    System.out.println("Ispisujem iz funkcije."); // telo funkcije
  }
  
  public static void ispisiNesto(String argument1) // zaglavlje funkcije
  {
    System.out.println("Ispisujem iz funkcije " + argument1); // telo funkcije
  }
  
  public static void ispisiNesto(int argument1) // zaglavlje funkcije
  {
    System.out.println("Ispisujem iz funkcije " + argument1); // telo funkcije
  }
  
  public static int sabiranje (int br1, int br2)
  {
    int zbir = br1 + br2;
    return zbir;
  }
  
  public static String punoletan (int brGodina)
  {
    String punoletstvo;
    if(brGodina >= 18)
    {
      punoletstvo = "Punoletna";
    }
    else
    {
      punoletstvo = "Maloletan";
    }
    return punoletstvo;
  }
  
  public static boolean punoletan2 (int brGodina)
  {
    boolean punoletstvo;
    if(brGodina >= 18)
    {
      punoletstvo = true;
    }
    else
    {
      punoletstvo = false;
    }
    return punoletstvo;
  }
  
  

}
