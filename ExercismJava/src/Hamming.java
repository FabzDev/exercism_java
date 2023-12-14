import java.util.stream.IntStream;

public class Hamming {
    private final String leftStrand;
    private final String rightStrand;
    private int hamming = 0;


    public Hamming(String leftStrand, String rightStrand) {
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("strands must be of equal length");
        }
    }

    public int getHammingDistance() {
        for (int i = 0; i < leftStrand.length(); i++) {
            if (leftStrand.charAt(i) != rightStrand.charAt(i)) {
                hamming++;
            }
        }
        return hamming;
    }

    public int getHammingDistanceIntStreamFilter() {
        return (int) IntStream.range(0, leftStrand.length())
                .filter(i -> leftStrand.charAt(i) != rightStrand.charAt(i))
                .count();
    }

    public int getHammingDistanceIntStreamMap() {
        return IntStream.range(0, leftStrand.length())
                .map(i -> leftStrand.charAt(i) != rightStrand.charAt(i) ? 1 : 0)
                .sum();
    }

    public int getHammingDistanceIntStreamReduce(){
        return IntStream.range(0,leftStrand.length())
                .reduce(0,(hamcount,index) -> hamcount + (leftStrand.charAt(index) != rightStrand.charAt(index) ? 1 : 0));
    }

    public static void main(String[] args) {
        Hamming hamming = new Hamming("GT", "TG");
        System.out.println(hamming.getHammingDistanceIntStreamReduce());
    }
}