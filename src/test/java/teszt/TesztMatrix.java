package teszt;

import static org.junit.jupiter.api.Assertions.*;

import modell.Feladat;
import org.junit.jupiter.api.Test;

public class TesztMatrix {

    @Test
    void matrixMeretMegfelelo() {
        Feladat f = new Feladat(3, 4);

        assertEquals(3, f.getMatrixA().length);
        assertEquals(4, f.getMatrixA()[0].length);

        assertEquals(3, f.getMatrixB().length);
        assertEquals(4, f.getMatrixB()[0].length);
    }

    @Test
    void eredmenyMatrixNemTartalmazNullat() {
        Feladat f = new Feladat(3, 4);
        int[][] eredmeny = f.osszead();

        for (int i = 0; i < eredmeny.length; i++) {
            for (int j = 0; j < eredmeny[i].length; j++) {
                assertNotEquals(0, eredmeny[i][j],
                        "Az eredmény mátrix nem tartalmazhat 0-t!");
            }
        }
    }
}
