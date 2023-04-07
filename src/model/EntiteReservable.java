package model;

public abstract class EntiteReservable <F extends Formulaire>{
	private CalendrierAnnuel calendrierPersonnel;
	private int numIdentification;
	
	public EntiteReservable(CalendrierAnnuel calendrierPerso, int numIdentification) {
		this.calendrierPersonnel = calendrierPerso;
		this.numIdentification = numIdentification;
	}

	/**
	 * @return the numIdentification
	 */
	public int getNumIdentification() {
		return numIdentification;
	}

	/**
	 * @param numIdentification the numIdentification to set
	 */
	public void setNumIdentification(int numIdentification) {
		this.numIdentification = numIdentification;
	}
	
	boolean estLibre(F formulaireReservation) {
		return(calendrierPersonnel.estLibre(formulaireReservation.getJour(), formulaireReservation.getMois()));
	}
	
	abstract void compatible(F formulaireReservation);
	
	abstract Reservation reserver(F formulaireReservation);
	
	
}
