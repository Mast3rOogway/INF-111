import java.util.Scanner;
public class tauxHoraire {
    public static void main(String[] args){
        int nbHeure,tauxHoraire;
        Scanner clavier;
        clavier = new Scanner(System.in);
        System.out.println("Entrer le nb d'heure travaille: ");
        nbHeure = clavier.nextInt();
        System.out.println("Entrer le salaire horaire: ");
        tauxHoraire = clavier.nextInt();
        System.out.println(calculSalaire(nbHeure,tauxHoraire));
    }
    public static double calculSalaire(int nbH,int tauxHoraire){
        if (nbH>40){
            int tempsDouble;
            float paye;
            tempsDouble = nbH-40;
            paye = (tempsDouble*tauxHoraire*2)+(40*tauxHoraire);
            return paye;
        }
        else {
            float paye;
            paye = nbH*tauxHoraire;
            return paye;
        }

    }
}
