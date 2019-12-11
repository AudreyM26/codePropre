package ex2;

/** Représente un compte bancaire de type livret A (type=LA)
 * @author DIGINAMIC
 */

public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;
	
	/** Ce constructeur pour créer un compte de type Livret A
	 * @param type = LA
	 * @param solde représente le solde du compte
	 * @param decouvert  représente le découvert autorisé
	 * @param tauxRemuneration  représente le taux de rémunération du livret A
	 */
	public LivretA(String type, double solde, double tauxRemuneration) {
		super(type, solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}

	/** calculer et appliquer le nouveau solde avec taux de remunération */
	public void appliquerRemuAnnuelle(){
		double RemuAnnuelle = this.getSolde()+this.getSolde()*this.tauxRemuneration/100;
		this.setSolde(RemuAnnuelle);

	}

	
	/** Ajoute un montant au solde
	 * @param montant
	 */
	public void debiterMontant(double montant){
		if (this.getSolde() - montant > 0){
			this.setSolde(this.getSolde()-montant);
		}	
	}
	
	/**
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
