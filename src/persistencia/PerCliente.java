/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import control.Cliente;
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
public class PerCliente {

    private Connection con;

    //Al crear un objeto de esta clase se abre la conexión con la base de datos
    public PerCliente() {
        con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servicios_asesoramiento", "root", "");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PerCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Operaciones CRUD
    
    public void crearCliente(Cliente cliente) {
        String query = "INSERT INTO clientes(id_cliente, nombre_cliente , calle_cliente , ciudad_cliente, tipo_asesor_personal, id_empleado, eliminar) VALUES (\"" 
                + cliente.getIdCliente() + "\", \"" 
                + cliente.getNombreCliente() + "\", \"" 
                + cliente.getCalleCliente() + "\", \"" 
                + cliente.getCiudadCliente() + "\", \"" 
                + cliente.getTipoAsesoria() + "\", \"" 
                + cliente.getIdEmpleadoAsesor() + "\", false)";
        try {
            Statement stm = con.createStatement();
            stm.executeUpdate(query);
            stm.close();
            JOptionPane.showMessageDialog(null, "Cliente Creado", "Operación exitosa", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(PerCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void actualizarCliente(Cliente cliente) {
        String query = "UPDATE clientes SET "
                + " nombre_cliente = \"" + cliente.getNombreCliente()
                + "\", calle_cliente = \"" + cliente.getCalleCliente() 
                + "\", ciudad_cliente  = \"" + cliente.getCiudadCliente()
                + "\", tipo_asesor_personal  = \"" + cliente.getTipoAsesoria()
                + "\", id_empleado  = \"" + cliente.getIdEmpleadoAsesor()
                + "\" WHERE id_cliente = \"" + cliente.getIdCliente() + "\"";
        try {
            Statement stm = con.createStatement();
            stm.executeUpdate(query);
            stm.close();
            JOptionPane.showMessageDialog(null, "Cliente actualizado", "Operación exitosa", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(PerCliente.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    public void borrarCliente(String id) {
        String query = "UPDATE clientes SET eliminar =  true  WHERE id_cliente = \"" + id + "\"";
        try {
            Statement stm = con.createStatement();
            stm.executeUpdate(query);
            stm.close();
            JOptionPane.showMessageDialog(null, "Cliente eliminado", "Operación exitosa", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(PerCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public DefaultTableModel informeClientes() {
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"ID CLIENTE", "NOMBRE", "DIRECCIÓN", "CIUDAD", "TIPO DE ASESORIA", "ASESOR"}, 0);
        String query = "SELECT * FROM clientes WHERE eliminar = false";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {                
                Object[] fila = new Object[]{
                    rs.getString("id_cliente"), 
                    rs.getString("nombre_cliente"), 
                    rs.getString("calle_cliente"), 
                    rs.getString("ciudad_cliente"), 
                    rs.getString("tipo_asesor_personal"), 
                    rs.getString("id_empleado"), 
                    };
                modelo.addRow(fila);
            }
            st.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(PerCliente.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(PerCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    public Cliente cargarUnCliente (String id) {
        Cliente cliente = new Cliente();
        String query = "SELECT * FROM clientes WHERE id_cliente = \"" + id + "\"";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                cliente.setIdCliente(id);
                cliente.setNombreCliente(rs.getString("nombre_cliente"));
                cliente.setCalleCliente(rs.getString("calle_cliente"));
                cliente.setCiudadCliente(rs.getString("ciudad_cliente"));
                cliente.setTipoAsesoria(rs.getString("tipo_asesor_personal"));
                cliente.setIdEmpleadoAsesor(rs.getString("id_empleado"));
                cliente.setEliminar(rs.getBoolean("eliminar"));
            }
            st.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(PerCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cliente;
    }
    
    //Verifica ids duplicadas
    public boolean idDuplicada (String id) {
        boolean duplicado = false;
        String query = "SELECT * FROM clientes WHERE id_cliente = \"" + id + "\"";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                duplicado = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PerCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return duplicado;
    }

    public void cerrarConexion() {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(PerCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
