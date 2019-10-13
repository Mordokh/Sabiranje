package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Sabiranje
{
    public static void main(String[] args)
    {
	   int jabuke, kruske, voce;
	   Scanner ulaz=new Scanner(System.in);
	   System.out.println("Unesite broj jabuka: ");
	   jabuke=ulaz.nextInt();
	   System.out.println("Unesite broj krusaka:");
	   kruske=ulaz.nextInt();
	   voce=jabuke+kruske;
	   System.out.println("Ukupno voca:"+ voce);
    }
}
