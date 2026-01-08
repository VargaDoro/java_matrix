package modell;

public class Feladat {
    private int sor, oszlop;
    private int[][] matrixA, matrixB;

    public Feladat(int sor, int oszlop){
        this.sor = sor;
        this.oszlop = oszlop;
        matrixA = new int[sor][oszlop];
        matrixB = new int[sor][oszlop];
        feltolt();
    }
    
    public void feltolt(){
        feltoltA();
    }

    private void feltoltA() {
    }

    public void osszead(){
        //itt nem lehet null
    }
}
