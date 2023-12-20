import java.util.Arrays;
import java.util.List;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HandshakeCalculator {
    List<Character> binaryList;

    public void calculate(int number) {
        String binaryString = Integer.toBinaryString(number);
        IntStream.range(0, binaryString.length()).forEach(new IntConsumer() {
            @Override
            public void accept(int index) {
                System.out.println(index);
            }
        });
    }

    public static void main(String[] args) {
        HandshakeCalculator hs = new HandshakeCalculator();
        hs.calculate(30);
    }
}
