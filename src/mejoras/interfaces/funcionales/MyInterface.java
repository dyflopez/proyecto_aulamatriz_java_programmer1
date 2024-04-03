package mejoras.interfaces.funcionales;

public interface MyInterface {
    default void miMetodo(){
        System.out.println("metodo defaul de la interfaz");
    }

    default void miMetod1o(){
        System.out.println("metodo defaul de la interfaz");
    }

    static void metodoStatico(){
        System.out.println("metodo estatico");
    }
}
