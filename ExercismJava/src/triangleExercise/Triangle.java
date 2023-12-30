package triangleExercise;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isTriangle(){
        return (a>0 && b>0 && c>0 && a+b>=c && b+c>=a && a+c>=b);
    }

    public String checkTriangle(){
        if(!isTriangle()){
            return "No es un triangulo";
        }
        if(a==b && a==c){
            return "Equilatero";
        } else if (a!=b && a!=c && b!=c){
            return "Escaleno";
        } else {
            return "Isoseles";
        }
    }

    public static void main(String[] args) {
        Triangle t = new Triangle(6,8,6);
        System.out.println(t.checkTriangle());
    }
}
