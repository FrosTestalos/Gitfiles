import java.util.Scanner;

class Romain {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int[] nombres = {1000, 500, 100, 50, 10, 5, 1 };
        String symboles = "MDCLXVI";

        /*******************************************
         * Complétez le programme à partir d'ici.
         *******************************************/

        System.out.print("Entrez un nombre en chiffres romains : ");

        System.out.println("Conversion impossible, nombre romain mal formé.");
        final int MAX = 3999;
        System.out.print("Entrez un nombre (en chiffres arabes) compris entre 1 et " + MAX + " : ");
        /*******************************************
         * Ne rien modifier après cette ligne.
         *******************************************/
    }
}
