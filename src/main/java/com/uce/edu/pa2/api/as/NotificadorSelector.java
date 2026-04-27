package com.uce.edu.pa2.api.as;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

/**
 * Clase encargada de seleccionar
 * el tipo de notificación adecuado
 * según el total del pedido.
 * 
 * También selecciona el tipo de
 * comprobante a generar.
 */
@ApplicationScoped
public class NotificadorSelector {

    /**
     * Notificador por correo.
     */
    @Inject
    private NotificadorMail mail;

    /**
     * Notificador por SMS.
     */
    @Inject
    private NotificadorSMS sms;

    /**
     * Notificador por WhatsApp.
     */
    @Inject
    private NotificadorWhatsapp whats;

    /**
     * Generador de comprobante PDF.
     */
    @Inject
    private ComprobantePDF comP;

    /**
     * Generador de factura física.
     */
    @Inject
    private Factura factura;

    /**
     * Selecciona el tipo de notificador.
     * 
     * @param total monto del pedido
     * @return notificador seleccionado
     */
    public Notificador seleccionar(double total){

        if(total > 120){
            return mail;
        } else if (total < 50) {
            return whats;
        } else {
            return sms;
        }
    }

    /**
     * Selecciona el tipo de comprobante.
     * 
     * @param pedido pedido a procesar
     * @return estrategia de comprobante
     */
    public ComprobanteEstrategia comprobante(
            Pedido pedido){

        if(pedido.getDestino() == null){
            return factura;
        } else {
            return comP;
        }
    }
}