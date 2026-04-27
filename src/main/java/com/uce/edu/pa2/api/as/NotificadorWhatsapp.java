package com.uce.edu.pa2.api.as;

import jakarta.enterprise.context.ApplicationScoped;

/**
 * Implementación del envío de notificaciones
 * mediante WhatsApp.
 */
@ApplicationScoped
public class NotificadorWhatsapp
        implements Notificador {

    /**
     * Envía un mensaje por WhatsApp.
     */
    public void enviar(
            String destino,
            String mensaje) {

        System.out.println(
            "Se envia un Whatsapp al numero: "
            + destino);

        System.out.println(
            "Con el mensaje: "
            + mensaje);
    }
}