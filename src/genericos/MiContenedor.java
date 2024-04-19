package genericos;

public class MiContenedor <T> implements  Contendor<T>{

    private  T objeto;
    @Override
    public T obtener() {
        return null;
    }

    @Override
    public void guarrdar(T objeto) {
        this.objeto=objeto;
    }
}
