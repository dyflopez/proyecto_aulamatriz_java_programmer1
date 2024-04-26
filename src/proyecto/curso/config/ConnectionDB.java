package proyecto.curso.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {
    private  String url = "jdbc:mysql://aulamatriz-db.cnjpj1xnrslk.us-east-1.rds.amazonaws.com:3306/";
    private  String password="aulamatriz1234";
    private  String user="admin";

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
