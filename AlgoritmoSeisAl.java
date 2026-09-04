public class AlgoritmoSeisAl {
    void main() {
        String nome = (IO.readln("Informe seu nome: "));
        String end = IO.readln("Seu endereço: (CIDADE-UF) ");
        String tel = IO.readln("Seu telefone: ");

        System.out.printf("Informações do %S: %S, %s%n.", nome, end, tel);

    }
}
