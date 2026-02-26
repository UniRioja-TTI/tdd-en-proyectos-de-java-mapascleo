package com.tt1.test;

import java.util.List;

public interface IRepositorio {
    int save(ToDo tarea);
    ToDo findById(int id);
    void update(int id, ToDo tarea);
    List<ToDo> findAll();
    void addEmail(String email);
    List<String> getEmails();
}
