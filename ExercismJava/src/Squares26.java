import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Squares26 {

    private List<Integer> numeros = new ArrayList<>();
    private Integer[] sums = {1,2,10,4,5};
    private void fillListOfNumbers(int count) {
        IntStream.range(1,count+1).forEach(number -> numeros.add(number));
//        for(int i = 1; i <= count; i++){numeros.add(i);}
        Stream<Integer> integerStream = Arrays.stream(sums).map(n -> n * 2);
        List<Integer> collect = integerStream.collect(Collectors.toList());
        System.out.println(collect);
    }

    private List<Integer> getNumeros() {
        return numeros;
    }

    public static void main(String[] args) {
        Squares26 sqr = new Squares26();
        sqr.fillListOfNumbers(15);
        System.out.println(sqr.getNumeros());
    }
}
