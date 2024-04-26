package proyecto.curso.controller;

import proyecto.curso.model.UserEntity;
import proyecto.curso.service.impl.UserServiceImpl;

public class UserController {


    private UserServiceImpl userService = new UserServiceImpl();
    public void create1(UserEntity user){
            this.userService.create1(user);
    }
    public void create2(UserEntity user){
        this.userService.create2(user);
    }
    // TODO BORRAR
    public static void main(String[] args) {

        UserController controller = new UserController();

        controller.create1(new UserEntity(1,"Daniel" , "Florez"));

    }
}
