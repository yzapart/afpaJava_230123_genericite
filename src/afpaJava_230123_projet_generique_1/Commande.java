package afpaJava_230123_projet_generique_1;


public class Commande {
	private int id, quantite;
	private Client client;
	private Produit produit;
	
	
	public Commande(int id, Client client, Produit produit, int quantite) {
		this.id = id;
		this.client = client;
		this.produit = produit;
		this.quantite = quantite;
	}
	
	public Client getClient() {
		return client;
	}
	
	public int getId() {
		return id;
	}
	
	public Produit getProduit() {
		return produit;
	}
	
	public int getQuantite() {
		return quantite;
	}
	
	public String toString() {
		return id + "\t" + client.getNomCl() + "\t" + produit.getNom() + "\t" + quantite;
	}

}
