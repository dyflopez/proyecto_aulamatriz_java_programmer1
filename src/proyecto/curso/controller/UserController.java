package proyecto.curso.controller;

import org.w3c.dom.ls.LSOutput;
import proyecto.curso.handler.exception.MyCustomException;
import proyecto.curso.model.UserEntity;
import proyecto.curso.service.impl.AdminTablesImpl;
import proyecto.curso.service.impl.UserServiceImpl;

import javax.swing.*;
import java.sql.SQLException;
import java.util.List;

public class UserController {


    private UserServiceImpl userService = new UserServiceImpl();
    public void create1(UserEntity user) throws MyCustomException {
            this.userService.create1(user);
    }
    public void create2(UserEntity user){
        this.userService.create2(user);
    }

    public List<UserEntity> getAll(){
        return this.userService.findAll();
    }
    // TODO BORRAR
    public static void main(String[] args) throws SQLException, MyCustomException {

        AdminTablesImpl adminTables = new AdminTablesImpl();

       // adminTables.createProduct();

        var user1 = new UserEntity(1,"a" , "Florez");




        UserController controller = null;//= new UserController();
        controller = (controller != null) ? controller  : new UserController();
        if((controller != null)){
            controller = controller;
        }else{
            controller = new UserController();
            JOptionPane.showInputDialog("hols");
        }
try {

    assert controller != null : "la cadena no puede ser null";
    //validacion ? "Si es verdadero devuelce esto": "si es falso devuelve es"
}catch (Exception e){
    System.out.println(e.getMessage());
}




        create(controller,user1);




     //controller.create1(new UserEntity(1,"Juanca" , "Florez"));


        controller
                .getAll()
                .stream()
                .map(user -> user.getLastname() + " " + user.getName())
                .forEach(System.out::println);
    }

    public static  void create(UserController controller, UserEntity newUser ) throws MyCustomException {
        try {
            controller.create1(newUser);
        }catch (IllegalArgumentException e){
            newUser.setId(0);
            create(controller,newUser);
        }catch (MyCustomException e){
            System.err.println(e.getMessage());
        }
    }
}
