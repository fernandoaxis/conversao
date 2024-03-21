package calculadora;

import dominio.RetangularConv;
import java.util.Scanner;

public class calculadoraNC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double valorA = scanner.nextDouble();
        System.out.print("Digite o valor de B: ");
        double valorB = scanner.nextDouble();

        RetangularConv conv = new RetangularConv(valorA, valorB);

        System.out.println("Iniciando a conversão...\n");

        conv.calcularAmplitude();
        conv.calcularAngulo();

        System.out.println("Z = " + conv.getAmplitude() + "<" + conv.getAngulo() + " graus");

        scanner.close();
    }
}