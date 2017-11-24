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
public class Cliente {
    private String idCliente; 
    private String nombreCliente; 
    private String calleCliente; 
    private String ciudadCliente; 
    private String tipoAsesoria; 
    private String idEmpleadoAsesor;
    private boolean eliminar;

    public Cliente() {
    }

    public Cliente(String idCliente, String nombreCliente, String calleCliente, String ciudadCliente, String tipoAsesoria, String idEmpleadoAsesor, boolean eliminar) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.calleCliente = calleCliente;
        this.ciudadCliente = ciudadCliente;
        this.tipoAsesoria = tipoAsesoria;
        this.idEmpleadoAsesor = idEmpleadoAsesor;
        this.eliminar = eliminar;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCalleCliente() {
        return calleCliente;
    }

    public void setCalleCliente(String calleCliente) {
        this.calleCliente = calleCliente;
    }

    public String getCiudadCliente() {
        return ciudadCliente;
    }

    public void setCiudadCliente(String ciudadCliente) {
        this.ciudadCliente = ciudadCliente;
    }

    public String getTipoAsesoria() {
        return tipoAsesoria;
    }

    public void setTipoAsesoria(String tipoAsesoria) {
        this.tipoAsesoria = tipoAsesoria;
    }

    public String getIdEmpleadoAsesor() {
        return idEmpleadoAsesor;
    }

    public void setIdEmpleadoAsesor(String idEmpleadoAsesor) {
        this.idEmpleadoAsesor = idEmpleadoAsesor;
    }

    public boolean isEliminar() {
        return eliminar;
    }

    public void setEliminar(boolean eliminar) {
        this.eliminar = eliminar;
    }
}
