package proyecto.curso.service;

import proyecto.curso.handler.exception.MyCustomException;
import proyecto.curso.model.UserEntity;

import java.util.List;

public interface IUserService {

    public void  create1(UserEntity user) throws MyCustomException;
    public void  create2(UserEntity user) ;
    public List<UserEntity> findAll() ;
    public UserEntity  findById(int id) ;
    public int  delete(int id) ;
    public int  update(int id , UserEntity user) ;

}
