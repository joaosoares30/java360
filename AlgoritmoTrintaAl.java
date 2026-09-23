import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlgoritmoTrintaAl {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número inteiro: ");
            int n = scanner.nextInt();

            if (n < 0) {
                System.out.println("Fatorial não é definido para números negativos.");
                scanner.close();
                return;
            }

            List etapas = new ArrayList<>();

            long acumulado = 1;
            etapas.add(acumulado);
            for (int i = 1; i <= n; i++) {
                acumulado *= i;
                etapas.add(acumulado);
            }

            System.out.println("\n--- Etapas dos Cálculos Parciais ---");
            for (int i = 0; i < etapas.size(); i++) {
                if (i == 0) {
                    System.out.printf("Base: 0! = %d%n", etapas.get(i));
                } else {
                    System.out.printf("Multiplicando por %d: etapa %d! = %d%n", i, i, etapas.get(i));
                }
            }

            System.out.println("-----------------------------------");
            System.out.printf("Resultado final de %d! = %d%n", n, etapas.get(etapas.size() - 1));
        }
    }