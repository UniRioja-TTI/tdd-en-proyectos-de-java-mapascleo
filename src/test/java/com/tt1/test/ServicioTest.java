package com.tt1.test;

import com.tt1.test.RepositorioMock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class ServicioTest {

    private Servicio servicio;
    private RepositorioMock repoMock;

    @BeforeEach
    void setUp() {
        repoMock = new RepositorioMock();
        IMailer mailerMock = (dest, msj) -> true;
        servicio = new Servicio(repoMock, mailerMock);
    }

    @Test
    void testCrearTareaLlamaAlRepositorio() {
        servicio.crearTarea("Aprender JUnit", LocalDate.now().plusDays(5));
        assertTrue(repoMock.saveLlamado);
        assertEquals(1, repoMock.listaSimulada.size());
    }
}
