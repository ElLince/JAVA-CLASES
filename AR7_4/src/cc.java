    public class cc {
        static private String nombreBanco = " International Java Bank";
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
        static void setBanco(String nuevoNombre){
            nombreBanco = nuevoNombre;
        }
        static String getBanco(){
            return nombreBanco;
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
            System.out.println("Banco " + nombreBanco );
        }
    }

    