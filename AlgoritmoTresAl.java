public class AlgoritmoTresAl {
    void main(){
        int chave = Integer.parseInt(IO.readln("Informe o número da chave: "));

        if (chave == 7){
            IO.println("Porta Verde-Água se Abre.");
        } else {
            IO.println("A porta de cobre se abre.");
        }

        String classe = IO.readln("Escolha sua classe: guerreiro, mago, ladino ou clerigo: ");

        if(classe.equals("guerreiro")){
            IO.println("A porta do escudo se abre.");
        } else if (classe.equals("mago")){
            IO.println("Porta do livro se abre.");
        } else if (classe.equals("ladino")){
            IO.println("A porta da chave se abre.");
        } else {
            IO.println("A porta da espada se abre, por padrão.");
        }

        int nivel = Integer.parseInt(IO.readln("Nível: "));
        boolean temChave = IO.readln("Tem a chave? (s/n): ").equals("s");
        if (nivel >= 5 && temChave){
            IO.println("Guardião se curva. Pode passar.");
        } else {
            IO.println("Guardião se nega com a cabça.");
        }

        String simbolo = IO.readln("Pise em qual simbolo? ");
        String resultado = switch (simbolo){
            case "sol" -> "O selo aquece sob seus pés.";
            case "lua" -> "O selo esfria e brilha em prata. ";
            case "estrela" -> "O selo ergue uma escada de luz";
            default -> "O selo permanece em silêcio.";
        };
        IO.println(resultado);
    }
     
}
