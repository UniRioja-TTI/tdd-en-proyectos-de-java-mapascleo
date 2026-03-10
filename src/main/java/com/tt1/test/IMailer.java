package com.tt1.test;

/**
 * Interfaz encargada de la gestión del envío de correos electrónicos.
 */
public interface IMailer {
    /**
     * Envía un mensaje de correo a un destinatario específico.
     * * @param destinatario La dirección de correo del receptor.
     * @param mensaje El contenido del correo a enviar.
     * @return true si el correo se envió correctamente, false si hubo un error.
     */
    boolean enviarCorreo(String destinatario, String mensaje);
}