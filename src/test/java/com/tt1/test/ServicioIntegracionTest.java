package com.tt1.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class ServicioIntegracionTest {

    private Servicio servicio;
    private DBStub dbReal;

    @BeforeEach
    void setUp() {
        dbReal = new DBStub();
        Repositorio repoReal = new Repositorio(dbReal);
        MailerStub mailerReal = new MailerStub();
        servicio = new Servicio(repoReal, mailerReal);
    }

    @Test
    void testFlujoCompletoCreacionTarea() {
        servicio.crearTarea("Integración TDD", LocalDate.now().plusDays(2));
        assertEquals(1, dbReal.readAll().size());
        assertEquals("Integración TDD", dbReal.readAll().get(0).getNombre());
    }
}
