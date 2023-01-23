package afpaJava_230123_projet_generique_1;

import java.util.Random;


import java.util.ArrayList;

public class TestGenericite {

	public static void main(String[] args) {
		Random random = new Random();
		
		
		// création liste de produits
		ArrayList<Produit> listProd= new ArrayList<Produit>();
		GenericClass<Produit, Integer> genericProduit = new GenericClass<>();

		String listeNomsProduits[] = {"Pantoufles", "Chaussons", "Chaussettes", "Guêtres   ", "Collants  ", "Bas       ", "Slip     ", "Culotte   ", "Bonnet  ", "Caleçon   ", "Boxer    "};
		int index = 0;
		for (String produitString: listeNomsProduits) {
			genericProduit.save(new Produit(index++, produitString), listProd);
		}
		
		
		
		// génération liste de clients
		ArrayList<Client> listCl=new ArrayList<Client>();
		GenericClass<Client,Integer> genericClient = new GenericClass<>();
		String listeNomsClients[] = {"Richard", "Gérard", "Kass", "Laura", "Noémie", "Julie", "Océane", "Marvin", "Kylian", "Toto", "Michel"};
		index = 0;
		for (String nomClientString: listeNomsClients) {
			genericClient.save(new Client(index++, nomClientString), listCl);
		}
		
		
		
		// génération liste de commandes
		ArrayList<Commande> listeCommandes = new ArrayList<Commande>();
		GenericClass<Commande, Integer> genericCommande = new GenericClass<>();
		for (int i=0; i<20; i++) {
			genericCommande.save(new Commande(i, listCl.get(random.nextInt(listCl.size()-1)), listProd.get(random.nextInt(listProd.size()-1)), random.nextInt(1, 20)), listeCommandes);
		}
		
				
		
		
		
		System.out.println("Liste produits :");
		genericProduit.afficher(listProd);
		System.out.println("---");
		
		
		System.out.println("Liste clients :");
		genericClient.afficher(listCl);
		System.out.println("---");
		
		
		System.out.println("Liste commandes :");
		genericCommande.afficher(listeCommandes);
		System.out.println("---");
		
		System.out.println("findOne(id, list):");
		genericCommande.findOne(3, listeCommandes);
		genericClient.findOne(3, listCl);
		genericProduit.findOne(3, listProd);
		System.out.println("---");
		
		
		
		System.out.println("deleteOne(id, list):");
		genericClient.deleteOne(5, listCl);
		genericClient.afficher(listCl);
		genericProduit.deleteOne(5, listProd);
		genericProduit.afficher(listProd);
		genericCommande.deleteOne(5, listeCommandes);
		genericCommande.afficher(listeCommandes);
		
		
		
	}

}
