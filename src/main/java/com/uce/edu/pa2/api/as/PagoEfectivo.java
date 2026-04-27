package com.uce.edu.pa2.api.as;

import jakarta.enterprise.context.ApplicationScoped;
/**
 * Implementación de la estrategia de pago
 * mediante efectivo.
 * 
 * Forma parte del patrón Strategy utilizado
 * para permitir múltiples métodos de pago.
 */
@ApplicationScoped
public class PagoEfectivo implements PagoEstrategia{
    /**
     * Realiza el proceso de pago con tarjeta.
     *
     * @param valor monto a pagar
     */
    @Override
    public void realizar(double valor) {

        System.out.println("Presenta una pantalla Efectivo");
        System.out.println("Realizando Cobro");

    }

}
