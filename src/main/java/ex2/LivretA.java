package ex2;

/** Repr�sente un compte bancaire de type livret A (type=LA)
 * @author DIGINAMIC
 */

public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de r�mun�ration dans le cas d'un livret A */
	private double tauxRemuneration;
	
	/** Ce constructeur pour cr�er un compte de type Livret A
	 * @param type = LA
	 * @param solde repr�sente le solde du compte
	 * @param decouvert  repr�sente le d�couvert autoris�
	 * @param tauxRemuneration  repr�sente le taux de r�mun�ration du livret A
	 */
	public LivretA(String type, double solde, double tauxRemuneration) {
		super(type, solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}

	/** calculer et appliquer le nouveau solde avec taux de remun�ration */
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
