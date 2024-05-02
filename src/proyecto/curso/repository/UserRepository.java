package proyecto.curso.repository;

import proyecto.curso.config.ConnectionDB;
import proyecto.curso.model.UserEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    public void createForm1(UserEntity user){
        try{

            String query;

            ConnectionDB connectionDB = new ConnectionDB();

            Connection connection = connectionDB.ConnectionDB();

            Statement statement = connection.createStatement();

            query = "INSERT INTO  user ( name, lastname) value ( '" +
            user.getName() +"' , '" +
            user.getLastname() + "' );";

            int updated = statement.executeUpdate(query);
            // TODO cambiar a textBlock
            System.out.println("Se actualziaron "+ updated );

        }catch (Exception e){
            System.out.println(e.getCause()  + " " + e.getMessage());
        }
    }

    public void createForm2(UserEntity user){
        try{

            String query;

            ConnectionDB connectionDB = new ConnectionDB();

            Connection connection = connectionDB.ConnectionDB();

            query = "INSERT INTO  user ( name, lastname) value ( ? , ? )";

            PreparedStatement prepareStatement = connection.prepareStatement(query);

            prepareStatement.setString(1,user.getName());
            prepareStatement.setString(2,user.getLastname());

            int updated =  prepareStatement.executeUpdate();
            // TODO cambiar a textBlock
            System.out.println("Se actualziaron "+ updated );
        }catch (Exception e){
            System.out.println(e.getCause()  + " " + e.getMessage());
        }
    }


    public List<UserEntity> findAll(){
        List<UserEntity> userList = new ArrayList<>();
        try {


            String query;

            ConnectionDB connectionDB = new ConnectionDB();

            Connection connection = connectionDB.ConnectionDB();

            Statement statement = connection.createStatement();


            query = "SELECT * FROM  user";

           ResultSet resultSet =  statement.executeQuery(query);

           var meta = resultSet.getMetaData();

           var numColumns = meta.getColumnCount();

            while (resultSet.next()){

                userList.add(new UserEntity( resultSet.getInt("id") ,
                        resultSet.getString("name"),
                        resultSet.getString("lastname")));
            }


        }catch (Exception e){
            System.err.println(e.getCause() + " " + e.getMessage());
        }
        return userList;
    }

}
