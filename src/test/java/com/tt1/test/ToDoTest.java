package com.tt1.test;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class ToDoTest {

    @Test
    void testCreacionYEstadoInicial() {
        ToDo tarea = new ToDo("Test", "Desc", LocalDate.now());
        assertEquals("Test", tarea.getNombre());
        assertFalse(tarea.isCompletada());
    }

    @Test
    void testMarcarCompletada() {
        ToDo tarea = new ToDo("Test", "Desc", LocalDate.now());
        tarea.setCompletada(true);
        assertTrue(tarea.isCompletada());
    }
}
