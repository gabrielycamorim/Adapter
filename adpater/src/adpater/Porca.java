package adpater;

public class Porca {

	    private double porcaSextavada;

	    public Porca(double porcaSextavada) {
	        this.porcaSextavada = porcaSextavada;
	    }

	    public double getPorcaSextavada() {
	        return porcaSextavada;
	    }

	    public boolean fits(ParafusoSextavado sex) {
	        boolean result;
	        result = (this.getPorcaSextavada() >= sex.getParafusoSextavado());
	        return result;
	    }
	}
