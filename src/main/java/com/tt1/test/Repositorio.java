package com.tt1.test;

import java.util.List;

public class Repositorio implements IRepositorio {
    private final DBStub db;

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
