package mejoras.interfaces;

public class MainMejorasI {
    public static void main(String[] args) {
        /**
         *  Las interfaces pueden tener un metodo default
         *  Las interfaces pueden tener metodos estaticicos
         *  que se pueden invocar utilizando el nombre de la interfaz
         *   (estos metoso no son implementados solo se usan)
         */
        //MyInterface.metodoStatico();

        MyInterface myInterface = new MyInterface() {};
        myInterface.miMetodo();

        EjemploInterfaz ejemploInterfaz = new EjemploInterfaz();


    }
}
