
public class CompteCourant extends Compte{
    protected double seuil;

    public CompteCourant(int numero, double solde, String intitule,double seuil) {
        super(numero, solde, intitule);
        this.seuil=seuil;
    }

    public double getSeuil() {
        return seuil;
    }

    public void setSeuil(double seuil) {
        this.seuil = seuil;
    }
    @Override
    public void affiche() {
        System.out.println("CompteCourant{" +
                "seuil=" + seuil +
                ", numero=" + numero +
                ", solde=" + solde +
                ", intitule='" + intitule + '\'' +
                '}');
    }
}
