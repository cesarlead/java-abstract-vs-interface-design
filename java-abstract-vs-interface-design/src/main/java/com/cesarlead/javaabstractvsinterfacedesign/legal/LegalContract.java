package com.cesarlead.javaabstractvsinterfacedesign.legal;

import com.cesarlead.javaabstractvsinterfacedesign.core.Signable;
import org.springframework.stereotype.Component;

// Nota: Este NO extiende BaseReport. Es una familia diferente.
@Component
public class LegalContract implements Signable {

    @Override
    public void applyDigitalSignature(String key) {
        System.out.println("[FIRMA-WORD] Encriptando Contrato Legal con llave: " + key);
    }

    @Override
    public String getDocumentId() {
        return "CONTRATO-LEGAL-999";
    }
}
