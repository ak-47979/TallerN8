package com.uce.edu.pa2.api.as;

import jakarta.enterprise.context.ApplicationScoped;
/**
 * Bean con alcance ApplicationScoped.
 * 
 * Esta clase mantiene un contador compartido
 * por toda la aplicación mientras esté en ejecución.
 * 
 * Se utiliza para demostrar el comportamiento
 * del scope ApplicationScoped en CDI.
 */
@ApplicationScoped
public class AmbitoAplicacion {

    /**
     * Contador compartido.
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
