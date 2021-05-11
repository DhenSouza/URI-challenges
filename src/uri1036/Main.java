package uri1036;

import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Scanner leia = new Scanner(System.in);
        double R1, R2;

        System.out.println("Informe o valor de A: ");
        double A = leia.nextDouble();

        System.out.println("Informe o valor de B: ");
        double B = leia.nextDouble();

        System.out.println("Informe o valor de C: ");
        double C = leia.nextDouble();

        if (A == 0) {
            System.out.println("Impossivel Calcular");
        } else {
            double delta = (B * B) + (-4 * (A * C));
            if (delta < 0) {
                System.out.println("Não existe raiz Real!");
            }

            if (delta > 0) {
                R1 = (-B + Math.sqrt(delta)) / (2 * A);
                R2 = (-B - Math.sqrt(delta)) / (2 * A);
                System.out.printf("R1 = %.5f" , R1);
                System.out.printf("\nR2 = %.5f" , R2);
            }
        }


    }
}