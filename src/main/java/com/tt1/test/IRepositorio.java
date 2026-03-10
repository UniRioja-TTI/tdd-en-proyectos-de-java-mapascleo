package com.tt1.test;

import java.util.List;

/**
 * Interfaz que define las operaciones de acceso a datos para las tareas.
 * Proporciona un contrato para guardar, buscar, actualizar y recuperar tareas y correos.
 */
public interface IRepositorio {
    
    /**
     * Guarda una nueva tarea en el repositorio.
     * @param tarea El objeto ToDo a almacenar.
     * @return El identificador único asignado a la tarea.
     */
    int save(ToDo tarea);

    /**
     * Busca una tarea específica mediante su identificador.
     * @param id El identificador único de la tarea.
     * @return El objeto ToDo si se encuentra, o null en caso contrario.
     */
    ToDo findById(int id);

    /**
     * Actualiza los datos de una tarea existente.
     * @param id El identificador de la tarea a modificar.
     * @param tarea El objeto ToDo con los nuevos datos.
     */
    void update(int id, ToDo tarea);

    /**
     * Recupera todas las tareas almacenadas en el sistema.
     * @return Una lista con todas las tareas.
     */
    List<ToDo> findAll();

    /**
     * Añade un nuevo correo electrónico a la lista de notificaciones.
     * @param email La dirección de correo electrónico a añadir.
     */
    void addEmail(String email);

    /**
     * Recupera todos los correos electrónicos registrados para notificaciones.
     * @return Una lista de cadenas con los correos.
     */
    List<String> getEmails();
}