package com.tt1.test;

import java.util.List;

public class Repositorio implements IRepositorio{
    private final DBStub db;

    public Repositorio(DBStub db) {
        this.db = db;
    }

    public void save(ToDo tarea) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public ToDo findById(int id) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void update(ToDo tarea) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public List<ToDo> findAll() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
}
