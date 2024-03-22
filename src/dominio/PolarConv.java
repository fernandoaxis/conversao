package dominio;

public class PolarConv {
	
	   private double magnitude;
	    private double anguloGrau;

	    public PolarConv(double magnitude, double angulograu) {
	        this.magnitude = magnitude;
	        this.anguloGrau = angulograu;
	    }

	    public double[] toRectangular() {
	        double angleInRadians = Math.toRadians(anguloGrau);
	        double x = magnitude * Math.cos(angleInRadians);
	        double y = magnitude * Math.sin(angleInRadians);
	        
	        return new double[]{x, y};
	    }
	}
	
