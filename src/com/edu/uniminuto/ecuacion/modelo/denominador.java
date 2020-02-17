
package com.edu.uniminuto.ecuacion.modelo;

/**
 * Esta clase se encarga de cacular el denominador de la
 * ecuacion, para calcular el seno de un angulo con las sumatorias de TYLOR.
 * @version 1.1.1
 * @author Julian Camilo Anzola Hincapie.
 * @Copyright Este programa funciona bajo la licencia de software libre.
 */
public class denominador {
    
    /**
     * Este metodo se encarga de obtener el resultado del calculo del denominador, para posteriormente
     * dividir el numerador del denominador, esto con respecto a la ecuacion de las sumatorias de TYLOR.
     * @param grado Es el grado al cual se le va a sacar el seno por medio de la ecuacion de las sumatorias
     * de TYLOR.
     * @param termino Es la iteracion en la cual se encuentra el sistema.
     * @return Retorna el resultado del calculo del denominador de la ecuacion de las sumatoria
     * de TAYLOR.
     */
    public double calcularDenominador(double grado, double termino){
        return calcularFactorial(grado,termino);
    }
    
    /**
     * Este metodo se encarga de calcular el factorial del denominador, esto con respecto a la ecuacion
     * de las sumatorias de TYLOR.
     * @param grado Es el grado al cual se le va a sacar el seno por medio de la ecuacion de las sumatorias
     * de TYLOR.
     * @param termino Es la iteracion en la cual se encuentra el sistema.
     * @return Retorna el resultado del calculo del factorial que se encuentra en el denominador de la 
     * ecuacion de las sumatorias de TYLOR.
     */
    private double calcularFactorial(double grado, double termino){
        double factorial=1;
        double resultado=(2*termino+1);
        while(resultado>1){
            factorial=factorial*resultado;
            resultado=resultado-1;
        }
        return factorial;
    }
}
