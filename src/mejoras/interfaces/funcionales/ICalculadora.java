package mejoras.interfaces.funcionales;

@FunctionalInterface
public interface ICalculadora {
    int operacion(int valor1, int valor2);

    default void showMessage(){
        System.out.println("llamado desde metodo default");
    }
    static void showMessageStatic(int valor){
        System.out.println("El resultado de la operacion es :" + valor);
    }
}
