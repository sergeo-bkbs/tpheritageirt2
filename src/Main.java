import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Déclation du tableau
        List<Compte> tableauDeCompte = new ArrayList<Compte>();
        //Instanciation du Compte Courant
        CompteCourant compteCourant = new CompteCourant(1,120000,"CompteCourant1",12000);
        //Instanciation du Compte Epargne
        CompteEpargne compteEpargne = new CompteEpargne(2,300000,"CompteEpargne3",30000);
        //Ajout du Compte Courant au tableau
        tableauDeCompte.add(compteCourant);
        //Ajout du Compte Epargne au tableau
        tableauDeCompte.add(compteEpargne);

        //affichage du tableau des comptes
        for(int i=0;i<tableauDeCompte.size();i++){
            tableauDeCompte.get(i).affiche();
        }
    }
}