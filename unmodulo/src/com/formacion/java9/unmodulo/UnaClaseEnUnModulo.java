package com.formacion.java9.unmodulo;

import otra.ruta.de.paquetes.Alumno;

import java.util.logging.Logger;

public class UnaClaseEnUnModulo {

    private static final Logger logger = Logger.getLogger("UnaClaseEnUnModulo");

    public static void main(String[] args) {
        Alumno a = new Alumno("Jorge", "Fernandez Alvarez");
        logger.info(a.getNombreCompleto());
    }
}
