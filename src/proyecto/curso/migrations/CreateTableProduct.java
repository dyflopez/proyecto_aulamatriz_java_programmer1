package proyecto.curso.migrations;

import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableProduct {


    public void up(Statement statement) throws SQLException {

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
            String createTableUser ="CREATE TABLE user ( \n "+
                    "id BIGINT UNSIGNED AUTO_INCREMENT PRIMARY KEY , \n"+
                    "name varchar(20),  \n "+
                    "lastname varchar(20) );";

            statement.execute(createTableUser);
    }
}
