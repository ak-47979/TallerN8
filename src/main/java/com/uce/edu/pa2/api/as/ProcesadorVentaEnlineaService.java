package com.uce.edu.pa2.api.as;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
/**
 * Servicio encargado de procesar ventas realizadas en línea.
 * 
 * Similar al procesamiento en linea, con mensajes de venta en linea.
 */
@ApplicationScoped
public class ProcesadorVentaEnlineaService {

    /**
     * Servicio para registrar estadísticas globales.
     */
    @Inject
    private EstadisticasVentasGobales estadisticasVentasGobales;

    /**
     * Servicio que mide el tiempo del proceso.
     */
    @Inject
    private TrakingVenta trakingVenta;

    /**
     * Procesa una venta en línea.
     * 
     * @param venta venta realizada por un cliente.
     */
    public void procesar(Venta venta) {

        trakingVenta.iniciar();

        System.out.println("procesando pedido en linea.....");
        System.out.println("Cliente: " + venta.getCliente());

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.trakingVenta.finalizar();

        this.estadisticasVentasGobales
            .registrarVenta(venta.getTotal());
    }
}