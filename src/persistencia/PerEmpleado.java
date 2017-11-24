/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import control.Empleado;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jhon
 */
public class PerEmpleado {

    private Connection con;

    //Al crear un objeto de esta clase se abre la conexión con la base de datos
    public PerEmpleado() {
        con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servicios_asesoramiento", "root", "");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PerEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    
    // Operaciones CRUD
    
    public void crearEmpleado(Empleado empleado) {
        String query = "INSERT INTO empleado(id_empleado, nombre_empleado, teléfono_empleado, fecha_contratacion_empleado, eliminar) VALUES (\"" 
                + empleado.getIdEmpleado() + "\", \"" 
                + empleado.getNombreEmpleado() + "\", \"" 
                + empleado.getTelefonoEmpleado() + "\", \"" 
                + empleado.getFechaContratoEmpleado() + "\", false)";
        try {
            Statement stm = con.createStatement();
            stm.executeUpdate(query);
            if (empleado.getIdJefe() != null) {
                query = "INSERT INTO subordinado(id_jefe, id_empleado) VALUES (" + empleado.getIdJefe() + ", \"" + empleado.getIdEmpleado() + "\")";
                stm.executeUpdate(query);
            }
            stm.close();
            JOptionPane.showMessageDialog(null, "Empleado Creado", "Operación exitosa", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(PerEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void actualizarEmpleado(Empleado cliente) {
        String query = "UPDATE empleado SET "
                + " nombre_empleado = \"" + cliente.getNombreEmpleado()
                + "\", teléfono_empleado = \"" + cliente.getTelefonoEmpleado() 
                + "\", fecha_contratacion_empleado  = \"" + cliente.getFechaContratoEmpleado()
                + "\" WHERE id_empleado = \"" + cliente.getIdEmpleado() + "\"";
        try {
            Statement stm = con.createStatement();
            stm.executeUpdate(query);
            if (cliente.getIdJefe() != null) {
                query = "UPDATE subordinado SET id_jefe = \"" + cliente.getIdJefe() + "\" WHERE id_empleado = \"" + cliente.getIdEmpleado() + "\"";
                stm.executeUpdate(query);
            }
            stm.close();
            JOptionPane.showMessageDialog(null, "Empleado actualizado", "Operación exitosa", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(PerEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    public void borrarEmpleado(String id) {
        String query = "UPDATE empleado SET eliminar =  true  WHERE id_empleado = \"" + id + "\"";
        try {
            Statement stm = con.createStatement();
            stm.executeUpdate(query);
            stm.close();
            JOptionPane.showMessageDialog(null, "Empleado eliminado", "Operación exitosa", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(PerEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public DefaultTableModel informeEmpleados() {
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"ID EMPLEADO", "NOMBRE", "TELÉFONO", "FECHA DE CONTRATO", "ID JEFE"}, 0);
        String query = "SELECT * FROM empleado LEFT JOIN subordinado ON empleado.id_empleado = subordinado.id_empleado WHERE eliminar = false ORDER BY empleado.id_empleado";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {                
                Object[] fila = new Object[]{
                    rs.getString("id_empleado"), 
                    rs.getString("nombre_empleado"), 
                    rs.getString("teléfono_empleado"), 
                    rs.getString("fecha_contratacion_empleado"), 
                    rs.getString("id_jefe")};
                modelo.addRow(fila);
            }
            st.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(PerEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;
    }
    
    //Fin operaciones CRUD
    
    //Cargar Información
    
    public LinkedList idEmpleados () {
        LinkedList lista = new LinkedList();
        String query = "SELECT id_empleado FROM empleado WHERE eliminar = false";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {                
                lista.add(rs.getString("id_empleado"));
            }
            st.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(PerEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    public Empleado cargarUnEmpleado (String id) {
        Empleado empleado = new Empleado();
        String query = "SELECT * FROM empleado LEFT JOIN subordinado ON empleado.id_empleado = subordinado.id_empleado WHERE empleado.id_empleado = \"" + id + "\"";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                empleado.setIdEmpleado(id);
                empleado.setNombreEmpleado(rs.getString("nombre_empleado"));
                empleado.setTelefonoEmpleado(rs.getString("teléfono_empleado"));
                empleado.setFechaContratoEmpleado(rs.getString("fecha_contratacion_empleado"));
                empleado.setIdJefe(rs.getString("id_jefe"));
                empleado.setEliminar(rs.getBoolean("eliminar"));
                
            }
            st.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(PerEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return empleado;
    }
    
    public DefaultTableModel listaSubordinados (String id) {
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"Nombres subordinados"}, 0);
        try {
            CallableStatement proAmacenado = con.prepareCall("{call Lista_subordinados(?)}");
            proAmacenado.setString(1, id);
            ResultSet rs = proAmacenado.executeQuery();
            while (rs.next()) {                
                modelo.addRow(new Object[]{ rs.getString("nombre_empleado")});
            }
            rs.close();
            proAmacenado.close();
        } catch (SQLException ex) {
            Logger.getLogger(PerEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;
    }
    
    public DefaultTableModel empleadosCliente () {
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"ID EMPLEADO", "NOMBRE DEL EMPLEADO", "ID CLIENTE", "NOMBRE DEL CLIENTE", "CIUDAD DEL CLIENTE"}, 0);
        try {
            CallableStatement proAmacenado = con.prepareCall("{call Lista_Empleado_Cliente}");
            ResultSet rs = proAmacenado.executeQuery();
            while (rs.next()) {                
                Object[] fila = new Object[]{
                    rs.getString("id_empleado"), 
                    rs.getString("nombre_empleado"), 
                    rs.getString("id_cliente"), 
                    rs.getString("nombre_cliente"), 
                    rs.getString("ciudad_cliente")};
                modelo.addRow(fila);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PerEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;
    }
    
    public String mesesTrabajados (String id) {
        String meses = "";
        try {
            CallableStatement proAmacenado = con.prepareCall("{call Antiguedad_Meses(?)}");
            proAmacenado.setString(1, id);
            ResultSet rs = proAmacenado.executeQuery();
            if (rs.next()) {
                meses = "" + rs.getInt("meses");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PerEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (meses == null) {
            meses = "No tiene fecha definida para calcular el dato";
        }
        return meses;
    }
    
    public void cerrarConexion () {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(PerEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
