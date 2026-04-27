package com.uce.edu.pa2.api.as;

import jakarta.inject.Singleton;

/**
 * Bean con alcance Singleton.
 * 
 * Solo existe una instancia en toda
 * la aplicación.
 * 
 * Utilizado para demostrar el comportamiento
 * del patrón Singleton.
 */
@Singleton
public class AmbitoSingleton {

    /**
     * Contador único global.
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