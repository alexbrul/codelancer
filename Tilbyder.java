
import java.util.ArrayList;

class Tilbyder extends Bruker{

	ArrayList<Integer> prosjekter;


	private Tilbyder(String brukernavn, String navn, 
			int ID, int rettighet, ArrayList<Integer> pro){

		super(brukernavn, navn, ID, rettighet);

		this.prosjekter = pro;

	}


	


}
