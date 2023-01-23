package afpaJava_230123_projet_generique_1;

import java.util.ArrayList;

public class GenericClass<T, U> {
	
	public void save(T o, ArrayList<T> list) {
		list.add(o);
	} 
	
	public void afficher(ArrayList<T> list) {
		for (T t : list) {
			System.out.println(t.toString());
		}
	}
	
	public void findOne(U id, ArrayList<T> list) {
		for(T e: list)  {
			if (e instanceof Client) {
				// on sait que getNumCl renvoie un integer :
				if (((Client) e).getNumCl() == ((Integer) id)) {
					System.out.println(e.toString());
					}
			}
			
			
			if (e instanceof Commande) {
				if (((Commande) e).getId() == ((Integer) id)) {
					System.out.println(e.toString());
				}
			}
		
			if (e instanceof Produit) {
				if (((Produit) e).getNum() == ((Integer) id)) {
					System.out.println(e.toString());
				}
			}
		}
	}
	
	
	public void deleteOne(U id, ArrayList<T> list) {
		for (T e: list) {
			if (e instanceof Client) {
				// on sait que getNumCl renvoie un integer :
				if (((Client) e).getNumCl() == ((Integer) id)) {
					list.remove(e);
					System.out.println("Client n° " + ((Client) e).getNumCl() + " supprimé.");
					break;
				}
			}
			
			if (e instanceof Commande) {
				if (((Commande) e).getId() == ((Integer) id)) {
					list.remove(e);
					System.out.println("Commande n° " + ((Commande) e).getId() + " supprimée.");
					break;
				}
			}
			
			if (e instanceof Produit) {
				if (((Produit) e).getNum() == ((Integer) id)) {
					list.remove(e);
					System.out.println("Produit n° " + ((Produit) e).getNum() + " supprimé.");
					break;
				}
			}
			
		}
	}
	
	
	

}