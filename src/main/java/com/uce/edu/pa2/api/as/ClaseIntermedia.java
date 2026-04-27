package com.uce.edu.pa2.api.as;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
/**
 * Clase intermedia utilizada para demostrar
 * la inyección de dependencias con diferentes
 * ámbitos CDI.
 * 
 * Permite visualizar los valores y referencias
 * de los objetos inyectados.
 */
@ApplicationScoped
public class ClaseIntermedia {

    /**
     * Bean con alcance ApplicationScoped.
     */
    @Inject
    private AmbitoAplicacion ambitoAplicacion;

    /**
     * Bean con alcance Dependent.
     */
    @Inject
    private AmbitoInject ambitoInject;

    /**
     * Bean con alcance Singleton.
     */
    @Inject
    private AmbitoSingleton ambitoSingleton;

    /**
     * Imprime la referencia y valor
     * del contador ApplicationScoped.
     */
    public void imprimirobjetovalor(){
        System.out.println(ambitoAplicacion);
        System.out.println(
            this.ambitoAplicacion.incrementar());
    }

    /**
     * Imprime la referencia y valor
     * del contador Dependent.
     */
    public void imprimirobjetovalorInject(){
        System.out.println(ambitoInject);
        System.out.println(
            this.ambitoInject.incrementar());
    }

    /**
     * Imprime la referencia y valor
     * del contador Singleton.
     */
    public void imprimirobjetovalorSingleton(){
        System.out.println(ambitoSingleton);
        System.out.println(
            this.ambitoSingleton.incrementar());
    }
}
