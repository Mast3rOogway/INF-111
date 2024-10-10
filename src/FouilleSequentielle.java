import java.util.Scanner;

public class FouilleSequentielle {

    public static void main(String[] args){

        Scanner clavier;
        clavier = new Scanner(System.in);
        int i, position = -1;
        double tableau[] = {2.9, 8.6, 7.6, 7.2, 5.0, 2.5, 6.4, 11.1, 13.3, 10.5};
        double valeurCherchee;
        boolean trouvee;
        System.out.print("Entrer un nombre pour savoir s'il y ait: ");
        valeurCherchee = clavier.nextDouble();
        i=0;
        trouvee = false;
        while (i<tableau.length && !trouvee) {
            if (tableau[i] == valeurCherchee) {
                position = i;
                trouvee = true;
            }
            i++;
        }
        if (trouvee)
            System.out.println("La valeur "+valeurCherchee+" est à la position " +position);
        else
            System.out.println("La valeur "+valeurCherchee+" n'existe pas.");


    }
}
