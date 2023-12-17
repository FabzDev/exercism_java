import java.util.HashMap;
import java.util.stream.IntStream;

class ScrabbleV2 {
    private final String word;
    private int score;
    private HashMap<Integer, Integer> lookup = new HashMap<>();
    public String[] strings = new String[]{
            "AEIOULNRST",
            "DG",
            "BCMP",
            "FHVWY",
            "K",
            "JX",
            "QZ"
    };
    public Integer[] values = new Integer[]{1, 2, 3, 4, 5, 8, 10};

    public void fillMap() {
        IntStream.range(0, strings.length)
                .forEach(i -> strings[i].chars().forEach(letterCode -> lookup.put(letterCode, values[i])));
    }

    public ScrabbleV2(String word) {
        this.word = word.toUpperCase();
        fillMap();
    }

    public int getScore(){
        return word.chars().reduce(0, (score, letterCode) -> score + lookup.get(letterCode));
    }

    public static void main(String[] args) {
        ScrabbleV2 scv2 = new ScrabbleV2("cabbage");
        System.out.println(scv2.getScore());
    }
}