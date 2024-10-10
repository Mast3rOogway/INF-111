import java.util.Scanner;

public class retourCaissev2 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int sommeClient, montantDonne;

        // Demander le coût total de l'achat et le montant payé par le client
        System.out.print("Coût total de l'achat : ");
        sommeClient = clavier.nextInt();
        System.out.print("Montant payé par le client : ");
        montantDonne = clavier.nextInt();

        // Vérifier si le montant payé est suffisant
        if (sommeClient > montantDonne) {
            System.out.println("VOUS ETES PAUVRE!!!");
        } else {
            // Calculer la monnaie à rendre
            int monnaieRendue = montantDonne - sommeClient;
            System.out.println(afficheChange(monnaieRendue));
        }

        clavier.close(); // Fermer le Scanner pour éviter les fuites de ressources
    }

    // Méthode optimisée pour afficher la remise en billets et pièces
    public static String afficheChange(int argentClient) {
        // Tableau des valeurs de billets et pièces
        int[] valeurs = {100, 50, 20, 10, 5, 2, 1};
        StringBuilder resultat = new StringBuilder("Remise au client :\n");

        // Parcourir chaque billet/pièce et calculer combien en rendre
        for (int valeur : valeurs) {
            if (argentClient >= valeur) {
                int quantite = argentClient / valeur;  // Calculer combien de billets/pièces
                argentClient %= valeur;  // Mettre à jour le montant restant
                resultat.append(quantite).append(" x ").append(valeur).append("$\n");  // Ajouter au résultat
            }
        }

        return resultat.toString();  // Retourner le résultat sous forme de String
    }
}
