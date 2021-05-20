
package empleados;

//Herencia de los elementos de la clase Empleado para clase Repartidor
public class Repartidor extends Empleado { 
    
    //Metodo de la clase Repartidor para realizar la operacion de aplicar PLUS
    public void RepartidorPlus(){
             //Condicion para aplicar PLUS a un empleado repartidor
                if((edad < 25) && (zona.endsWith("zona 3"))){
                    operacion = salario + plus;
                } else{
                    operacion = salario;
                }
            }
    
}
