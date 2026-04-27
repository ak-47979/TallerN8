package com.uce.edu.pa2.api.as;

import jakarta.enterprise.context.ApplicationScoped;

/**
 * Implementación del envío de notificaciones
 * mediante mensajes SMS.
 */
@ApplicationScoped
public class NotificadorSMS implements Notificador {

    /**
     * Envía un mensaje SMS.
     */
    public void enviar(
            String destino,
            String mensaje) {

        System.out.println(
            "Se envia un SMS al numero: "
            + destino);

        System.out.println(
            "Con el mensaje: "
            + mensaje);
    }
}