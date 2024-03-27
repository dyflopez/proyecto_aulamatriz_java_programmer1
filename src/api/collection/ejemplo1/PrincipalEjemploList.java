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
     * filtrar empelado por sueldo menor
     * filtrar empleado por sueldo mayor
     * simular aumento de sueldo
     */
    public static void main(String[] args) {

        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        String id;
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
            }
        }while (option !=7);
        System.out.println("end code");
    }

}
