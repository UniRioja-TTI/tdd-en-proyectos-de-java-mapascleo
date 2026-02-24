package com.tt1.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBStub {
    private Map<Integer, ToDo> tareas = new HashMap<>();
    private List<String> agendaEmails = new ArrayList<>();

    public void create(ToDo tarea) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public ToDo read(int id) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public List<ToDo> readAll() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void update(int id, ToDo tarea) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void delete(int id) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void agregarEmail(String email) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public List<String> getAgenda() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
}
