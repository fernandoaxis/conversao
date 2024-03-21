package calculadora;

import dominio.PolarConv;
import dominio.RetangularConv;
import java.util.Scanner;

public class calculadoraNC {
    public static void main(String[] args) {
    	 Scanner scanner = new Scanner(System.in);
         System.out.println("01 - Polar para Retangular | 02 - Retangular para Polar");

         int opcao = scanner.nextInt();
         if(opcao == 1) { 
             System.out.print("Digite a magnitude (r): ");
             double polarMagnitude = scanner.nextDouble();
             System.out.print("Digite o ângulo em graus (θ): ");
             double polarAngulo = scanner.nextDouble();

             PolarConv polar = new PolarConv(polarMagnitude, polarAngulo);
             double[] coordenadaRetangular = polar.toRectangular();

             System.out.println("Coordenadas retangulares: ");
             System.out.println("x: " + coordenadaRetangular[0]);
             System.out.println("y: " + coordenadaRetangular[1]);
         } else if(opcao == 2) { 
             System.out.print("Digite o valor de A: ");
             double valorA = scanner.nextDouble();
             System.out.print("Digite o valor de B: ");
             double valorB = scanner.nextDouble();

             RetangularConv conv = new RetangularConv(valorA, valorB);
             System.out.println("Iniciando a conversão...\n");

             conv.calcularAmplitude();
             conv.calcularAngulo();

             System.out.println("Z = " + conv.getAmplitude() + "<" + Math.toDegrees(conv.getAngulo()) + " graus");
         } else {
             System.out.println("Opção inválida");
         }

         scanner.close();
    	
    	
    	

    }
}