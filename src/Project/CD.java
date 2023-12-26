package Project;

public class CD extends Produit{
	private String titre;
	private String auteur;
	private double prix;
	
	public CD(int idProduit, String titre, String auteur, double prix) {
		super(idProduit);
		this.titre = titre;
		this.auteur = auteur;
		this.prix = prix;
	}
	
	@Override
	public void print() {
		System.out.println(this.titre + ", Auteur : " + this.auteur +  ", pour le prix exceptionnel de : " + this.prix);
	}
}