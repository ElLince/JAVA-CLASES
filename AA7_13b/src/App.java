import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Colores c = new Colores();

        System.out.print("Elegir numero de colores ");
        int n=sc.nextInt();
        c.rellenaColores(n);
        
    }
}
