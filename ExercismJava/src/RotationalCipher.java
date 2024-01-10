import java.util.stream.IntStream;

class RotationalCipher {
    private final int shiftKey;

    public RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    public String rotate(String str) {
        StringBuilder sb = new StringBuilder();
        IntStream.range(0, str.length()).map(index -> str.charAt(index)).forEach(ch -> sb.append(getChar((char) ch)));
        return sb.toString();
    }

    public Character getChar(Character c) {
        int absCode = c + shiftKey;
        if (c >= 65 && c <= 90) {
            return (char) (absCode > 90 ? absCode % 90 + 64 : absCode);
        } else if (c >= 97 && c <= 122){
            return (char) (absCode > 122 ? absCode % 122 + 96 : absCode);
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        RotationalCipher rc = new RotationalCipher(13);
        System.out.println(rc.rotate("The quick brown fox jumps over the lazy dog."));
    }
}
