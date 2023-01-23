package afpaJava_230123_projet_generique_1;

public class Produit {
	private int num;
	private String nom;
	
	
	public int getNum() {
		return num;
	}
	
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public Produit(int num, String nom) {
		super();
		this.num = num;
		this.nom = nom;
	}
	
	public Produit() {
		super();
	}
	@Override
	public String toString() {
		return "Produit [num=" + num + ", nom=" + nom + "]";
	}
	

}
