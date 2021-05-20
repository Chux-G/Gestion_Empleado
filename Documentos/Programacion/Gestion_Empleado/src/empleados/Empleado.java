package empleados;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Empleado {  //Clase Empleado Herencia
   
    // Deficinicion de las variables en la clase, las cuales se heredaran
    protected String nombre, zona;
    protected float salario, operacion;
    protected int edad, eleccion;
    protected double comision;
    protected final int plus = 300;
    Scanner dato = new Scanner(System.in);
    
    /*Metodo para solicitar los datos que dan valor a los atributos 
    a las clases que luego se heredaran de esta clase*/
    public void IngresoDatos(){
        
        System.out.print("\nIngresa el nombre: ");
        nombre = dato.nextLine();
        System.out.print("\nIngresa tu edad: ");
        edad = dato.nextInt();
        System.out.print("\nIngresa el salario: ");
        salario = dato.nextFloat();
        
    }
    
    //Metodo para que el empleado repartidor ingrese la zona
    public void IngresoZona(){
        System.out.print("\n\nIngrese la zona --> [ zona # ]: ");
        zona = dato.nextLine();
    }
    
    //Metodo para mostrar el resultado de la operacion del PLUS
    public void MostrarOperacion(){
        
     //Condicion para mostrar el resultado en caso de si o no aplicar el PLUS
     if(operacion != salario){
        JOptionPane.showMessageDialog(null, "Resultado final del PLUS: "+operacion+"$");
     }else{
         
         JOptionPane.showMessageDialog(null, "No se aplico ningun PLUS");
     }
     
    }
    
    /* Metodos Getter, Setter para mostrar en el metodo prinicipal variables con
    modificadores de acceso no publicos y en futuras ocasiones modificar algunos
    valores y establecerlos*/
    
    public String getNombre(){
        return nombre;
    }
    
    public String setNombre(String nombre){
        return nombre;
    }
    
    public int setEdad(int edad){
        return edad;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public float getSalario(){
        return salario;
    }
    
    public float setSalario(float salario){
        return salario;
    }
    
    public float getOperacion(){
        return operacion;
    }
    
    public double getComision(){
        return comision;
    }
    
    public double setComision(double comision){
        return comision;
    }
    
    public String getZona(){
        return zona;
    }
    
    public String setZona(String zona){
        return zona;
    }
    

}
