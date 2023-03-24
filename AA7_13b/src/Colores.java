import java.util.Arrays;
import java.util.Random;

import javax.sound.sampled.SourceDataLine;

public class Colores {
    String[] colores = { "rojo","verde", "azul", "amarillo" };
    String[] col= new String[0];
    Colores(){

    }

    void rellenaColores(int p1){
        for (int i = 0; i < p1; i++) {
            int r = new Random().nextInt(colores.length);
            System.out.println(r);
            col = Arrays.copyOf(col, col.length + 1);
            col[col.length - 1] = colores[r];
        }
        System.out.println(Arrays.toString(col));
    }
}