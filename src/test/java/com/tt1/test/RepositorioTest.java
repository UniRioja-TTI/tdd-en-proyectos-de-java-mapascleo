package com.tt1.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class RepositorioTest {

    private Repositorio repo;

    @BeforeEach
    void setUp() {
        DBStub db = new DBStub();
        repo = new Repositorio(db);
    }

    @Test
    void testSaveAndFindAll() {
        ToDo tarea1 = new ToDo("T1", "", LocalDate.now());
        ToDo tarea2 = new ToDo("T2", "", LocalDate.now());
        repo.save(tarea1);
        repo.save(tarea2);
        assertEquals(2, repo.findAll().size());
    }
}
