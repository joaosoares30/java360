public class AlgoritmoQuatorzeAl {
    public static void main(String[] args) {
        int num = Integer.parseInt(IO.readln("Informe um número 1 - 3: "));
        switch (num) {
            case 1:
                IO.println("Jogo Iniciado");
                break;
            case 2: IO.println("Suas vidas Estão Acabando");
            break;
                case 3: IO.println("Game Over");
                break;
            default:
                IO.println("Número invalido");
                break;
        }
    }}
