package edu.cotarelo.dao.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.NamingException;

/**
 * Esta clase proporciona métodos para gestionar la conexión a la base de datos MySQL.
 */
public class MySQLConexionDAO {

    private Connection connection = null;

    /**
     * Abre la conexión a la base de datos MySQL.
     *
     * @param context Objeto Context necesario para abrir la conexión.
     * @return true si la conexión se abre con éxito, false en caso contrario.
     * @throws NamingException Si hay un error en la búsqueda o resolución del nombre en el contexto.
     * @throws ClassNotFoundException Si la clase del controlador JDBC no se encuentra.
     */
    public boolean abreConexion(Context context) throws NamingException, ClassNotFoundException {
        boolean salida = false;
        try {
            // Cargar el controlador JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establecer la conexión a la base de datos MySQL
            //  this.connection = DriverManager.getConnection("jdbc:mysql://172.20.52.14:3306/dad2", "root", "abc123.");
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dad2", "root", "abc123.");
            salida = true;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return salida;
    }

    /**
     * Cierra la conexión a la base de datos y el PreparedStatement proporcionado.
     *
     * @param ps El PreparedStatement a cerrar.
     */
    public void cierraConexion(PreparedStatement ps) {
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        try {
            // Cerrar la conexión si no está cerrada
            if (this.connection != null && !this.connection.isClosed()) {
                try {
                    this.connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Crea y devuelve un objeto PreparedStatement para la consulta SQL proporcionada.
     *
     * @param string La consulta SQL.
     * @return PreparedStatement para la consulta SQL proporcionada.
     */
    public PreparedStatement prepareStatement(String string) {
        // Implementación actual devuelve siempre null, modificar según las necesidades específicas.
        return null;
    }

    /**
     * Crea y devuelve un objeto PreparedStatement para la consulta SQL proporcionada con opciones adicionales.
     *
     * @param string La consulta SQL.
     * @param num    Opciones adicionales para la creación del PreparedStatement.
     * @return PreparedStatement para la consulta SQL proporcionada con opciones adicionales.
     * @throws SQLException Si hay un error al crear el PreparedStatement.
     */
    public PreparedStatement pStatementGK(String string, int num) throws SQLException {
        return this.connection.prepareStatement(string, num);
    }

    /**
     * Crea y devuelve un objeto PreparedStatement para la consulta SQL proporcionada.
     *
     * @param string La consulta SQL.
     * @return PreparedStatement para la consulta SQL proporcionada.
     * @throws SQLException Si hay un error al crear el PreparedStatement.
     */
    public PreparedStatement pStatement(String string) throws SQLException {
        return this.connection.prepareStatement(string);
    }

}
