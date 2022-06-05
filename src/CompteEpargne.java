public class CompteEpargne extends Compte{
   protected double taux;

   public CompteEpargne(int numero, double solde, String intitule,double taux) {
      super(numero, solde, intitule);
      this.taux=taux;
   }

   public double getTaux() {
      return taux;
   }

   public void setTaux(double taux) {
      this.taux = taux;
   }

   @Override
   public void affiche() {
      System.out.println("CompteEpargne{" +
              "taux=" + taux +
              ", numero=" + numero +
              ", solde=" + solde +
              ", intitule='" + intitule + '\'' +
              '}');
   }
}
