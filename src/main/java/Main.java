import modell.Feladat;

public class Main {
    public static void main(String[] args) {

        Feladat f = new Feladat(3, 4);

        System.out.println("Matrix A:");
        f.kiir(f.getMatrixA());

        System.out.println("\nMatrix B:");
        f.kiir(f.getMatrixB());

        System.out.println("\nA + B:");
        f.kiir(f.osszead());
    }
}
