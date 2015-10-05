import java.util.Scanner;
import java.text.DecimalFormat;

public class Population {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#0.000");
        Scanner keyb = new Scanner(System.in);

        int anneeInitiale = 2011;        // annee initiale
        double tauxCroissance = 1.2;     // taux de croissance, en %
        double populationInitiale = 7.0; // population initiale, en milliard d'humains

        double populationCourante = populationInitiale; // population mondiale pour l'annee courante
        int anneeCourante = anneeInitiale;              // annee de calcul

        System.out.println("====---- PARTIE 1 ----====");
        System.out.println("Population en " + anneeCourante + " : " + df.format(populationCourante));

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/

        // ===== PARTIE 1 =====
		// utilisez cette instruction pour poser votre question :

        int anneeFinale;
        double populationFinale;

        do {System.out.print("Quelle année (> " + anneeInitiale + ") ? ");
            anneeFinale=keyb.nextInt();
        }while (anneeFinale<=anneeInitiale);
        int nb=anneeFinale-anneeInitiale;
        populationFinale=populationInitiale*Math.exp(nb*tauxCroissance/100);
        System.out.println("Population en " + anneeFinale + " : " + df.format(populationFinale));


        // ===== PARTIE 2 =====
        System.out.println("\n====---- PARTIE 2 ----====");
        double populationCible=0.0;
        do {System.out.print("Combien de milliards (> " + populationInitiale + ") ? ");
            populationCible=keyb.nextDouble();

        }while (populationCible<=populationInitiale);
        do {
            anneeCourante++;
            int nbb = anneeCourante - anneeInitiale;
            populationCourante = populationInitiale * Math.exp(nbb * tauxCroissance / 100);
            System.out.println("Population en " + anneeCourante + " : " + df.format(populationCourante));
        }while (populationCourante<populationCible);



        // ===== PARTIE 3 =====
        System.out.println("\n====---- PARTIE 3 ----====");
        anneeCourante=anneeInitiale;
        populationCourante=populationInitiale;
        do {
            int nbb = anneeCourante - anneeInitiale;
            int n=1;
            if (2*n*populationInitiale<populationCourante){
                tauxCroissance=tauxCroissance/2;n++;
            }
            anneeCourante++;

            populationCourante = populationInitiale * Math.exp(nbb * tauxCroissance / 100);
            System.out.println("Population en " + anneeCourante + " : " + df.format(populationCourante)+" taux de croissance : "+tauxCroissance+"%");
        }while (populationCourante<populationCible);





        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
    }
}
