import java.util.ArrayList;

abstract class Prosjekt{
	int id;
	ArrayList<String> kommentarer;
	int tilbyderId;
	Bruker tilbyder;
	int status;
	int rating;
		

	/* Hovedprosjekt. Leses inn fra database. To typer, hemmelig og aapent
	 *
	 * id = prosjektid
	 * kommentarer liste med kommentarer
	 * tilbyderid int brukes for aa hente tilbyder fra database
	 * int status - aapent, under arbeid, stengt, nedlagt, sooker hjelp
	 */
	public Prosjekt(int id, ArrayList<String> kommentarer, int tilbyderid, int rating, int status, String beskrivelse){

		this.id = id; this.kommentarer = kommentarer; this.tilbyderId = tilbyderid; this.rating = rating; this.status = status;
	
	}


	public void rate(int i){
		//Kalkuler rating
	
	}


}
