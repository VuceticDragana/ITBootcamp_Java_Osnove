package Dan_03;

import java.util.Scanner;

public class SwitchString
{

  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);

    System.out.println("Uneti dan u nedelji: ");
    String dan = s.next();

    switch (dan)
    {
    case "Ponedeljak":
    {
      System.out.println(dan + " je 1. dan u nedelji");
      break;
    }
    case "Utorak":
    {
      System.out.println(dan + " je 2. dan u nedelji");
      break;
    }
    case "Sreda":
    {
      System.out.println(dan + " je 3. dan u nedelji");
      break;
    }
    case "Cetvrtak":
    {
      System.out.println(dan + " je 4. dan u nedelji");
      break;
    }
    case "Petak":
    {
      System.out.println(dan + " je 5. dan u nedelji");
      break;
    }
    case "Subota":
    {
      System.out.println(dan + " je 6. dan u nedelji");
      break;
    }
    case "Nedelja":
    {
      System.out.println(dan + " je 7. dan u nedelji");
      break;
    }
    default:
    {
      System.out.println("Nevalidan unos");
      break;
    }
    }

    s.close();

  }

}
