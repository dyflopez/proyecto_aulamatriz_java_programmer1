package proyecto.curso.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {
    private  String url = "jdbc:mysql://localhost:3306/";
    private  String password="AulaMatriz123";
    private  String user="root";

    private String dbName = "user_db";
    /**
     * Checked Exceptions : Son las que el compilador/java obliga a manejar
     * unChecked Exception : Son excepciones que ocurren en tiempo de ejecucion .
     *     NullPointerException
     */
    public  Connection ConnectionDB()   {
        try{
            Connection connection = DriverManager.getConnection(this.url+this.dbName,this.user,this.password);
            System.out.println("Se conecto correctamente");
            return connection;
        }catch (Exception e){
            System.err.println(e.getCause() + " " + e.getMessage());
            return  null;
        }finally {
            System.out.println("Se  ejecuto metodo para la conexion con la base de datos");
        }
    }
}
