package com.tt1.test;

import java.time.LocalDate;

/**
 * Representa una tarea individual dentro del sistema.
 * Contiene la información fundamental de la tarea, como su nombre, descripción,
 * fecha límite y su estado actual (completada o no).
 */
public class ToDo {
    private String nombre;
    private String descripcion;
    private LocalDate fechaLimite;
    private boolean completada;

    /**
     * Construye una nueva tarea.
     * Al crearse, la tarea se marca automáticamente como no completada.
     * * @param nombre      El nombre corto o título de la tarea.
     * @param descripcion Los detalles extendidos de la tarea.
     * @param fechaLimite La fecha máxima en la que debe completarse.
     */
    public ToDo(String nombre, String descripcion, LocalDate fechaLimite) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaLimite = fechaLimite;
        this.completada = false;
    }

    /**
     * Obtiene el nombre de la tarea.
     * @return El nombre actual de la tarea.
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la descripción de la tarea.
     * @return La descripción actual.
     */
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene la fecha límite establecida para la tarea.
     * @return La fecha límite.
     */
    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    /**
     * Comprueba si la tarea ha sido finalizada.
     * @return true si está completada, false en caso contrario.
     */
    public boolean isCompletada() {
        return completada;
    }

    /**
     * Actualiza el estado de completitud de la tarea.
     * @param completada El nuevo estado (true para completada, false para pendiente).
     */
    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
}