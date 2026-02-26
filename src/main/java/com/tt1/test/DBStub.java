package com.tt1.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBStub {
    private Map<Integer, ToDo> tareas = new HashMap<>();
    private List<String> agendaEmails = new ArrayList<>();
    private int currentId = 1;

    public int create(ToDo tarea) {
        tareas.put(currentId, tarea);
        return currentId++;
    }

    public ToDo read(int id) {
        return tareas.get(id);
    }

    public List<ToDo> readAll() {
        return new ArrayList<>(tareas.values());
    }

    public void update(int id, ToDo tarea) {
        tareas.put(id, tarea);
    }

    public void agregarEmail(String email) {
        if (!agendaEmails.contains(email)) {
            agendaEmails.add(email);
        }
    }

    public List<String> getAgenda() {
        return new ArrayList<>(agendaEmails);
    }
}
