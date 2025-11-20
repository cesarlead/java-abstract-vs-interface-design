package com.cesarlead.javaabstractvsinterfacedesign.core;

public interface Signable {
    /**
     * Aplica una firma criptográfica al documento.
     * @param key La llave privada para firmar.
     */
    void applyDigitalSignature(String key);

    /**
     * Identificador único para rastreo en logs.
     */
    String getDocumentId();
}
