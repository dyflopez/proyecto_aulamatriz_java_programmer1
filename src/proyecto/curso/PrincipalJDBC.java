package proyecto.curso;

import proyecto.curso.config.ConnectionDB;

import java.sql.SQLException;
import java.sql.Statement;

public class PrincipalJDBC {
    public static void main(String[] args) throws SQLException {

        //conectarnos con la base
        ConnectionDB connectionDB  = new ConnectionDB();
        var connection = connectionDB.ConnectionDB();
        System.out.println("Ejecutar");
        Statement  statement = connection.createStatement();

        String createTableUser ="CREATE TABLE user ( \n "+
                "id BIGINT UNSIGNED AUTO_INCREMENT PRIMARY KEY , \n"+
                "name varchar(20),  \n "+
                "lastname varchar(20) );";



        /**
         *
         * createStatemet  me ayuda crear el Statemet
         *
         *  executeQuery(String sql)  :  Ejecuta una consulta de SQL que devuelve un conjunto de resultados
         *  ExecuteUpdate(String sql) :  Ejecuta una consulta SQL que actualiza la base de de datos y devuelve
         *  el numero de filas afectadas
         *  Execute(String sql): Ejecuta una consulta SQL , Puede realizar un proceso de seleccion , acutalizacion
         *  DML DDL
         */
        int valor = statement.executeUpdate(createTableUser);

        System.out.println(valor);
    }
}
