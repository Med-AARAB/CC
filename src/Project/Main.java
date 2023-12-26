package Project;

public class Main {
	public static void main(String[] args) {
		Livre livre = new Livre(1, "Livre", "Oussama EL Negraz", "ISBM1");
		CD cd = new CD(2, "CD", "Oussama EL Negraz", 20.99);

		Produit prd1 = cd;
		prd1.print();

		Produit prd2 = livre;
		prd2.print();
		
		((Produit) prd1).print();
	}
}
