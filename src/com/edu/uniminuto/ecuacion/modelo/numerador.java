
package com.edu.uniminuto.ecuacion.modelo;

/**
 * Esta clase se encarga de cacular el numerador de la
 * ecuacion, para calcular el seno de un angulo con las sumatorias de TYLOR.
 * @version 1.1.1
 * @author Julian Camilo Anzola Hincapie.
 * @Copyright Este programa funciona bajo la licencia de software libre.
 */
public class numerador {
    
    /**
     * Este metodo se encarga de obtener el signo de la iteracion en la cual se encuentra el sistema.
     * @param termino Es la iteracion en la cual se encuentra el sistema.
     * @return Retorna el signo equivalente a la iteracion en la cual se encuentra.
     */
    private int calcularSigno(double termino){
        if(termino%2==0){
            return 1;
        }else{
            return -1;
        }
    }
    
    /**
     * Este metodo se encarga de obtener el resultado del calculo del numerador, para posteriormente
     * dividirlo en el denominador, esto con respecto a la ecuacion de las sumatorias de TYLOR.
     * @param termino Es la iteracion en la cual se encuentra el sistema.
     * @param grado Es el grado al cual se le va a sacar el seno por medio de la ecuacion de las sumatorias
     * de TYLOR.
     * @return Retorna el resultado del calculo del numerador de la ecuacion de las sumatoria
     * de TAYLOR.
     */
    public double calcularNumerador(double termino,double grado){
        double exponencial=Math.pow(calcularRadianes(grado),(2*termino+1));
        exponencial=exponencial*calcularSigno(termino);
        return exponencial;
    }
    
    /**
     * Este metodo se encarga de convertir los grados a radianes.
     * @param grado Son los grados que el usuario ingresa.
     * @return Retorna la conversion de los grados a radianes
     */
    private double calcularRadianes(double grado){
        return (grado*(Math.PI/180.0));
    }
}
