package com.cesarlead.javaabstractvsinterfacedesign.reports;

import java.time.LocalDateTime;

public abstract class BaseReport {

    protected String title;
    protected String author;
    private LocalDateTime createdAt; // Estado encapsulado

    public BaseReport(String title, String author) {
        this.title = title;
        this.author = author;
        this.createdAt = LocalDateTime.now();
    }

    // MÉTODO PLANTILLA: Final para que nadie rompa el algoritmo base
    public final void generate() {
        System.out.println("[CORE] Iniciando generación: " + title);
        validate();
        renderBody(); // Parte abstracta delegada
        logAudit();
    }

    private void validate() {
        if (this.author == null) throw new IllegalArgumentException("Autor requerido");
    }

    private void logAudit() {
        System.out.println("[AUDIT] Reporte generado el " + createdAt);
    }

    // Cada hijo decide cómo se ve su cuerpo (PDF, Excel, HTML, etc.)
    protected abstract void renderBody();
}
