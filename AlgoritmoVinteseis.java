public class AlgoritmoVinteseis {
    public void main(){
        // definindo o vetor de 5 posições
        int[] numeros = new int[5];
        int soma = 0;

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = Integer.parseInt(IO.readln("entre com o número: "));
        }

        for(int i = 0; i < numeros.length; i++){
            soma = soma + numeros[i];
        }

        IO.println("A soma de todos os números é = " + soma);

    }
}
