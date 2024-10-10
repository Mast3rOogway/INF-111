import java.util.Scanner;
public class retourCaisse {
    public static void main (String[] args){
        Scanner clavier;
        clavier = new Scanner(System.in);
        int sommeClient,montantDonne;

        System.out.print("Coût total de l'achat :");
        sommeClient = clavier.nextInt();
        System.out.print("Montant payé par le client: ");
        montantDonne = clavier.nextInt();

        if(sommeClient>montantDonne){
            System.out.println("VOUS ETES PAUVRE!!!");
        }
        else{
            int monnaieRendue = montantDonne - sommeClient;
            System.out.println(afficheChange(monnaieRendue));
        }

    }
    public static String afficheChange(int argentClient) {
        String valeurFinal = "";
        int nouveuMontant, billet100 = 0, billet50 = 0, billet20 = 0, billet10 = 0, billet5 = 0, piece2 = 0, piece1 = 0;
        if (argentClient >= 100) {
            billet100 = argentClient / 100;
            nouveuMontant = argentClient%100;
            if (nouveuMontant >= 50) {
                billet50 = nouveuMontant / 50;
                nouveuMontant = nouveuMontant%50;
            }
            if (nouveuMontant >= 20) {
                billet20 = nouveuMontant / 20;
                nouveuMontant = nouveuMontant%20;
                if (nouveuMontant >= 10) {
                    billet10 = nouveuMontant / 10;
                    nouveuMontant = nouveuMontant%10;
                }
                if (nouveuMontant >= 5) {
                    billet5 = nouveuMontant / 5;
                    nouveuMontant = nouveuMontant%5;
                }
                if (nouveuMontant >= 2) {
                    piece2 = nouveuMontant / 2;
                    nouveuMontant = nouveuMontant%2;
                }
                if (nouveuMontant >= 1) {
                    piece1 = nouveuMontant;
                }
                valeurFinal += "Remise au client :\n";
                if (billet100 > 0) valeurFinal += billet100 + " x 100$\n";
                if (billet50 > 0) valeurFinal += billet50 + " x 50$\n";
                if (billet20 > 0) valeurFinal += billet20 + " x 20$\n";
                if (billet10 > 0) valeurFinal += billet10 + " x 10$\n";
                if (billet5 > 0) valeurFinal += billet5 + " x 5$\n";
                if (piece2 > 0) valeurFinal += piece2 + " x 2$\n";
                if (piece1 > 0) valeurFinal += piece1 + " x 1$\n";
            }
        }
        return valeurFinal;
    }
}
