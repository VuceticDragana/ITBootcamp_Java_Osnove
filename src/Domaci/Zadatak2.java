package Domaci;

public class Zadatak2
{

  public static void main(String[] args)
  {
    // Ako jedna stranica trougla iznosi 5 cm, druga iznosi 10 cm, 
    // koliko iznosi treca stranica?
    
    double a = 5;
    double b = 10;
    double c;
    
    c = a * a + b  * b;
    
    System.out.printf("Pravougli trougao sa katetama od %.0fcm i %.0fcm ima hipotenuzu od %.2fcm.", 
        a, b, Math.sqrt(c));
    
    // Resenje provereno pomocu ovog sajta https://www.calculat.org/hr/povrsina-opseg/pravokutni-trokut.html
    
    

  }

}
