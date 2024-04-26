package proyecto.curso.service.impl;

import proyecto.curso.model.UserEntity;
import proyecto.curso.repository.UserRepository;
import proyecto.curso.service.IUserService;

import java.util.List;

public class UserServiceImpl implements IUserService {

    private UserRepository userRepository = new UserRepository();

    @Override
    public void create1(UserEntity user) {
        this.userRepository.createForm1(user);
    }

    @Override
    public void create2(UserEntity user) {
        this.userRepository.createForm2(user);
    }

    @Override
    public List<UserEntity> findAll() {
        return null;
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
