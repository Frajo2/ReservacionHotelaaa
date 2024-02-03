//Para ver el programa entrar al link https://reservacionhotelvad-1706274580796.azurewebsites.net/my-view
package com.example.application.views.myview;

import java.lang.annotation.Documented;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Reserva {

    private String Nombre;
    private String Cedula;
    private String NoCel;
    private String Correo;
    private LocalDate Ingreso;
    private LocalDate Salida;
    private String TipoHab;

    public Reserva() {
    }

    public Reserva(String nombre, String cedula, String noCel, String correo, LocalDate ingreso, LocalDate salida, String tipoHab) {
        Nombre = nombre;
        Cedula = cedula;
        NoCel = noCel;
        Correo = correo;
        Ingreso = ingreso;
        Salida = salida;
        TipoHab = tipoHab;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula() {

    }

    public String getNoCel() {
        return NoCel;
    }

    public void setNoCel(String noCel) {
        NoCel = noCel;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public LocalDate getIngreso() {
        return Ingreso;
    }

    public void setIngreso(LocalDate ingreso) {
        Ingreso = ingreso;
    }

    public LocalDate getSalida() {
        return Salida;
    }

    public void setSalida(LocalDate salida) {
        Salida = salida;
    }

    public String getTipoHab() {
        return TipoHab;
    }

    public void setTipoHab(String tipoHab) {
        TipoHab = tipoHab;
    }
    public static List<Reserva> reserva= new ArrayList<>();
}
