package model;

public abstract class Reservation {
	private int mois;
	private int jour;
	
	protected Reservation(int jour, int mois) {
		this.jour = jour;
		this.mois = mois;
	}
	/**
	 * @return the mois
	 */
	public int getMois() {
		return mois;
	}
	/**
	 * @return the jour
	 */
	public int getJour() {
		return jour;
	}
	@Override
	public abstract String toString();
}

