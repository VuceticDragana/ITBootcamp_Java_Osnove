package Domaci;

public class Zadatak8
{

  public static void main(String[] args)
  {
//  Napisati program koji ce prebrojati koliko je brojeva od 9 do 250 (ukljucujuci i njih)
//  deljivih brojem 3.
    
    int i;
    int suma = 0;    
    
    for (i = 9; i <= 250; i++)
    {
      if (i % 3 == 0)
      {
        suma = suma + 1;
      }
    }
    
//    for (i = 9; i <= 250; i = i + 3)
//    {      
//        suma = suma + 1;      
//    }
    
    System.out.println("Brojeva deljivih za 3 ima " + suma);
    
    // Dobijeno resenje je 81
    
    // Provera rezultata
    // 250 / 3 = 83.3333... - 250 nije deljiv sa 3
    // 249 / 3 = 83 - 249 je zadnji broj u nizu koji je deljiv sa 3
    // Posto je ovde uracunato 3 i 6 koji nisu u tom zadatku
    // 83 - 2 = 81.
    
    
    

  }

}
