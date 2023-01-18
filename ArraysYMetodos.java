public class ArraysYMetodos {
    public static void m(int x) {
        int result = x + 1;
    }

    public static void main(String[] args) {
        int x = 1;
        int valorInicial = x;
        m(x);
        if(x != valorInicial) {
            System.out.println("El valor de x ha cambiado.");
        } else {
            System.out.println("El valor de x no ha cambiado.");
        }
    }
}