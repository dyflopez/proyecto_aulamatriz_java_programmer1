package api.collection.ejemplo1.model;

import java.beans.Customizer;
import java.beans.PropertyChangeListener;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Persona implements Supplier,Predicate, Customizer {
    private  String name;
    private  String lastname;
    private String document;
    private String address;
    private String phoneNumber;
    private String estado;

    public int edad;



    public Persona(String name, String lastname, String document, String address, String phoneNumber) {
        this.name = name;
        this.lastname = lastname;
        this.document = document;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Persona() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", document='" + document + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public void setObject(Object bean) {

    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {

    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {

    }

    @Override
    public boolean test(Object o) {
        return false;
    }

    @Override
    public Object get() {
        return null;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
