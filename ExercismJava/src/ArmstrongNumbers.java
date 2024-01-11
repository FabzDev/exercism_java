class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int digits = numberToCheck == 0 ? 1 : (int) Math.log10(numberToCheck) + 1;
        int result = Integer.toString(numberToCheck)
                .chars()
                .map(ch -> (int) Math.pow(ch - 48, digits))
                .peek(System.out::println)
                .reduce((sum, n) -> sum += n)
                .getAsInt();
        return result == numberToCheck;
    }

    public static void main(String[] args) {
        ArmstrongNumbers an = new ArmstrongNumbers();
        System.out.println(an.isArmstrongNumber(0));
    }

}
