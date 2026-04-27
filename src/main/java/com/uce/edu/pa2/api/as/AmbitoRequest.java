package com.uce.edu.pa2.api.as;

import jakarta.enterprise.context.RequestScoped;

/**
 * Bean con alcance RequestScoped.
 * 
 * Se crea una nueva instancia por cada
 * solicitud realizada.
 * 
 * Utilizado para demostrar el comportamiento
 * del scope RequestScoped.
 */
@RequestScoped
public class AmbitoRequest {

    /**
     * Contador por solicitud.
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
