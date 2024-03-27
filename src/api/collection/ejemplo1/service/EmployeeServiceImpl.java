package api.collection.ejemplo1.service;

import api.collection.ejemplo1.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements  IEmployeeService{

    private List<Employee> employeeList;

    public EmployeeServiceImpl() {
        this.employeeList = new ArrayList<>();
    }

    @Override
    public void create(Employee employee) {
        //TODO implementar validacion de usuario existente
        employeeList.add(employee);
    }

    @Override
    public void updateForm1(String id, Employee employee) {
        for (int i =0;i<employeeList.size();i++){
            if(employeeList.get(i).getId().equals(id)){
                employeeList.set(i,employee);
            }
        }
    }

    @Override
    public Employee findById(String id) {
        for(int i =0;i<employeeList.size();i++){
            return employeeList.get(i);
        }
        return  null;
    }

    @Override
    public void updateForm2(Employee employee) {
        for (int i =0;i<employeeList.size();i++){
            if(employeeList.get(i).getId().equals(employee.getId())){
                employeeList.set(i,employee);
            }
        }
    }

    @Override
    public void delete(String id) {
        for (int i =0;i<employeeList.size();i++){
            if(employeeList.get(i).getId().equals(id)){
                employeeList.remove(employeeList.get(i));
            }
        }
    }

    @Override
    public void disable(String id) {
        for (int i =0;i<employeeList.size();i++){
            if(employeeList.get(i).getId().equals(id)){
                employeeList.get(i).setActive(false);
            }
        }
    }

    public  void showEmployees(){
        if(employeeList.isEmpty()){
            System.out.println("list employees are empty");
            return;
        }

        for (Employee employee : employeeList){
            System.out.println("*******************");
            System.out.println(employee);
        }

    }
}
