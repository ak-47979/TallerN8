package com.uce.edu.pa2.api.as;

import jakarta.enterprise.context.Dependent;
/**
 * Clase encargada de medir el tiempo de ejecución
 * de las operaciones realizadas en el sistema.
 * 
 * Utiliza marcas de tiempo para calcular:
 * - Tiempo de ejecución individual
 * - Tiempo total acumulado
 * - Número total de operaciones realizadas
 */
@Dependent
public class TrakingVenta {

    /**
     * Tiempo inicial del proceso.
     */
    private long tiempoInicio = 0;

    /**
     * Tiempo final del proceso.
     */
    private long tiempoFinal = 0;

    /**
     * Tiempo total acumulado.
     */
    private long tiempoTotalAcumulado = 0;

    /**
     * Número total de operaciones realizadas.
     */
    private int numeroOperaciones = 0;

    /**
     * Inicia la medición del tiempo.
     */
    public void iniciar() {
        this.tiempoInicio = System.currentTimeMillis();
    }

    /**
     * Reinicia los valores acumulados.
     */
    public void reiniciar(){
        this.tiempoTotalAcumulado = 0;
        this.numeroOperaciones = 0;
    }

    /**
     * Finaliza la medición del tiempo y muestra
     * estadísticas de ejecución.
     */
    public void finalizar() {

        this.tiempoFinal = System.currentTimeMillis();

        long tiempoEjecucion =
                tiempoFinal - tiempoInicio;

        this.tiempoTotalAcumulado += tiempoEjecucion;

        this.numeroOperaciones++;

        System.out.println(
            "Tiempo de ejecucion: "
            + tiempoEjecucion + " ms"
        );

        System.out.println(
            "Tiempo Acumulado: "
            + tiempoTotalAcumulado + " ms"
        );

        System.out.println(
            "Cantidad de operaciones: "
            + this.numeroOperaciones
        );
    }
}