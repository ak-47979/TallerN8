package com.uce.edu.pa2.api.as;
/**
 * Clase que representa una venta realizada por un cliente.
 * 
 * Contiene la información básica:
 * - Nombre del cliente
 * - Total de la venta
 */
public class Venta {

    /**
     * Nombre del cliente.
     */
    private String cliente;

    /**
     * Total de la venta.
     */
    private double total;

    /**
     * Constructor de la venta.
     * 
     * @param cliente nombre del cliente
     * @param total valor total de la venta
     */
    public Venta(String cliente, double total) {
        this.cliente = cliente;
        this.total = total;
    }

    /**
     * Obtiene el nombre del cliente.
     * 
     * @return nombre del cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * Establece el nombre del cliente.
     * 
     * @param cliente nuevo nombre
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * Obtiene el total de la venta.
     * 
     * @return total de la venta
     */
    public double getTotal() {
        return total;
    }

    /**
     * Establece el total de la venta.
     * 
     * @param total nuevo total
     */
    public void setTotal(double total) {
        this.total = total;
    }
}
