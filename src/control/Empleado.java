/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author Jhon
 */
public class Empleado {
    private String idEmpleado; 
    private String nombreEmpleado; 
    private String telefonoEmpleado; 
    private String antiguedadEmpleado; 
    private String fachaContratoEmpleado;
    private String idJefe;
    private boolean eliminar;

    public Empleado() {
    }

    public Empleado(String idEmpleado, String nombreEmpleado, String telefonoEmpleado, String antiguedadEmpleado, String fachaContratoEmpleado, String idJefe, boolean eliminar) {
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.telefonoEmpleado = telefonoEmpleado;
        this.antiguedadEmpleado = antiguedadEmpleado;
        this.fachaContratoEmpleado = fachaContratoEmpleado;
        this.idJefe = idJefe;
        this.eliminar = eliminar;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getTelefonoEmpleado() {
        return telefonoEmpleado;
    }

    public void setTelefonoEmpleado(String telefonoEmpleado) {
        this.telefonoEmpleado = telefonoEmpleado;
    }

    public String getAntiguedadEmpleado() {
        return antiguedadEmpleado;
    }

    public void setAntiguedadEmpleado(String antiguedadEmpleado) {
        this.antiguedadEmpleado = antiguedadEmpleado;
    }

    public String getFechaContratoEmpleado() {
        return fachaContratoEmpleado;
    }

    public void setFechaContratoEmpleado(String fachaContratoEmpleado) {
        this.fachaContratoEmpleado = fachaContratoEmpleado;
    }

    public String getIdJefe() {
        return idJefe;
    }

    public void setIdJefe(String idJefe) {
        this.idJefe = idJefe;
    }

    public boolean isEliminar() {
        return eliminar;
    }

    public void setEliminar(boolean eliminar) {
        this.eliminar = eliminar;
    }
}
