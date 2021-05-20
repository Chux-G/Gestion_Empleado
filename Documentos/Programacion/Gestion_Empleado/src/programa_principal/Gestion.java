package programa_principal;
import empleados.Comercial;//Importacion del packete en donde esta la clase Comercial
import empleados.Repartidor;//Importacion del packete en donde esta la clase Repartidor
import java.util.Scanner;
import javax.swing.JOptionPane;

//Programa Principal

public class Gestion {

    public static void main(String[] args) {
        
      int opcion; // Variable que determina el tipo de empleado [comercial/repartidor]
      Scanner lectura = new Scanner(System.in);
      
      //Declaracion de objetos para llamar los metodos de las clases hijas
      Comercial comercial = new Comercial();
      Repartidor repartidor = new Repartidor();
      
      //Solicitud del tipo de empleo
        System.out.print("\nQue tipo de trabajador eres [ 1 / 2 ]: "
                            + "1. Comercial / 2. Repartidor: ");
        opcion = lectura.nextInt();
        
        //Seleccion del dato insertado por el usuario
        switch(opcion){
            
            case 1 -> {
                
                /*Se utilizan los objetos para llamar a los metodos
                de la clase Comercial*/
                comercial.IngresoDatos();
                comercial.ComercialPlus();
                comercial.MostrarOperacion();
                
                /*Mostrar en pantalla los datos y la operacion realizada por
                pantalla al usuario*/
                JOptionPane.showMessageDialog(null,"Empleado: Comercial"+
                "\nEmpleado: "+comercial.getNombre()+"\nEdad: "
                +comercial.getEdad()+"\nSalario: "+comercial.getSalario()+
                "$"+"\nComision: "+comercial.getComision()+"$"+
                "\nValor Resultado del PLUS: "+comercial.getOperacion()+"$");
            }
            
            case 2 -> {
                
                /*Se utilizan los objetos para llamar a los metodos
                de la clase Repartidor*/
                repartidor.IngresoZona();
                repartidor.IngresoDatos();
                repartidor.RepartidorPlus();
                repartidor.MostrarOperacion();
                /*Mostrar en pantalla los datos y la operacion realizada por
                pantalla al usuario*/
                JOptionPane.showMessageDialog(null,"Empleado: Repartidor"
                + "\nNombre: "+repartidor.getNombre()+"\nEdad: "
                +repartidor.getEdad()+ "\nSalario: "+repartidor.getSalario()+"$"
                +"\nZona: "+repartidor.getZona()+"\nValor Resultado del "
                +"PLUS: "+repartidor.getOperacion()+"$");
            }
            
            //Mostrar en pantalla por dato insertado no valido
            default -> JOptionPane.showMessageDialog(null, "ERROR");
        }
        
        
    }
    
}
