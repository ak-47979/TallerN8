package com.uce.edu.pa2.api.as;

import jakarta.enterprise.context.ApplicationScoped;
/**
 * Genera comprobantes físicos
 * en formato factura.
 */
@ApplicationScoped
public class Factura
        implements ComprobanteEstrategia {

    /**
     * Genera una factura física.
     */
    @Override
    public void comprobante(Pedido pedido) {

        System.out.println("Comprobante Fisico");

        System.out.println(
            "Nombre " + pedido.getCliente());

        System.out.println(
            "Producto " + pedido.getProducto());

        System.out.println(
            "Total: " + pedido.getTotal());

        System.out.println(
            "Gracias por su compra");
    }
}
