package ex3;

import java.util.ArrayList;
import java.util.List;

public abstract class Zone {

	private List<String> types =  new ArrayList<String>();
	private List<String> noms = new ArrayList<String>();
	private List<String> comportements =  new ArrayList<String>();
	
	public void addAnimal(String typeAnimal, String nomAnimal, String comportement) {
		types.add(typeAnimal);
		noms.add(nomAnimal);
		comportements.add(comportement);
	}
	
	public void afficherListeAnimaux(){
		for (String nom: noms){
			System.out.println(nom);
		}
	}
	
	public int compterAnimaux(){
		return noms.size();
	}
	
	
	public abstract double getPoids();
	
	public double calculerKgsNourritureParJour(){
		return noms.size() * getPoids();
	}

	/**
	 * @return the types
	 */
	public List<String> getTypes() {
		return types;
	}

	/**
	 * @param types the types to set
	 */
	public void setTypes(List<String> types) {
		this.types = types;
	}

	/**
	 * @return the noms
	 */
	public List<String> getNoms() {
		return noms;
	}

	/**
	 * @param noms the noms to set
	 */
	public void setNoms(List<String> noms) {
		this.noms = noms;
	}

	/**
	 * @return the comportements
	 */
	public List<String> getComportements() {
		return comportements;
	}

	/**
	 * @param comportements the comportements to set
	 */
	public void setComportements(List<String> comportements) {
		this.comportements = comportements;
	}
}
