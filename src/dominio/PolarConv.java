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

	    public static void main(String[] args) {
	        PolarConv polarCoord = new PolarConv(5.0, 45.0); 
	        
	        double[] rectangularCoord = polarCoord.toRectangular(); 
	        
	        System.out.println("Coordenadas retangulares: ");
	        System.out.println("x: " + rectangularCoord[0]);
	        System.out.println("y: " + rectangularCoord[1]);
	    }
	    
	}
	
