package Dan_08;

public class Vezba2
{

  public static void main(String[] args)
  {
 // napravite niz  15 brojeva (prvi broj ne sme biti veci od 200)
    // napravite petlju koja sabira elemente niza
    // sve dok dok je zbir manji od 200
    // u svakom prolazu ispisite trenutni zbir i koliko nam fali do 200
    // ako zbir svih elemenata ne predje 200 ispisite:
    // "Zbir elemenata niza je manji od 200"
    
    //primer niza (kada je zbir elemenata veci od 200): {2,8,-5,16,31,67,8,88,99,2,3,2,5,7,5}
    //primer resenja (kada je zbir elemenata veci od 200):
    //Dodajemo 1 elemenat niza: 2 trenutni zbir je 2, a do 200 nam je ostalo 198
    //Dodajemo 2 elemenat niza: 8 trenutni zbir je 10, a do 200 nam je ostalo 190
    //Dodajemo 3 elemenat niza: -5 trenutni zbir je 5, a do 200 nam je ostalo 195
    //Dodajemo 4 elemenat niza: 16 trenutni zbir je 21, a do 200 nam je ostalo 179
    //Dodajemo 5 elemenat niza: 31 trenutni zbir je 52, a do 200 nam je ostalo 148
    //Dodajemo 6 elemenat niza: 67 trenutni zbir je 119, a do 200 nam je ostalo 81
    //Dodajemo 7 elemenat niza: 8 trenutni zbir je 127, a do 200 nam je ostalo 73
    //Ako dodamo 8. element niza: 88 Zbir ce breci 200 za 15
    
    //primer niza (kada je zbir elemenata manji od 200): {1,8,-5,1,1,1,8,1,1,2,3,2,5,7,5}
    //primer resenja (kada je zbir elemenata veci od 200):
    //Dodajemo 1 elemenat niza: 1 trenutni zbir je 1, a do 200 nam je ostalo 199
    //Dodajemo 2 elemenat niza: 8 trenutni zbir je 9, a do 200 nam je ostalo 191
    //Dodajemo 3 elemenat niza: -5 trenutni zbir je 4, a do 200 nam je ostalo 196
    //Dodajemo 4 elemenat niza: 1 trenutni zbir je 5, a do 200 nam je ostalo 195
    //Dodajemo 5 elemenat niza: 1 trenutni zbir je 6, a do 200 nam je ostalo 194
    //Dodajemo 6 elemenat niza: 1 trenutni zbir je 7, a do 200 nam je ostalo 193
    //Dodajemo 7 elemenat niza: 8 trenutni zbir je 15, a do 200 nam je ostalo 185
    //Dodajemo 8 elemenat niza: 1 trenutni zbir je 16, a do 200 nam je ostalo 184
    //Dodajemo 9 elemenat niza: 1 trenutni zbir je 17, a do 200 nam je ostalo 183
    //Dodajemo 10 elemenat niza: 2 trenutni zbir je 19, a do 200 nam je ostalo 181
    //Dodajemo 11 elemenat niza: 3 trenutni zbir je 22, a do 200 nam je ostalo 178
    //Dodajemo 12 elemenat niza: 2 trenutni zbir je 24, a do 200 nam je ostalo 176
    //Dodajemo 13 elemenat niza: 5 trenutni zbir je 29, a do 200 nam je ostalo 171
    //Dodajemo 14 elemenat niza: 7 trenutni zbir je 36, a do 200 nam je ostalo 164
    //Dodajemo 15 elemenat niza: 5 trenutni zbir je 41, a do 200 nam je ostalo 159
    //Zbir elemenata niza je manji od 200

    //int[] niz = {2,8,-5,16,31,67,8,88,99,2,3,2,5,7,5};
    int[] niz = {1,8,-5,1,1,1,8,1,1,2,3,2,5,7,5};
    
    int suma = 0;
    for(int i = 0; i < niz.length; i++)
    {
      suma = suma + niz[i];
      if(suma < 200)
      {
        System.out.printf("Dodajemo %d elementa niza: %d trenutni zbir je %d, a do 200 nam je ostalo %d\n",
            i+1, niz[i], suma, 200-suma);
      }
      else
      {
        System.out.printf("Ako dodamo %d. elementa niza: %d Zbir ce preci 200 za %d\n",
            i+1, niz[i], suma-200);        
        break;
      }      
    }
    
    if(suma < 200)
    {
      System.out.println("Zbir elemenata niza je manji od 200");
    }
    
  }

}
