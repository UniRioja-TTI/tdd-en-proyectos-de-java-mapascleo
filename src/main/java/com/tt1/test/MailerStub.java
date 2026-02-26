package com.tt1.test;

public class MailerStub implements IMailer {
    @Override
    public boolean enviarCorreo(String destinatario, String mensaje) {
        System.out.println("Enviando correo a " + destinatario + ": " + mensaje);
        return true;
    }
}
