package dominio;

public class PolarConv {
	
	   private double magnitude;
	    private double anguloGrau;

	    public PolarConv(double magnitude, double angulograu) {
	        this.magnitude = magnitude;
	        this.anguloGrau = angulograu;
	    }

	    public double[] paraRetangular() {
	        double AngulosRadianos = Math.toRadians(anguloGrau);
	        double x = magnitude * Math.cos(AngulosRadianos);
	        double y = magnitude * Math.sin(AngulosRadianos);
	        
	        return new double[]{x, y};
	    }
	}
	
