package com.tt1.test;

import java.time.LocalDate;

/**
 * Clase principal que arranca la aplicación de consola.
 * Sirve como demostración del funcionamiento del Servicio de Tareas.
 */
public class App {
    
    /**
     * Punto de entrada principal del programa.
     * * @param args Argumentos pasados por línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        DBStub db = new DBStub();
        Repositorio repo = new Repositorio(db);
        MailerStub mailer = new MailerStub();
        Servicio servicio = new Servicio(repo, mailer);

        servicio.anadirEmail("profesor@unirioja.es");
        servicio.crearTarea("Entregar Práctica 3", LocalDate.now().plusDays(2));

        System.out.println("Tareas pendientes: " + servicio.consultarPendientes().size());
    }
}