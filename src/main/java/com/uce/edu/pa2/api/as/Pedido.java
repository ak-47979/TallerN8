package com.uce.edu.pa2.api.as;

/**
 * Clase que representa un pedido realizado por un cliente.
 * 
 * Contiene la información necesaria para:
 * - Registrar pedidos
 * - Generar comprobantes
 * - Enviar notificaciones
 */
public class Pedido {

    /**
     * Nombre del cliente.
     */
    private String cliente;

    /**
     * Producto solicitado.
     */
    private String producto;

    /**
     * Total del pedido.
     */
    private double total;

    /**
     * Destino del comprobante o notificación.
     */
    private String destino;

    /**
     * Mensaje asociado al pedido.
     */
    private String mensaje;

    /**
     * Constructor vacío.
     */
    public Pedido() {
    }

    /**
     * Constructor completo del pedido.
     *
     * @param cliente nombre del cliente
     * @param producto producto solicitado
     * @param total valor total del pedido
     * @param destino destino del comprobante
     */
    public Pedido(String cliente,String producto,double total,String destino) {
        this.cliente = cliente;
        this.producto = producto;
        this.total = total;
        this.destino = destino;
    }

    /**
     * Obtiene el nombre del cliente.
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * Establece el nombre del cliente.
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * Obtiene el producto solicitado.
     */
    public String getProducto() {
        return producto;
    }

    /**
     * Establece el producto solicitado.
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }

    /**
     * Obtiene el total del pedido.
     */
    public double getTotal() {
        return total;
    }

    /**
     * Establece el total del pedido.
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * Obtiene el destino del pedido.
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Establece el destino del pedido.
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * Obtiene el mensaje del pedido.
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Establece el mensaje del pedido.
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}