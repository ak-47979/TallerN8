package com.uce.edu.pa2.api.as;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
/**
 * Servicio encargado de procesar ventas, copia de ProcesadorVentaService creada
 * para simular un bean diferente.
 * 
 * Esta clase utiliza:
 * - TrakingVenta para medir el tiempo de ejecución.
 * - EstadisticasVentasGobales para registrar el total vendido.
 * 
 * Simula el flujo de procesamiento de una venta,
 * incluyendo la medición del tiempo y el registro
 * de estadísticas.
 */
@ApplicationScoped
public class ProcesadorVentaService1 {
    /**
     * Servicio que almacena estadísticas globales de ventas.
     */
    @Inject
    private EstadisticasVentasGobales estadisticasVentasGobales;

    /**
     * Servicio encargado de medir el tiempo de ejecución
     * del proceso de venta.
     */
    @Inject
    private TrakingVenta trakingVenta;

    /**
     * Procesa una venta.
     * 
     * @param venta objeto que contiene la información
     *              del cliente y el total de la venta.
     */
    public void procesar(Venta venta) {
        // Inicia medición de tiempo
        trakingVenta.iniciar();

        System.out.println("procesando pedido.....");
        System.out.println("Cliente: " + venta.getCliente());

        // Simulación de proceso
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Finaliza medición
        this.trakingVenta.finalizar();

        // Registrar estadísticas
        this.estadisticasVentasGobales
            .registrarVenta(venta.getTotal());
    }
}