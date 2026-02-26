package com.tt1.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MailerStubTest {

    @Test
    void testEnviarCorreo() {
        MailerStub mailer = new MailerStub();
        boolean resultado = mailer.enviarCorreo("test@test.com", "Mensaje");
        assertTrue(resultado);
    }
}
