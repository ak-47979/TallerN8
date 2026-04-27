package com.uce.edu.pa2.api.as;

import jakarta.enterprise.context.ApplicationScoped;


/**
 * Clase encargada de registrar y mostrar
 * estadísticas globales de ventas.
 * 
 * Mantiene información acumulada sobre:
 * - Número total de ventas
 * - Monto total vendido
 */
@ApplicationScoped
public class EstadisticasVentasGobales {

    /**
     * Total de ventas registradas.
     */
    private int totalVentas = 0;

    /**
     * Monto total acumulado.
     */
    private double montoTotalVendido = 0;

    /**
     * Registra una nueva venta.
     * 
     * @param totalVentaIndividual
     * monto de la venta realizada
     */
    public void registrarVenta(
            double totalVentaIndividual){

        totalVentas++;
        montoTotalVendido += totalVentaIndividual;
    }

    /**
     * Muestra estadísticas globales
     * en consola.
     */
    public void mostrarEstadisticasGlobales(){

        System.out.println(
            "ESTADISTICAS GLOBALES");

        System.out.println(
            "Cantidad de ventas: "
            + this.totalVentas);

        System.out.println(
            "Valor Total Vendido: "
            + this.montoTotalVendido);
    }
}
