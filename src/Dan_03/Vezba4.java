package Dan_03;

public class Vezba4
{

  public static void main(String[] args)
  {
    //napisati program koji ispisuje svaki peti broj izmedju 10 i 50
    //(takodje ispisuje koji put ste usli u petlju)
    // primer resenja je:
    //vrednost promenljive je 10 usao sam u petlju 1.put
    // vrednost promenljive je 15 usao sam u petlju 2.put
    //...sve tako do 50 (ukljucujuci i 50)
    
    // Dodatak: Sabrati svaki 5. broj od 10 do 50, ukljucujuci i 10 i 50
    
    int i = 10;
    int n = 1;
    int suma = 0;
    
    while (i <= 50)
    {
      suma = suma + i;
      System.out.println("Vrednost promenljive je " + i + " usao sam u petlju " + n +". put i suma je " + suma);
      i = i + 5;
      n++;
    }
    
    System.out.println("Kraj programa");

  }

}
