package adpater;

public class Teste {
	 public static void main(String[] args) {
	       
	        Porca buraco = new Porca(5);
	        ParafusoSextavado sex = new ParafusoSextavado(5);
	        if (buraco.fits(sex)) {
	            System.out.println("A porca entra no parafuso sextavado");
	        }

	        ParafusoQuadrado quadradoParafuso = new ParafusoQuadrado(2);
	  
	        ParafusoQuadradoAdapter quadradoParafusoAdapter = new ParafusoQuadradoAdapter(quadradoParafuso);
	       
	        if (buraco.fits(quadradoParafusoAdapter)) {
	            System.out.println("Parafuso quadrado encaixa");
	        }
	    }
}
