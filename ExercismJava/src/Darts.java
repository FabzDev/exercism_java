public class Darts {
    public int score(double xOfDart, double yOfDart) {
        double radio = Math.sqrt((xOfDart * xOfDart) + (yOfDart * yOfDart));

        if(radio <= 1){
            return 10;
        } else if(radio <= 5){
            return 5;
        } else if(radio <= 10){
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Darts player1 = new Darts();
        System.out.println(player1.score(6,0));
    }
}
