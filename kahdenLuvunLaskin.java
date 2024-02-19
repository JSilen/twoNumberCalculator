import java.util.Scanner;

public class kahdenLuvunLaskin {
    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);

        double luku1, luku2;
        String operaattori;

        System.out.print("Anna ensimmäinen luku: ");
        luku1 = lukija.nextDouble();
        System.out.print("Laskutoimitus: ");
        operaattori = lukija.next();
        System.out.print("Anna toinen luku: ");
        luku2 = lukija.nextDouble();

        laskut(operaattori, luku1, luku2);
    }

    public static void laskut(String operaattori, double luku1, double luku2) {
        
        if (operaattori.equals("+")) {
            System.out.println("Lukujen summa on: " + (luku1 + luku2));
        } else if (operaattori.equals("-")) {
            System.out.println("Lukujen erotus on: " + (luku1 - luku2));
        } else if (operaattori.equals("*")) {
            System.out.println("Lukujen tulo on: " + (luku1 * luku2));
        } else if (operaattori.equals("/")) {
            System.out.println("Lukujen osamäärä on: " + (luku1 / luku2));
        } else {
            System.out.println("Virheellinen operaattori!" );  
        }
    }
}