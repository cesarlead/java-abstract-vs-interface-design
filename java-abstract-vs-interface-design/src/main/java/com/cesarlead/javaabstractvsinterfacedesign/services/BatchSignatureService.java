package com.cesarlead.javaabstractvsinterfacedesign.services;

import com.cesarlead.javaabstractvsinterfacedesign.core.Signable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BatchSignatureService {

    private final List<Signable> documentsToSign;

    // Spring encuentra TODOS los beans que implementen Signable y los inyecta aquí
    public BatchSignatureService(List<Signable> documentsToSign) {
        this.documentsToSign = documentsToSign;
    }

    public void processAll() {
        System.out.println("\n=== INICIANDO PROCESO BATCH DE FIRMAS ===");
        System.out.println("Documentos detectados: " + documentsToSign.size());

        String dailyKey = "KEY-2025-SECURE";

        for (Signable doc : documentsToSign) {
            System.out.println(" > Procesando ID: " + doc.getDocumentId());
            doc.applyDigitalSignature(dailyKey);
        }
        System.out.println("=== PROCESO FINALIZADO ===\n");
    }
}
