import java.util.Arrays;

public class Main {
    int[] tablaEnteros = new int[0];
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
    Main m = new Main();
    for (int i=0; i<10; i++){
        m.inserFinal(i+1);
    }
        System.out.println("tabla: "+ Arrays.toString(m.tablaEnteros));
    }
    void inserFinal(int nuevo){
        tablaEnteros = Arrays.copyOf(tablaEnteros, tablaEnteros.length+1);
        tablaEnteros[tablaEnteros.length-1] = nuevo;
    }
    
    
}

