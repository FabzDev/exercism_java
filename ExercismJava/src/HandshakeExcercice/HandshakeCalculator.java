package HandshakeExcercice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HandshakeCalculator {
    List<Signal> sc = new ArrayList<>();

    public List<Signal> calculate(int number) {
        String strBinary = (Integer.toBinaryString(number).length() == 5) ? Integer.toBinaryString(number) : ("0" + Integer.toBinaryString(number));
        String formattedStr = String.format("%09d", Integer.valueOf(strBinary));
        String formattedStr2 = formattedStr.substring(formattedStr.length()-5);
        for (int i = formattedStr.length() - 1; i >= 0; i--) {
            if (i == 4) {
                if (formattedStr2.charAt(i) == '1')
                    sc.add(Signal.WINK);
            } else if (i == 3) {
                if (formattedStr2.charAt(i) == '1')
                    sc.add(Signal.DOUBLE_BLINK);
            } else if (i == 2) {
                if (formattedStr2.charAt(i) == '1')
                    sc.add(Signal.CLOSE_YOUR_EYES);
            } else if (i == 1) {
                if (formattedStr2.charAt(i) == '1')
                    sc.add(Signal.JUMP);
            } else if (i == 0) {
                if (formattedStr2.charAt(i) == '1') {
                    Collections.reverse(sc);
                }
            }
        }
        return sc;
    }

    public static void main(String[] args) {
        HandshakeCalculator hsc = new HandshakeCalculator();
        System.out.println(hsc.calculate(24 ).toString());
    }
}
