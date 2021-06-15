package Dan_04;

import java.util.Scanner;

public class Vezba3
{

  public static void main(String[] args)
  {
//  Napisati program koji sabira
//  brojeve od 0 do broja koji ste uneli na tastaturi
//  i prikazuje sumu (ne u svakom koraku vec samo na na kraju)
//  Zbir svih brojeva od 0 do 3 je 6

    Scanner s = new Scanner(System.in);

    System.out.println("Unesi broj do kog zelite da saberete: ");
    int broj = s.nextInt();
    int suma = 0;
    int i = 0;
    
    while (broj >= i)
    {
      suma = suma + i;
      i++;
    }
    
    System.out.println("Zbir je " + suma);
    
    s.close();

  }

}
