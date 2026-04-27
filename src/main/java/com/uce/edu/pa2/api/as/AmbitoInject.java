package com.uce.edu.pa2.api.as;

import jakarta.enterprise.context.Dependent;
/**
 * Bean con alcance Dependent.
 * 
 * Se crea una nueva instancia cada vez
 * que es inyectado en otra clase.
 * 
 * Utilizado para demostrar el comportamiento
 * del scope Dependent.
 */
@Dependent
public class AmbitoInject {

    /**
     * Contador independiente.
     */
    private int contador = 0;

    /**
     * Incrementa el contador.
     * 
     * @return valor actualizado del contador
     */
    public int incrementar(){
        return ++contador;
    }
}
