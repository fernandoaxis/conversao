package dominio;

public class RetangularConv {
    private double amplitude;
    private double angulo;
    private double a;
    private double b;

    public RetangularConv(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void calcularAmplitude() {
        double raizResultadoA = Math.pow(a, 2);
        double raizResultadoB = Math.pow(b, 2);
        double resultadoSoma = raizResultadoA + raizResultadoB;
        amplitude = Math.sqrt(resultadoSoma);
    }

    public void calcularAngulo() {
        angulo = Math.atan(b / a);
    }

    public double getAmplitude() {
        return amplitude;
    }

    public void setAmplitude(double amplitude) {
        this.amplitude = amplitude;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}