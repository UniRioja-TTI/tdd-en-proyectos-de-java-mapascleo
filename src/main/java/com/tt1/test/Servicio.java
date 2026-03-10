package com.tt1.test;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Clase que agrupa la lógica de negocio principal del sistema de gestión de tareas.
 * Coordina las acciones entre el repositorio de datos y el servicio de notificaciones.
 */
public class Servicio {
    private final IRepositorio repositorio;
    private final IMailer mailer;

    /**
     * Inicializa el servicio con sus dependencias requeridas.
     * * @param repositorio El acceso a datos donde se guardan las tareas.
     * @param mailer El sistema encargado de enviar notificaciones.
     */
    public Servicio(IRepositorio repositorio, IMailer mailer) {
        this.repositorio = repositorio;
        this.mailer = mailer;
    }

    /**
     * Crea una nueva tarea y la guarda automáticamente en el repositorio.
     * * @param nombre El título de la nueva tarea.
     * @param fechaLimite La fecha tope para realizarla.
     * @return El objeto ToDo recién creado y guardado.
     */
    public ToDo crearTarea(String nombre, LocalDate fechaLimite) {
        ToDo nuevaTarea = new ToDo(nombre, "", fechaLimite);
        repositorio.save(nuevaTarea);
        return nuevaTarea;
    }

    /**
     * Registra un correo para el envío de alertas.
     * * @param email La dirección de correo a registrar.
     */
    public void anadirEmail(String email) {
        repositorio.addEmail(email);
    }

    /**
     * Marca una tarea específica como completada y actualiza la base de datos.
     * * @param idTarea El identificador numérico de la tarea a completar.
     */
    public void marcarComoCompletada(int idTarea) {
        ToDo tarea = repositorio.findById(idTarea);
        if (tarea != null) {
            tarea.setCompletada(true);
            repositorio.update(idTarea, tarea);
        }
    }

    /**
     * Recupera una lista con todas las tareas que aún no han sido finalizadas.
     * * @return Una lista de tareas pendientes.
     */
    public List<ToDo> consultarPendientes() {
        return repositorio.findAll().stream()
            .filter(t -> !t.isCompletada())
            .collect(Collectors.toList());
    }

    /**
     * Comprueba si existen tareas cuya fecha límite ya ha pasado.
     * Si encuentra tareas caducadas, envía una alerta por correo a todos los emails registrados.
     */
    public void comprobarTareasCaducadas() {
        List<ToDo> caducadas = repositorio.findAll().stream()
            .filter(t -> !t.isCompletada() && t.getFechaLimite().isBefore(LocalDate.now()))
            .collect(Collectors.toList());

        if (!caducadas.isEmpty()) {
            List<String> emails = repositorio.getEmails();
            for (String email : emails) {
                mailer.enviarCorreo(email, "Alerta: Tienes " + caducadas.size() + " tareas caducadas.");
            }
        }
    }
}