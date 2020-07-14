package adpater;

public class ParafusoQuadradoAdapter extends ParafusoSextavado {
	private ParafusoQuadrado pqd;

    public ParafusoQuadradoAdapter(ParafusoQuadrado pqd) {
        this.pqd = pqd;
    }

    @Override
    public double getParafusoSextavado() {
        double result;
        result = (Math.sqrt(Math.pow((pqd.getLargura() / 2), 2) * 2));
        return result;
    }
}
