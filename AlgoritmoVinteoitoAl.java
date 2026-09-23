public class AlgoritmoVinteoitoAl {
    public void main(){
        int[] numeros = new int[5];

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = Integer.parseInt(IO.readln("entre com o número: "));
        }

        IO.println("=== NÚMEROS PARES ENCONTRADOS ===");
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] % 2 == 0){
                IO.println("Posição " + (i+1) + " = " + numeros[i]);
            }
        }

    }
}