package com.cesarlead.javaabstractvsinterfacedesign;

import com.cesarlead.javaabstractvsinterfacedesign.reports.FiscalReport;
import com.cesarlead.javaabstractvsinterfacedesign.services.BatchSignatureService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JavaAbstractVsInterfaceDesignApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaAbstractVsInterfaceDesignApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(BatchSignatureService signatureService, FiscalReport fiscalReport) {
        return args -> {
            // 1. Demostración de la Clase Abstracta (Identidad)
            System.out.println("--- Demo: Herencia y Template Method ---");
            fiscalReport.generate();

            // 2. Demostración de la Interfaz (Polimorfismo)
            // El servicio procesará tanto el Reporte Fiscal como el Contrato Legal
            signatureService.processAll();
        };
    }

}
