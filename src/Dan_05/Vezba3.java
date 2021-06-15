package Dan_05;

import java.util.Scanner;

public class Vezba3
{

  public static void main(String[] args)
  {
    // prvi dan u mesecu je ponedeljak, a mesec ima 31 dan
    // korisnik unosi dan u nedelji, a program treba da kaze
    // na koje dane u mesecu pada taj dan
    // primer ispisa:
    // utorak pada na
    // 2
    // 9
    // 16
    // 23
    // 30
    // dan u mesecu
    
//    Bonus deo: Zelim da mi ispis izgleda ovako
//    Utorak pada na:
//    2, 9, 16, 23, 30 dan u mesecu
//    Obratite paznju da nema zaraza nakon poslednjeg broja...znaci nije ovako
//    Utorak pada na:
//    2, 9, 16, 23, 30, dan u mesecu

    Scanner s = new Scanner(System.in);

    System.out.println("Unesi dan: ");
    String dan = s.next();

    int a;

    switch (dan)
    {
    case "Ponedeljak":
      a = 1;
      break;

    case "Utorak":
      a = 2;
      break;

    case "Sreda":
      a = 3;
      break;

    case "Cetvrtak":
      a = 4;
      break;

    case "Petak":
      a = 5;
      break;

    case "Subota":
      a = 6;
      break;

    case "Nedelja":
      a = 7;
      break;
      
    default:
      a = 0;
      break;
    }

    System.out.println(dan + " pada na: ");
    
    while (a <= 31 - 7)
    {
      System.out.print(a + ", ");
      a = a + 7;
    }
    
    System.out.println(a +" dan u mesecu.");

  }

}
