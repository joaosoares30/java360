public class AlgoritmoVintequaroAl {
    public void main(){
        int[] num = new int[5];
        for (int i = 0; i < num.length; i++){
            num[i] = Integer.parseInt(IO.readln("Entre com o número: "));
        }
         for (int i = 0; i < num.length; i++){
            IO.println("váriavel " + (i+1) + "=" + num[i]);
        }
    }
}
