public class AlgoritmoVinteseteAl {
    public void main(){
        int[] numeros = new int[5];

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = Integer.parseInt(IO.readln("entre com o número: "));
        }

        for(int i = numeros.length - 1; i >= 0; i--){
            IO.println("Posição " + (i+1) + " = " + numeros[i]);
        }

    }
}