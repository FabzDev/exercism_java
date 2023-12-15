import java.util.stream.IntStream;

public class Scrabble {
    private String word;

    public Scrabble(String word) {
        this.word = word.toUpperCase();
    }

    public int getValue(char ch) {
        return switch (ch) {
            case 'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T' -> 1;
            case 'D', 'G' -> 2;
            case 'B', 'C', 'M', 'P' -> 3;
            case 'F', 'H', 'V', 'W', 'Y' -> 4;
            case 'K' -> 5;
            case 'J', 'X' -> 8;
            case 'Q', 'Z' -> 10;
            default -> 0;
        };
    }

    public int getScore() {
        return IntStream.range(0, word.length())
                .reduce(0, (scoreCount, index) -> scoreCount + getValue(word.charAt(index)));
    }

    public static void main(String[] args){
         Scrabble sc = new Scrabble("FABIO");
         System.out.println(sc.getScore());
    }
}