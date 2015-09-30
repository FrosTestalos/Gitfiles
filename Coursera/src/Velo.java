import java.util.Scanner;

public class Velo {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Donnez l'heure de début de la location (un entier) : ");
        int debut = clavier.nextInt();
        System.out.print("Donnez l'heure de fin de la location (un entier) : ");
        int fin = clavier.nextInt();

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        if ((debut>24)||(fin>24)||(debut<0)||(fin<0)){
            System.out.println("Les heures doivent être comprises entre 0 et 24 !");
        }else if (debut==fin) {
            System.out.println("Bizarre, vous n'avez pas loué votre vélo bien longtemps !");
        }else if (debut>fin){
            System.out.println("Bizarre, le début de la location est après la fin ...");
        }else {int duree=fin-debut;
            int total1=0;
            int total2=0;
            int total =0;

            for(int i=1;i<=duree;i++){
                if (((debut>=0)&&(debut<7))||((debut>=17)&&(debut<24))) {
                    total1+=1;
                }else {total2+=2;}
                debut++;
                total=total1+total2;

            }
            System.out.println("Vous avez loué votre vélo pendant ");
            if (total1>0)System.out.println(total1+" heure(s) au tarif horaire de 1.0 francs");
            if (total2>0){System.out.println(total2/2+" heure(s) au tarif horaire de 2.0 francs");}
            System.out.print("Le montant total à payer est de ");
            System.out.print(total);
            System.out.println(" francs.");

        }


        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

        clavier.close();
    }
}
