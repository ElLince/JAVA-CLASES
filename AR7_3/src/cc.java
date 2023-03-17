
public class cc {
    String dni;
    public String nombre;
    private double saldo;
    
    cc(String dni, String nombre){
     this(dni,nombre,0);
    }
/* 
        CuentaCorriente2(String dni, String nombre){
        this.dni = dni;
        this.nombre = nombre;
        saldo = 0;
     }
*/
    cc(String dni, double saldo){
        this.dni = dni;
        this.saldo = saldo;
        this.nombre = "Sin asignar";
    }
    cc(String dni, String nombre, double saldo){
        this.dni = dni;
        this.nombre = nombre;        
        this.saldo = saldo;

    }

    boolean egreso(double cant){
        boolean operacionPosible;
        if (saldo >= cant){
            saldo -= cant;
            operacionPosible = true;
        }else{ 
            System.out.println("No hay dinero suficiente: ");
            operacionPosible = false;
        }
        return (operacionPosible);
        }
    void ingreso(double cant){
        saldo+=cant;
    }
    void mostrarInformacion(){
        System.out.println("Nombre: " + nombre + " ");
        System.out.println("Dni: " + dni + " ");
        System.out.println("Saldo: " + saldo + " euros ");
    }
}
