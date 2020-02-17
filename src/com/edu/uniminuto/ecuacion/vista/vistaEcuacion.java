
package com.edu.uniminuto.ecuacion.vista;
import com.edu.uniminuto.ecuacion.controlador.controladorOperaciones;
import java.util.Scanner;

/**
 * Esta clase se encarga de obtener los datos que el usuario va a ingresar para
 * posteriormente aplicar la ecuacion de las sumatoria de TYLOR.
 * @version 1.1.1
 * @author Julian Camilo Anzola Hincapie.
 * @Copyright Este programa funciona bajo la licencia de software libre.
 */
public class vistaEcuacion {
    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        try{
            System.out.println("Ingrese los grados");
            double grado=leer.nextDouble();
            System.out.println("Ingrese el numero de iteraciones");
            double terminos=leer.nextDouble();
            controladorOperaciones controlador=new controladorOperaciones();
            System.out.println("El seno de "+grado+" es: "+controlador.dirigirSolicitudes(terminos,grado));
        }catch(Exception e){
            System.out.println();
            System.out.println("------------------------------ERROR------------------------------ "
                    + "\nA continuación de se presenta los posibles errores: \n\n1."
                    + "Solo se puede ingresar valores numericos.\n"
                    + "2.El numero de iteraciones supera la capacidad del sistema.\n"
                    + "3.El sistema no esta en capacidad de realiar el calculo.\n");
        }
    }
}
