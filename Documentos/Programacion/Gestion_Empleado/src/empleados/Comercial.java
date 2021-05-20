package empleados;

//Herencia de los elementos de la clase Empleado para clase Comercial
public class Comercial extends Empleado {
    
    //Metodo de la clase Repartidor para realizar la operacion de aplicar PLUS
    public void ComercialPlus(){
        
        //Solicitar al usuario la comision
        System.out.print("\nIngresa la comision: ");
        comision = dato.nextDouble();
        
        //Condicion para aplicar PLUS a un empleado comercial
        if ((edad > 30) && (comision > 200)){
            operacion = salario + plus;
        }else{
            operacion = salario;
        }
    }
    
}
    
