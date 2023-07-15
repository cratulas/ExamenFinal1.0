
package com.pgy.business;

/**
 *
 * @author mauriciomora
 */
public class DatosUsuario {
    private static String nombreCompleto;
    private static int saldo;
    private static int numero;

    public static String getNombreCompleto() {
        return nombreCompleto;
    }

    public static void setNombreCompleto(String nombreCompleto) {
        DatosUsuario.nombreCompleto = nombreCompleto;
    }

    public static int getSaldo() {
        return saldo;
    }

    public static void setSaldo(int saldo) {
        DatosUsuario.saldo = saldo;
    }
    
    public static int getNumero() {
        return numero;
    }
    
    public static void setNumero(int cuenta) {
        DatosUsuario.numero = cuenta;
    }
    
}
