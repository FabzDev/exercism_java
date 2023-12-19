import java.util.stream.IntStream;

public class Squares26 {
    private int computeSquareOfSumTo(int input) {
        int sum = IntStream.range(1, input + 1).reduce(0, Integer::sum);
        return sum * sum;
    }

    private int computeSumOfSquaresTo(int input) {
        return IntStream.range(1, input + 1).reduce(0, (acum, num) -> acum + num * num);
    }

    private int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

    public static void main(String[] args) {
        Squares26 sqr = new Squares26();
        System.out.println(sqr.computeDifferenceOfSquares(10));

    }
}
