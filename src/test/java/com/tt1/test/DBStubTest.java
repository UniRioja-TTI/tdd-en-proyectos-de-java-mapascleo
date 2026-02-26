package com.tt1.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class DBStubTest {

    private DBStub db;

    @BeforeEach
    void setUp() {
        db = new DBStub();
    }

    @Test
    void testCreateAndRead() {
        ToDo tarea = new ToDo("Test", "", LocalDate.now());
        int id = db.create(tarea);
        ToDo recuperada = db.read(id);
        assertEquals("Test", recuperada.getNombre());
    }

    @Test
    void testAgregarEmail() {
        db.agregarEmail("test@test.com");
        db.agregarEmail("test@test.com");
        assertEquals(1, db.getAgenda().size());
    }
}
