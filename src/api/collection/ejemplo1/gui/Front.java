package api.collection.ejemplo1.gui;

import api.collection.ejemplo1.model.Employee;

import java.util.Scanner;

public class Front {

    static Scanner inputValue = new Scanner(System.in);
    public static int menu(){
        try{
            System.out.println("""
                1. create
                2. show list
                3. update
                4. update method 2
                5. delete employee
                6. disable
                7. exit
                """);

            //TODO Ajustar el codigo como tarea
            return inputValue.nextInt();
        }catch (Exception e){
            System.out.println("Invalid option, please try again");
            menu();
            return 0;
        }
    }
    public static Employee RequestEmployeeInformation(){

        Employee employee  = new Employee();

        //TODO Validar que los datos no sean incorrectos
        System.out.println("type name of employee");
        employee.setName(inputValue.next());
        System.out.println("type lastname of employee");
        employee.setLastname(inputValue.next());
        System.out.println("type document of employee");
        employee.setDocument(inputValue.next());
        System.out.println("type address of employee");
        employee.setAddress(inputValue.next());
        System.out.println("type phoneNumber of employee");
        employee.setPhoneNumber(inputValue.next());
        System.out.println("type id of employee");
        employee.setId(inputValue.next());
        System.out.println("type salary of employee");
        employee.setSalary(inputValue.nextDouble());
        System.out.println("type cargo of employee");
        employee.setCargo(inputValue.next());

        return employee;
    }

    public static String inputId(){
        System.out.println("type id of employee");
        return inputValue.next();
    }

}
