package model;

public abstract class Formulaire {
	private int jour;
	private int mois;
	private int num_entite;
	protected Formulaire(int jour, int mois) {
		this.jour = jour;
		this.mois = mois;
	}
	/**
	 * @return the num_entite
	 */
	public int getIdentificationEntite() {
		return num_entite;
	}
	/**
	 * @param num_entite the num_entite to set
	 */
	public void setIdentificationEntite(int num_entite) {
		this.num_entite = num_entite;
	}
	/**
	 * @return the jour
	 */
	public int getJour() {
		return jour;
	}
	/**
	 * @return the mois
	 */
	public int getMois() {
		return mois;
	}
	
	

}
