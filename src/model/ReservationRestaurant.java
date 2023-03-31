package model;

public class ReservationRestaurant extends Reservation {
	int numService;
	int numTable;
	public ReservationRestaurant(int jour, int mois,int numService, int numTable) {
		super(jour, mois);
		this.numService = numService;
		this.numTable = numTable;
		// TODO Auto-generated constructor stub
	}

}
