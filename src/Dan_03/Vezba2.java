package Dan_03;

import java.util.Scanner;

public class Vezba2
{

  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Uneti redni broj meseca: ");
    int dan = s.nextInt();
    

    switch (dan)
    {
    case 1:
    {
      System.out.println(dan + ". mesec u godini je januar. U njemu ima 31 dan");
      break;
    }
    case 2:
    {
      System.out.println(dan + ". mesec u godini je februar. U njemu ima 28 dana");
      break;
    }
    case 3:
    {
      System.out.println(dan + ". mesec u godini je mart. U njemu ima 31 dan");
      break;
    }
    case 4:
    {
      System.out.println(dan + ". mesec u godini je april. U njemu ima 30 dana");
      break;
    }
    case 5:
    {
      System.out.println(dan + ". mesec u godini je maj. U njemu ima 31 dan");
      break;
    }
    case 6:
    {
      System.out.println(dan + ". mesec u godini je jun. U njemu ima 30 dana");
      break;
    }
    case 7:
    {
      System.out.println(dan + ". mesec u godini je jul. U njemu ima 31 dan");
      break;
    }
    case 8:
    {
      System.out.println(dan + ". mesec u godini je avgust. U njemu ima 31 dan");
      break;
    }
    case 9:
    {
      System.out.println(dan + ". mesec u godini je septembar. U njemu ima 30 dana");
      break;
    }
    case 10:
    {
      System.out.println(dan + ". mesec u godini je oktobar. U njemu ima 31 dan");
      break;
    }
    case 11:
    {
      System.out.println(dan + ". mesec u godini je novembar. U njemu ima 30 dana");
      break;
    }
    case 12:
    {
      System.out.println(dan + ". mesec u godini je decembar. U njemu ima 31 dan");
      break;
    }
    default:
    {
      System.out.println("Redni broj meseca nije validan");
      break;
    }
    }

    s.close();

  }

}
