package com.tt1.test;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Servicio {
    private final IRepositorio repositorio;
    private final IMailer mailer;

    public Servicio(IRepositorio repositorio, IMailer mailer) {
        this.repositorio = repositorio;
        this.mailer = mailer;
    }

    public ToDo crearTarea(String nombre, LocalDate fechaLimite) {
        ToDo nuevaTarea = new ToDo(nombre, "", fechaLimite);
        repositorio.save(nuevaTarea);
        return nuevaTarea;
    }

    public void añadirEmail(String email) {
        repositorio.addEmail(email);
    }

    public void marcarComoCompletada(int idTarea) {
        ToDo tarea = repositorio.findById(idTarea);
        if (tarea != null) {
            tarea.setCompletada(true);
            repositorio.update(idTarea, tarea);
        }
    }

    public List<ToDo> consultarPendientes() {
        return repositorio.findAll().stream()
            .filter(t -> !t.isCompletada())
            .collect(Collectors.toList());
    }

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
