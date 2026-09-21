import java.util.Arrays;
import java.util.List;
public class AlgoritmoVinteumAl {
    void main() {
        List<Integer> num = Arrays.asList(45, 67, 89, 34, 23, 56, 78, 98, 45, 34);
        int soma = num.stream()
                    .mapToInt(Integer::intValue)
                    .sum();
        IO.println("Soma: " + soma);
    }
}