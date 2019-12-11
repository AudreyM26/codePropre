package ex1;


 /**
  * classe representant les données d une entreprise
  * @author Audrey
  */


import java.util.Date;

public class Entreprise {

	/** numero de Siret de l entreprise */
	private int siret;
	
	/** nom de l entreprise */
	private String nom;
	
	/** adresse de l entreprise */
	private String adresse;
	
	/** date de creation l entreprise */
	private Date dateCreation;
	
	/** capital max */
	public static final int CAPITAL_MAX = 3000000;
	
	/** constructeur Entreprise
	 * 
	 * @param siret
	 * @param nom
	 * @param adresse
	 * @param date_Creation
	 */
	public Entreprise(int siret, String nom, String adresse, Date dateCreation) {
		this.siret = siret;
		this.nom = nom;
		this.adresse = adresse;
		this.dateCreation = dateCreation;
	}

	/** afficher le statut */
	public void afficherStatut(){
		
	}

	/**
	 * @return the siret
	 */
	public int getSiret() {
		return siret;
	}

	/**
	 * @param siret the siret to set
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/**
	 * @param dateCreation the date_Creation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
}
