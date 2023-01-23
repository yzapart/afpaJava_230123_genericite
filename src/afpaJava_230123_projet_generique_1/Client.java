package afpaJava_230123_projet_generique_1;

public class Client {
	private int numCl;
	private String nomCl;
	
	public Client(int numCl, String nomCl) {
		this.numCl = numCl;
		this.nomCl = nomCl;
	}
	
	public int getNumCl() {
		return numCl;
	}
	
	public void setNumCl(int numCl) {
		this.numCl = numCl;
	}
	
	public String getNomCl() {
		return nomCl;
	}
	
	public void setNomCl(String nomCl) {
		this.nomCl = nomCl;
	}
	
	@Override
	public String toString() {
		return "Client [numCl=" + numCl + ", nomCl=" + nomCl + "]";
	}
	
	
}
