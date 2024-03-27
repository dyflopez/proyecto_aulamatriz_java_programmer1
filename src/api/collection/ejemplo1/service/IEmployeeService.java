package api.collection.ejemplo1.service;

import api.collection.ejemplo1.model.Employee;

public interface IEmployeeService {

    void  create (Employee employee);

    void showEmployees();

    void updateForm1(String id , Employee employee);

    Employee findById(String id);

    void updateForm2(Employee employee);
    void delete(String id);
    void disable (String id);

}
