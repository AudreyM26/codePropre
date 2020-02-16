package ex3;

/** Repr�sente une ferme de reptile
 * @author DIGINAMIC
 */
public class FermeReptile extends Zone {

	/** Masse moyenne en kg de nourriture consommée par 1 reptile */
	private static final double MASSE_NOURRITURE = 0.1;


	@Override
	public double getPoids() {
		// TODO Auto-generated method stub
		return MASSE_NOURRITURE;
	}

}
