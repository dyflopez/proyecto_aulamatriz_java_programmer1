package proyecto.curso.service.impl;

import proyecto.curso.handler.exception.MyCustomException;
import proyecto.curso.model.UserEntity;
import proyecto.curso.repository.UserRepository;
import proyecto.curso.service.IUserService;

import java.util.List;

public class UserServiceImpl implements IUserService {

    private UserRepository userRepository = new UserRepository();

    @Override
    public void create1(UserEntity user) throws MyCustomException {

        int tamanoName = user.getName().length();

        if (user.getId() !=0) {
            throw new IllegalArgumentException ("El id no puede tener ningun valor");
        }
        if(tamanoName<3){
            throw new MyCustomException("El nombre de la persona no puede ser menor a 3 caracteres");
        }


        this.userRepository.createForm1(user);

    }

    @Override
    public void create2(UserEntity user) {
        this.userRepository.createForm2(user);
    }

    @Override
    public List<UserEntity> findAll() {
        return this.userRepository.findAll();
    }

    @Override
    public UserEntity findById(int id) {
        return null;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public int update(int id, UserEntity user) {
        return 0;
    }
}
