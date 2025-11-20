package com.cesarlead.javaabstractvsinterfacedesign.reports;

import com.cesarlead.javaabstractvsinterfacedesign.core.Signable;
import org.springframework.stereotype.Component;

@Component
public class FiscalReport extends BaseReport implements Signable {

    public FiscalReport() {
        super("Balance Q3-2025", "Departamento Contable");
    }

    @Override
    protected void renderBody() {
        System.out.println("[REPORTE] Generando tablas de impuestos y balance...");
    }

    @Override
    public void applyDigitalSignature(String key) {
        System.out.println("[FIRMA-PDF] Firmando PDF Fiscal con llave: " + key);
    }

    @Override
    public String getDocumentId() {
        return "DOC-FISCAL-001";
    }
}
