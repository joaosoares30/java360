public class AlgortimoVintenoveAl {
    public void main(){
        IO.println("Quantas vendas você fez esse ano?");
        int venda = Integer.parseInt(IO.readln());

        IO.println("Sua número de vendas anual é de " + venda);
        IO.println("Sua média mensal de vendas é de " + (venda/12));
    }
}
