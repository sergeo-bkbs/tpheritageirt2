
public class Compte {
    protected int numero;
    protected double solde;
    protected String intitule;

    public Compte(int numero, double solde, String intitule) {
        this.numero = numero;
        this.solde = solde;
        this.intitule = intitule;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }
    public void affiche() {
        System.out.println("Compte{" +
                "numero=" + numero +
                ", solde=" + solde +
                ", intitule='" + intitule + '\'' +
                '}');
    }
}
