package api.collection.ejemplo1.model;

public class Persona {
    private  String name;
    private  String lastname;
    private String document;
    private String address;
    private String phoneNumber;


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
}
