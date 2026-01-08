import modell.Feladat;

public class Main {
    /*a program adjon össze 2 matrixot az eredmény is matrix legyen,
    külön metódus töltse fel és jelenítse meg a matrixokat,
    feltöltés során [-10;25] intervallumból válasszunk számokat
    *
    * tesztelés:
    az összeadandó mátrixot mérete megfelelő:
    a kiirandó mátrix nem tartalmaz null elemet*/
    public static void main(String[] args) {
        Feladat feladat = new Feladat(3,4);
        feladat.feltolt(6, 12);
    }

}
