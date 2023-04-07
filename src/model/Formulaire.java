package model;

public abstract class Formulaire {
	private int jour;
	private int mois;
	private int idEntite;
	protected Formulaire(int jour, int mois) {
		this.jour = jour;
		this.mois = mois;
	}
	/**
	 * @return the num_entite
	 */
	public int getIdentificationEntite() {
		return idEntite;
	}
	/**
	 * @param num_entite the num_entite to set
	 */
	public void setIdentificationEntite(int num_entite) {
		this.idEntite = num_entite;
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
