package Dan_05;

import java.util.Scanner;

public class Vezba1
{

  public static void main(String[] args)
  {
    //Napisati zadatak koji za uneti dvocifreni broj napise koja je prva cifra, a koja druga
    // primer ispisa:
    //uneli ste 35
    //prvi broj je 3
    //drugi broj je 5
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Unesi dvocifren broj: ");
    int broj = s.nextInt();
    s.close();
    
    if(broj < 10 || broj > 99)
    {
      System.out.println("Greska! Broj mora biti dvocifren.");
      return;
    }
    
    int prvi;
    prvi = broj / 10;
    System.out.println("Prvi broj je " + prvi);
    
    int drugi;
    drugi = broj % 10;
    System.out.println("Drugi broj je " + drugi);
  }

}
