import java.util.Scanner;

public class AlgoritmoVintedoisAl {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String password = "123";

        int contador = 0;
        float val = 0;
        float parce = 0;
        while (contador < 3) {
            IO.println("//----------------------------------------------------------------//");
            System.out.println("Informe sua senha: ");
            String senha = scan.nextLine();
            contador++;
            if (password.equalsIgnoreCase(senha)) {
                IO.println("----------------------------------------------------------------");
                IO.println("Seu valor máximo de empréstimo é R$ 20.000 com 1% juros/mês em até 10 parcelas");
                IO.println("----------------------------------------------------------------");
                System.out.println("Informe o Valor Desejado: ");
                val = scan.nextFloat();
                if (val <= 20000) {
                    System.out.println("Informe em Quantas Parcelas Serão Divididas: ");
                    parce = scan.nextFloat();
                    if (parce <= 10) {
                        System.out.printf("Valor a ser Pago Mensalmente é R$ %.2f ",
                                (val * (parce / 100) + val) / parce);
                        IO.println("");
                        IO.println("Parabéns, seja Bem vindo ao BancoJS");
                        IO.println("//----------------------------------------------------------------//");
                        break;
                    } else if (parce > 10 || parce < 0) {
                        IO.println("valor Inválido, tente novamente");
                        break;
                    }
                } else if (val > 20000) {
                    IO.println("Valor Inválido, tente novamente");
                    break;
                }
            } else if (contador >= 3) {
                IO.println("Cartão Bloquado, Procure um Gerente");
            } else {
                IO.println("Senha Incorreta, tente novamente");
            }
        }
    }
}