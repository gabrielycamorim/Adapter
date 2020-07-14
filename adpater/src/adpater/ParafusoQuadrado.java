package adpater;

public class ParafusoQuadrado {
	private double largura;

    public ParafusoQuadrado(double largura) {
        this.largura = largura;
    }

    public double getLargura() {
        return largura;
    }

    public double getParafuso() {
        double result;
        result = Math.pow(this.largura, 2);
        return result;
    }
}
