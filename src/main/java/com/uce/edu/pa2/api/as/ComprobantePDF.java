package com.uce.edu.pa2.api.as;

import jakarta.enterprise.context.ApplicationScoped;

/**
 * Genera comprobantes en formato PDF.
 */
@ApplicationScoped
public class ComprobantePDF
        implements ComprobanteEstrategia {

    /**
     * Genera un comprobante digital.
     */
    @Override
    public void comprobante(Pedido pedido) {

        System.out.println(
            "Enviando el comprobante pdf al destino "
            + pedido.getDestino());

        System.out.println(
            "Se envio el comprobante");
    }
}
