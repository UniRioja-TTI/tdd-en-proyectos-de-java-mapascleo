package com.tt1.test;

import java.util.List;

/**
 * Implementación concreta de IRepositorio.
 * Actúa como intermediario entre la lógica de la aplicación y la base de datos simulada (DBStub).
 */
public class Repositorio implements IRepositorio {
    private final DBStub db;

    /**
     * Constructor del repositorio.
     * @param db La instancia de la base de datos a utilizar.
     */
    public Repositorio(DBStub db) {
        this.db = db;
    }

    @Override
    public int save(ToDo tarea) {
        return db.create(tarea);
    }

    @Override
    public ToDo findById(int id) {
        return db.read(id);
    }

    @Override
    public void update(int id, ToDo tarea) {
        db.update(id, tarea);
    }

    @Override
    public List<ToDo> findAll() {
        return db.readAll();
    }

    @Override
    public void addEmail(String email) {
        db.agregarEmail(email);
    }

    @Override
    public List<String> getEmails() {
        return db.getAgenda();
    }
}