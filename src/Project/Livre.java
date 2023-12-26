package Project;

public class Livre extends Produit {
	private String titre;
	private String auteur;
	private String ISBN;

	public Livre(int idProduit, String titre, String auteur, String ISBN) {
		super(idProduit);
		this.titre = titre;
		this.auteur = auteur;
		this.ISBN = ISBN;
	}


	@Override
	public void print() {
		System.out.println(this.titre + ", " + this.auteur + ", (ISBN : " + this.ISBN + ")");
	}
}
