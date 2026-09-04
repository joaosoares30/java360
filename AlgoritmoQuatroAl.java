
public class AlgoritmoQuatroAl {

    void main() {
        int diaDaSemana = 3;
        String nomeDoDia;
        switch (diaDaSemana) {
            case 1:
                nomeDoDia = "Segunda-feira";
                break;
            case 2:
                nomeDoDia = "Terça-feira";
                break;
            case 3:
                nomeDoDia = "Quarta-feira";
                break;
            default:
                nomeDoDia = "Dia inválido";
        }
        System.out.println(nomeDoDia);


        
        switch (diaDaSemana) {
            case 1 ->
                IO.println("Segunda feira");
            case 2 ->
                IO.println("Terça feira");
            case 3 ->
                IO.println("Quarta feira");
            default ->
                IO.println("Dia Invalido");
        }
    }
}
