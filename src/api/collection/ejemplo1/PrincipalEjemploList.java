package api.collection.ejemplo1;

import api.collection.ejemplo1.gui.Front;
import api.collection.ejemplo1.model.Employee;
import api.collection.ejemplo1.service.EmployeeServiceImpl;

import java.util.Scanner;

public class PrincipalEjemploList {

    /**
     * una comañia requiere un sistema para administrar sus empleados ,
     * el sistema debe :
     *
     * agregar empelado
     * Listar empelado
     * Actualizar empelado
     * mostrar empleado
     * eliminar todos los empledos
     * filtrar empelado por sueldo menor a el salario de base
     * filtrar empleado por sueldo mayor al indicado
     * simular aumento de sueldo al % que indique el ususuario
     */
    public static void main(String[] args) {

        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        String id;
        double salary;
        int option;
        do{
            option=Front.menu();
            switch (option){
                case 1:
                    //llamar al metodo crear de la clase EmployeeServiceImpl
                    Employee newEmployee =Front.RequestEmployeeInformation();
                    employeeService.create(newEmployee);
                    break;
                case 2:
                    employeeService.showEmployees();
                    break;
                case 3:

                     id = Front.inputId();

                    Employee updatedEmployee =Front.RequestEmployeeInformation();

                    employeeService.updateForm1(id,updatedEmployee);

                    break;
                case 4:
                    id = Front.inputId();

                    Employee employee = employeeService.findById(id);
                    if(employee !=null){
                        employeeService.updateForm2(employee);
                    }else{
                        System.out.println("employee does not exist");
                    }
                    break;
                case 5:
                    id = Front.inputId();
                    employeeService.delete(id);
                    break;
                case 6:
                    id = Front.inputId();
                    employeeService.disable(id);
                    break;
                case 7:
                    salary = Front.inputSalaryRate();
                   var listEmployee=  employeeService.getSalaryLowLimit(salary);
                    System.out.println(listEmployee);
                    break;
            }
        }while (option !=8);
        System.out.println("end code");
    }

}
