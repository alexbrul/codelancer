import java.util.ArrayList;

abstract class Bruker{

	String brukernavn;
	String navn;
	int id;
	protected int rettighet;


	protected Bruker(String brukernavn, String navn, int ID, int rettighet){
		this.brukernavn = brukernavn; this.navn = navn; this.id = ID;
		this.rettighet = rettighet;

	
	}

	public int sjekkRettighet(){
		return rettighet;
	
	}

	public String hentBrukernavn(){
		return brukernavn;
	}

	public int hentID(){
		return id;
	}


}
