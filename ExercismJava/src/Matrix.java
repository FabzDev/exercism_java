import java.sql.SQLOutput;
import java.util.Arrays;

class Matrix {
    String[] rowsAsString;

    Matrix(String matrixAsString) {
        rowsAsString = matrixAsString.replaceAll(" ", "").split("\\s");
    }

    int[] getRow(int rowNumber) {
//      PROGRAMACIÓN IMPERATIVA
//        String tempStringRow = rowsAsString[rowNumber - 1];
//        char[] charArray = tempStringRow.toCharArray();
//        int[] row = new int[charArray.length];
//        for (int i = 0; i < charArray.length; i++) {
//            row[i] = charArray[i] - 48;
//        }
//        return row;

        String tempStringRow = rowsAsString[rowNumber - 1];
        return tempStringRow.chars()
                .map(c -> c - 48)
                .toArray();
    }

    int[] getColumn(int columnNumber) {
        return Arrays.stream(rowsAsString)
                .mapToInt(strRow -> strRow.charAt(columnNumber - 1) - 48)
                .toArray();
    }

    public static void main(String[] args) {
        Matrix m = new Matrix("89 1903 3\n18 3 1\n9 4 800");
//        for (int i : m.getRow(3))
//            System.out.println(i);
        for (String i : m.rowsAsString)
            System.out.println(i);

//        for (int i : m.getColumn(1))
//            System.out.println(i);
    }
}
