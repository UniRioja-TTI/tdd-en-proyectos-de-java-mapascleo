package com.tt1.test;

import java.util.ArrayList;
import java.util.List;

public class RepositorioMock implements IRepositorio {

    public boolean saveLlamado = false;
    public List<ToDo> listaSimulada = new ArrayList<>();
    private List<String> emails = new ArrayList<>();

    @Override
    public int save(ToDo tarea) {
        saveLlamado = true;
        listaSimulada.add(tarea);
        return listaSimulada.size();
    }

    @Override
    public ToDo findById(int id) {
        if (id > 0 && id <= listaSimulada.size()) {
            return listaSimulada.get(id - 1);
        }
        return null;
    }

    @Override
    public void update(int id, ToDo tarea) {
        if (id > 0 && id <= listaSimulada.size()) {
            listaSimulada.set(id - 1, tarea);
        }
    }

    @Override
    public List<ToDo> findAll() {
        return listaSimulada;
    }

    @Override
    public void addEmail(String email) {
        emails.add(email);
    }

    @Override
    public List<String> getEmails() {
        return emails;
    }
}
