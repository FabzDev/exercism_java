import java.util.Arrays;
import java.util.stream.Stream;

class Matrix2 {
    String[] rowsAsString;

    Matrix2(String matrixAsString) {
        rowsAsString = matrixAsString.replaceAll(" ", "-").split("\\s");
    }

    int[] getRow(int rowNumber) {
        String tempStrRow = rowsAsString[rowNumber - 1];
        return Stream.of(tempStrRow.split("-")).mapToInt(Integer::parseInt).toArray();
    }

    int[] getColumn(int columnNumber) {
        return Arrays.stream(rowsAsString)
                .map(rawStrRow -> rawStrRow.split("-"))
                .mapToInt(rowStr -> Integer.parseInt(rowStr[columnNumber - 1]))
                .toArray();
    }

    public static void main(String[] args) {
        Matrix2 m = new Matrix2("1 2\n10 20");

//        for (int i : m.getRow(1))
//            System.out.println(i);

//        for (String i : m.rowsAsString)
//            System.out.println(i);

        for (int i : m.getColumn(2))
            System.out.println(i);
    }
}
