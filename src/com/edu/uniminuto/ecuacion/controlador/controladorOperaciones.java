
package com.edu.uniminuto.ecuacion.controlador;

import com.edu.uniminuto.ecuacion.modelo.denominador;
import com.edu.uniminuto.ecuacion.modelo.numerador;

/**
 * Esta clase se encarga de servir como controlador entre las clases de 
 * denominador y numerador, se encarga de dirigir el trafico de las solicitudes.
 * @version 1.1.1
 * @author Julian Camilo Anzola Hincapie.
 * @Copyright Este programa funciona bajo la licencia de software libre.
 */
public class controladorOperaciones {
    
    /**
     * Este metodo se encarga de dirigir las solicitudes realizadas a las clases numerador y denominador.
     * @param termino Es la iteracion en la cual se encuentra el sistema.
     * @param grado Es el grado al cual se le va a sacar el seno por medio de la ecuacion de las sumatorias
     * de TYLOR.
     * @return Retorna las respuestas de las solicitudes realizadas.
     */
    public double dirigirSolicitudes(double termino, double grado){
        denominador denominador=new denominador();
        numerador numerador=new numerador();
        int iteracion=0;
        double sumatoria=0;
        while(iteracion<termino){ 
           double resultadoNumerador= numerador.calcularNumerador(iteracion, grado);
           double resultadoDenominador=denominador.calcularDenominador(grado, iteracion);
           sumatoria=sumatoria+resultadoEcuacion(resultadoDenominador,resultadoNumerador);
           iteracion=iteracion+1;
        }
        return sumatoria;
    }
    
    /**
     * Este metodo se encarga de realizar la division del numerador y denominador para 
     * obtener el resultado de la ecuacion.
     * @param denominador Es el denominador calculado, el cual le pertenece a la ecuacion de las
     * sumatorias de TYLOR.
     * @param numerador Es el numerador calculado, el cual le pertenece a la ecuacion de las sumatoriaS
     * de TYLOR.
     * @return Retorna el resultado de la division del numerador y denominador.
     */
    private double resultadoEcuacion(double denominador, double numerador){
        return numerador/denominador;
    }
}
