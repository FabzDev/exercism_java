package HandshakeExcercice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class HandshakeCalculator2 {
    List<Signal> sc = new ArrayList<>();

    public List<Signal> calculateHandshake(int number) {
        IntStream.range(0, Signal.values().length)
                .filter(bitIndex -> ((1 << bitIndex & number) > 0))
                .forEach(index -> sc.add(Signal.values()[index]));

        if ((16 & number) > 0)
            Collections.reverse(sc);

        return sc;
    }

    public static void main(String[] args) {
        HandshakeCalculator2 hsc = new HandshakeCalculator2();
        System.out.println(hsc.calculateHandshake(81).toString());
    }
}