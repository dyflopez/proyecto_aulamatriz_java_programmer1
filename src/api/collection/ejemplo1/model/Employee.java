package api.collection.ejemplo1.model;

public class Employee extends  Persona{

    private String id;
    private double salary;

    private String cargo;
    private boolean isActive;

    public Employee(String name, String lastname, String document, String address, String phoneNumber, String id, double salary, String cargo) {
        super(name, lastname, document, address, phoneNumber);
        this.id = id;
        this.salary = salary;
        this.cargo = cargo;
        this.isActive = true;
    }

    public Employee() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isActive() {
        return isActive;
    }


    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        String employee = super.toString();
        return employee + "Employee{" +
                "id='" + id + '\'' +
                ", salary=" + salary +
                ", cargo='" + cargo + '\'' +
                ", isActive=" + isActive +
                '}';
    }


}
