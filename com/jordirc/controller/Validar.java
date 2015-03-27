package com.jordirc.controller;

/**
 * Created by LynxBcn on 22/03/2015.
 */

public class Validar {
    // Validación de si una cadena es un número
    public static boolean isNumeric(String cadena){
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe){
            return false;
        }
    }
}