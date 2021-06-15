package Dan_03;

import java.util.Scanner;

public class Vezba3
{

  public static void main(String[] args)
  {
    // Napisati program koji na osnovu vaseg unosa stringa opisuje godisnje doba
    // Primer: uneli ste Zima a program je ispisao Zima je hladna i tada uglavnom
    // pada sneg

    Scanner s = new Scanner(System.in);

    System.out.println("Uneti godisnje doba: ");
    String godisnjeDoba = s.next();

    switch (godisnjeDoba)
    {
    case "Zima":
    {
      System.out.println(godisnjeDoba + " je hladna i tada bi uglavnom trebalo da pada sneg :)");
      break;
    }
    case "Jesen":
    {
      System.out.println(godisnjeDoba + " je kisovita i tmurna");
      break;
    }
    case "Prolece":
    {
      System.out.println(godisnjeDoba + " je vreme kad se budi priroda");
      break;
    }
    case "Leto":
    {
      System.out.println(godisnjeDoba + " je najtoplije godisnje doba");
      break;
    }
    default:
    {
      System.out.println("Nevalidan unos");
      break;
    }
    }
    
    if (godisnjeDoba.equals("Leto"))
    {
      System.out.println("U petlji smo leto.");
    }
    s.close();
  }

}
