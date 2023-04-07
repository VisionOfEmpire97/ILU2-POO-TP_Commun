package model;

public class Restaurant {
	private int numService;
	private int numTable; ///???? quels attributs
	
	public Restaurant() {
		// TODO Auto-generated constructor stub
	}
	
	
	/////// CLASSE INTERNE ///////
	private static class Table{
		int nbChaises;
		
		private Table(int nbChaises) {
			this.nbChaises = nbChaises;
		}
	}
	///// FIN CLASSE INTERNE /////
}
