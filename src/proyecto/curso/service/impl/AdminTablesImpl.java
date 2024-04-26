package proyecto.curso.service.impl;

import proyecto.curso.config.ConnectionDB;
import proyecto.curso.migrations.CreateTableProduct;
import proyecto.curso.service.IAdminTables;

import java.security.PrivateKey;
import java.sql.SQLException;
import java.sql.Statement;

public class AdminTablesImpl implements IAdminTables {

    private CreateTableProduct createTableProduct;

    ConnectionDB connectionDB  ;

    @Override
    public void createProduct() throws SQLException {

        connectionDB  = new ConnectionDB();

        var connection = connectionDB.ConnectionDB();
            try{
                this.createTableProduct.up(connection.createStatement());
                connection.close();
            }catch (Exception e)
            {
                System.out.println(e.getCause() + " " + e.getMessage());
            }finally {
                connection.close();
            }
    }
}
