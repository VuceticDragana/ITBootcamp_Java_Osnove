package Dan_07;

public class Vezba2
{

  public static void main(String[] args)
  {
    //  Funkcija kao parametre prima osnovu i stepen, a za rezultat
//  vraca sracunatu vrednost.
//
//  Primer: stepen(10, 4) ima za rezultat 10000
//  Primer: stepen(2, 3) ima za rezultat 8
    
    int osnova = 2;
    int stepen = 3;
    
    
    System.out.println(stepenovanje(osnova, stepen));

  }
  
  public static int stepenovanje(int osnova, int stepen)
  {    
    int st = 1;
    
    for(int i = 0; i < stepen; i++)
    {
      st = st * osnova;
    }
    return st;
  }

}
