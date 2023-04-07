package model;

public class FormulaireRestaurant extends Formulaire {
	private int num_personnes;
	private int num_service;

	public FormulaireRestaurant(int jour, int mois, int num_personnes, int num_service) {
		super(jour, mois);
		this.num_personnes = num_personnes;
		this.num_service = num_service;
	}

	/**
	 * @return the num_personnes
	 */
	public int getNombrePersonnes() {
		return num_personnes;
	}

	/**
	 * @return the num_service
	 */
	public int getNumService() {
		return num_service;
	}

}
