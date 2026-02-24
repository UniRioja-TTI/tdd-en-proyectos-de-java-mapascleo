package com.tt1.test;
import java.util.List;

public interface IRepositorio {
    void save(ToDo tarea);
    List<ToDo> findAll();
}
