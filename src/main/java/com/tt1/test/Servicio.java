package com.tt1.test;

import java.time.LocalDate;
import java.util.List;

public class Servicio {
    private final Repositorio repositorio;
    private final MailerStub mailer;

    public Servicio(Repositorio repositorio, MailerStub mailer) {
        this.repositorio = repositorio;
        this.mailer = mailer;
    }

    public ToDo crearTarea(String nombre, LocalDate fechaLimite) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void añadirEmail(String email) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void marcarComoCompletada(int idTarea) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public List<ToDo> consultarPendientes() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
}
