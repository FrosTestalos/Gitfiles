
import java.util.Scanner;

public class Champi {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Pensez a un champignon : amanite tue mouches, pied bleu, girolle,");
        System.out.println("cèpe de Bordeaux, coprin chevelu ou agaric jaunissant.");
        /*System.out.print("Est-ce que votre champignon a des lamelles (true : oui, false : non) ? ");
        boolean lamelles=clavier.nextBoolean();*/
        System.out.print("Est-ce que votre champignon vit en forêt (true : oui, false : non) ? ");
        boolean foret=clavier.nextBoolean();
        System.out.print("Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? ");
        boolean chapeau=clavier.nextBoolean();
        System.out.print("Est-ce que votre champignon a un anneau (true : oui, false : non) ? ");
        boolean anneau=clavier.nextBoolean();
        System.out.print("==> Le champignon auquel vous pensez est ");
        if ((anneau)&&(chapeau)){
            if (foret){System.out.print("l'amanite tue-mouches");}
            if (!foret){System.out.print("l'agaric jaunissant");}
        }
        if ((!anneau)&&(chapeau)){
            if (foret){System.out.print("le pied bleu");}
            if (!foret){System.out.print("le cèpe de Bordeaux");}
        }
        if ((anneau)&&(!chapeau)){
            if (!foret){System.out.print("le coprin chevelu");}
        }
        if ((!anneau)&&(!chapeau)){
            if (foret){System.out.print("la girolle");}
        }



    }



}
       
