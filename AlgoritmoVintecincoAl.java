public class AlgoritmoVintecincoAl {
    public void main(){
        int[] numeros = new int[5];

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = Integer.parseInt(IO.readln("entre com o número: "));
        }
        for(int i = 0; i < numeros.length; i++){
            IO.println("O dobro da posição " + (i+1) + " = " + (numeros[i] * 2));
        }

    }
}


