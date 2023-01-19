public class RecorridoArray {
    public static void main(String[] args){

        int[] a = {2, 4, 6, 8, 10};

        int suma = 0;

        for (int i = 0; i < a.length; i++) {

        suma += a[i];
        }
        return suma;
    }
}
