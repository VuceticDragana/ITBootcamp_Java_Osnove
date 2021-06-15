package Dan_01;

public class Vezba2
{

  public static void main(String[] args)
  {
//  Napisati program koji racuna povrsinu kvadrata stranice a,
//  i povrsinu kruga poluprecnika r.
//  Povrsina kvadrata se racuna kao P = a x a
//  Povrsina kruga se racuna kao P = r x r x 3.14
    
    // Povrsina kvadrata
    
    int a = 10;
    int povrsinaKvadrata;
    povrsinaKvadrata = a * a;    
    
    System.out.printf("Povrsina kvadrata cija je stranica %d iznosi: %d\n", a, povrsinaKvadrata);
    
    // Povrsina kruga
    
    double r = 5;
    //double povrsinaKruga = r * r * 3.14;
    double povrsinaKruga = r * r * Math.PI;
    
    System.out.printf("Povrsina kruga ciji je poluprecnik 5 iznosi: " + povrsinaKruga);
    

  }

}
