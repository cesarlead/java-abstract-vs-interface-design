# Java Architecture: Abstract Classes vs Interfaces with Spring Boot

Este proyecto es una implementación de referencia que demuestra cómo desacoplar la lógica de negocio utilizando **Polimorfismo**, **Patrón Template Method** e **Inyección de Dependencias** en Spring Boot.

El objetivo es demostrar la diferencia práctica y arquitectónica entre "Identidad" (Clases Abstractas) y "Capacidad" (Interfaces) en un escenario empresarial real.

## Escenario de Negocio

El sistema simula un **Motor de Gestión Documental** que debe:
1.  Generar reportes con un ciclo de vida estricto (Validación -> Renderizado -> Auditoría) usando `abstract class`.
2.  Procesar firmas digitales masivas en documentos heterogéneos (Reportes, Contratos Legales) usando `interface`.

## Tecnologías

* **Java 17+**
* **Spring Boot 3.x** (Core & Dependency Injection)
* **Maven**

## Cómo ejecutarlo

### Prerrequisitos
Necesitas tener Java y Maven instalados.

### Pasos
1.  Clona el repositorio
2.  Compila y ejecuta con Maven Wrapper (o tu instalación local):
    ```bash
    mvn spring-boot:run
    ```

## 📊 Salida Esperada

Al ejecutar la aplicación, verás en la consola cómo Spring orquesta los componentes automáticamente:

```text
--- Demo: Herencia y Template Method ---
[CORE] Iniciando generación: Balance Q3-2025
[REPORTE] Generando tablas de impuestos y balance...
[AUDIT] Reporte generado el 2025-11-19...

=== INICIANDO PROCESO BATCH DE FIRMAS ===
Documentos detectados: 2
 > Procesando ID: DOC-FISCAL-001
[FIRMA-PDF] Firmando PDF Fiscal...
 > Procesando ID: CONTRATO-LEGAL-999
[FIRMA-WORD] Encriptando Contrato Legal...
```
