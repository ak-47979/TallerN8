package com.uce.edu.pa2.api.as;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Default;
/**
 * Implementación del envío de notificaciones
 * mediante correo electrónico.
 */
@ApplicationScoped
@Default
public class NotificadorMail implements Notificador {

    /**
     * Envía un correo electrónico.
     * 
     * @param destino dirección de correo
     * @param mensaje contenido del mensaje
     */
    public void enviar(
            String destino,
            String mensaje) {

        System.out.println(
            "Se envia un mail al correo: "
            + destino);

        System.out.println(
            "Con el mensaje: "
            + mensaje);
    }
}